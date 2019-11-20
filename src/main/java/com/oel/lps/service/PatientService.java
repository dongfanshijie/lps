package com.oel.lps.service;

import com.oel.lps.bean.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> queryPatient();


    List<Patient> queryPatientName(Patient patient);
}
