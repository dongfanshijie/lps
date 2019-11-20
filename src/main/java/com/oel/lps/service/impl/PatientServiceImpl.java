package com.oel.lps.service.impl;

import com.oel.lps.bean.Patient;
import com.oel.lps.mapper.PatientMapoper;
import com.oel.lps.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
