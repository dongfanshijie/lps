package com.oel.lps.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * l_patient_experience
 * @author 
 */
public class PatientExperience implements Serializable {
    private Integer id;

    /**
     * 就诊日期
     */
    private String seekdata;

    /**
     * 症状
     */
    private String symptom;

    /**
     * 医院
     */
    private String hospital;

    /**
     * 检查
     */
    private String inspect;

    /**
     * 诊断
     */
    private String diagnosis;

    private String plan;

    /**
     * 结果
     */
    private String result;

    private String creationtime;

    /**
     * 外键患者id
     */
    private String patientid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeekdata() {
        return seekdata;
    }

    public void setSeekdata(String seekdata) {
        this.seekdata = seekdata;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getInspect() {
        return inspect;
    }

    public void setInspect(String inspect) {
        this.inspect = inspect;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }
}