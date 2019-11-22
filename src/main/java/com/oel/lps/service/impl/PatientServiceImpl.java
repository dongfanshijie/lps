package com.oel.lps.service.impl;

import com.oel.lps.bean.Patient;
import com.oel.lps.mapper.PatientMapoper;
import com.oel.lps.service.PatientService;
import com.oel.lps.utils.OrderCodeFactory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: lps
 * @description: PatientServiceImpl
 * @author: ws
 * @create: 2019-11-20 13:49
 **/
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientMapoper patientMapoper;

    /**
     * @Author ws
     * @Description //TODO
     * @Date  2019/11/20
     * @Param []
    * @return java.util.List<com.oel.lps.bean.Patient>
     *     查询患者信息
    **/
    @Override
    public List<Patient> queryPatient() {
        return patientMapoper.queryPatient();
    }

    /**
     * @Author ws
     * @Description //TODO
     * @Date  2019/11/20
     * @Param [patient]
    * @return java.util.List<com.oel.lps.bean.Patient>
     *   根据条件查询
    **/
    @Override
    public List<Patient> queryPatientName(Patient patient) {
        Map map = new HashMap();
        map.put("patientId", patient.getPatientId());
        map.put("patientName", patient.getPatientName());
        map.put("idCardNo", patient.getIdCardNo());
        return patientMapoper.queryPatientName(map);
    }

    /**
     * @Author ws
     * @Description //TODO
     * @Date  2019/11/21
     * @Param [patient]
    * @return java.lang.Void
     * 新增患者
    **/
    @Override
    public int addPatient(Patient patient) {
      //生成标号
        String equipmentNo =OrderCodeFactory.getDateTime();
        patient.setPatientId(equipmentNo);

        //测试添加数据
        patient.setPatientName("患者李");
        patient.setPatientSex("男");
        patient.setIdCardNo("11022819545445646556");
        patient.setPatientDate("1992-10-11");
        patient.setPatientAge(34);
        patient.setNation("汉族");
        patient.setFaith("基督");
        patient.setEducation("大专");
        patient.setPhoneNumber("138465484848");
        patient.setHeight(158);
        patient.setWeight("58");
        patient.setHandHabit("右手");
        patient.setMaritaStatus("已婚");
        patient.setFamilyRanking(4);
        patient.setChildrenNumber(2);
        patient.setChildrenSituation("在身边");
        patient.setParentSituation("身体好");
        patient.setEducationMode("父亲");
        patient.setShortNamw("天通苑");
        patient.setShortCode(000);
        patient.setDetailedAddress("天通苑西区454号");
        patient.setSource("门诊");
        patient.setSourceDepartment("疼痛科");
        patient.setSourceDoctor("好大夫");
        patient.setEstingItems(1);
        //patient.setSpecialty(1);
        //patient.setWhole(1);
        patient.setTreatmentProject(1);
        patient.setProcess("测试45545");

        //添加系统时间
        SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String time = format0.format(date.getTime());
        patient.setCreationTime(time);
        //初始化状态
        patient.setState(0);


        //通过身份证严重新增患者是否重复
        //获取身份证号码
        String IdCardNo =patient.getIdCardNo();
        List  CardNo = patientMapoper.queryIdCardNo(IdCardNo);
        if(CardNo.size()==1){
            return -1;

        }else {
            //新增患者信息
            patientMapoper.addPatient(patient);
        }


//        //根据患者等级治疗类型创建治疗表 1=添加 0=为添加
//        //获取用户编号
//        String patientId = patient.getPatientId();
//        if (patient.getEstingItems()!=null&&patient.getEstingItems()==1){
//
//            patientMapoper.addLScreeningChiefcomplaint(patientId);
//
//        } if (patient.getSpecialty()!=null&& patient.getSpecialty()==1 ){
//
//               System.out.println("专科");
//
//        } if (patient.getWhole()!=null&&patient.getWhole()==1){
//
//            System.out.println("整体");
//
//        }
        return 0;
    }

    @Override
    public List<Patient> queryPatientById(String id) {
        return patientMapoper.queryPatientById(id);
    }


}
