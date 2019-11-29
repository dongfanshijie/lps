package com.oel.lps.service;

import com.oel.lps.bean.ChiefComplaint;
import com.oel.lps.bean.PatientExperience;

import java.util.List;

public interface ChiefComplaintService {

    void addChiefComplaint(ChiefComplaint chiefComplaint,String patientID);

    void addExperience(PatientExperience patientExperience, String patientID);
}
