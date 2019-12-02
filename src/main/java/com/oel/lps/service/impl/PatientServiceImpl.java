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


        return 0;
    }

    @Override
    public List<Patient> queryPatientById(String id) {
        return patientMapoper.queryPatientById(id);
    }


}
