package com.oel.lps.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.oel.lps.bean.ChiefComplaint;
import com.oel.lps.bean.Patient;
import com.oel.lps.service.PatientService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

import static com.oel.lps.utils.HttpClientUtil.get;

/**
 * @program: lps
 * @description: PatientController
 * @author: ws
 * @create: 2019-11-20 13:45
 **/
@Controller
public class PatientController {

    @Autowired
    private PatientService patientService;

    /**
     * @Author ws
     * @Description //TODO
     * @Date  2019/11/20
     * @Param Patient
    * @return List
     * 查询患者基本信息
    **/
    @RequestMapping("queryPatient")
    @ResponseBody
    public List<Patient> queryPatient(Patient patient){
        //根据条件查询
       // patient.setPatientName("小");
        if (StringUtils.isNoneBlank(patient.getPatientId())
                ||StringUtils.isNoneBlank(patient.getPatientName())||StringUtils.isNoneBlank(patient.getIdCardNo())){
            return patientService.queryPatientName(patient);
        }
        //查询患者基本信息
        return patientService.queryPatient();
    }

    /**
     * @Author ws
     * @Description //TODO
     * @Date  2019/11/21
     * @Param Patient
    * @return Void
     * 新增患者
     * 返回 -1 表示该身份证号码已经等级 无法新增
    **/
    @RequestMapping("addPatient")
    @ResponseBody
    public int addPatient(Patient patient){

        try {
            return patientService.addPatient(patient);
        }catch (Exception e){
            e.printStackTrace();
        }

        return 0;
    }

    /**
     * @Author ws
     * @Description //TODO
     * @Date  2019/11/22
     * @Param [patient]
    * @return com.alibaba.fastjson.JSONObject
     * 请求身份证读卡器接口 返回给前台用户基本数据
    **/
    @RequestMapping("queryInformation")
    @ResponseBody
    public JSONObject queryInformation(){

        String url = "http://127.0.0.1:8080/api/ReadMsg";
        HashMap<String, Object> params = new HashMap<>();
        String string = get(url, params );
        JSONObject repdate = JSON.parseObject(string);
//        //获取姓名
//        String name = repdate.getString("name");
//       //获取性别
//        String sex = repdate.getString("sex");
//        //获取民族
//        String nation = repdate.getString("nation");
//        //获取出生日期
//        String born = repdate.getString("born");
//        //获取地址
//        String address = repdate.getString("address");
//        //获取身份证号码
//        String cardno = repdate.getString("cardno");

        return repdate;
    }



    /**
     * @Author ws
     * @Description //TODO
     * @Date  2019/11/22
     * @Param [id]
     * @return void
     * 根据用户id回显患者信息
     **/
    @RequestMapping("queryPatientById")
    @ResponseBody
    public List<Patient> queryPatientById(String id) {

        if (StringUtils.isNoneBlank(id)){
            List<Patient> list = patientService.queryPatientById(id);
            return list;

        }

        return null;
    }
}
