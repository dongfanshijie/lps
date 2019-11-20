package com.oel.lps.mapper;


import com.oel.lps.bean.Patient;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public interface PatientMapoper {

    List<Patient> queryPatient();


    List<Patient> queryPatientName(Map map);
}
