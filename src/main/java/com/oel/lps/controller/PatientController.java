package com.oel.lps.controller;

import com.oel.lps.bean.Patient;
import com.oel.lps.service.PatientService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
}
