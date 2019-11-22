package com.oel.lps.mapper;


import com.oel.lps.bean.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PatientMapoper {

    List<Patient> queryPatient();


    List<Patient> queryPatientName(Map map);

    int addPatient(Patient patient);

    void addLScreeningChiefcomplaint(String patientId);

    List queryIdCardNo(String idCardNo);

    List<Patient> queryPatientById(String id);
}
