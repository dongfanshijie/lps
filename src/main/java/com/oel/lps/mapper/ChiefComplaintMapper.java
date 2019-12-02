package com.oel.lps.mapper;

import com.oel.lps.bean.ChiefComplaint;
import com.oel.lps.bean.PatientExperience;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChiefComplaintMapper {
    void addExperience(PatientExperience patientExperience);

    void addChiefComplaint(ChiefComplaint chiefComplaint);
}
