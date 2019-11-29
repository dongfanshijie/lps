package com.oel.lps.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * l_screening_chiefcomplaint
 * @author 
 */
public class ChiefComplaint implements Serializable {
    private Integer id;

    /**
     * 主要症状
     */
    private String symptom;

    /**
     * 发作频率
     */
    private String frequency;

    /**
     * 首次发作时间
     */
    private String firsttime;

    /**
     * 末次发作时间
     */
    private String lasttime;

    /**
     * 严重程度
     */
    private String degree;

    /**
     * 伴随症状
     */
    private String concomitantsymptom;

    /**
     * 运动症状
     */
    private String motorsymptoms;

    /**
     * 睡眠症状
     */
    private String sleepsymptoms;

    /**
     * 就诊经历
     */
    private String visitingexperience;

    /**
     * 既往病史
     */
    private String pastmedicalhistory;

    /**
     * 家族史
     */
    private String familyhistory;

    /**
     * 应激源
     */
    private String stressor;

    /**
     * l_patient表外键
     */
    private String patientid;

    private  String creationTime ;//创建时间


    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getFirsttime() {
        return firsttime;
    }

    public void setFirsttime(String firsttime) {
        this.firsttime = firsttime;
    }

    public String getLasttime() {
        return lasttime;
    }

    public void setLasttime(String lasttime) {
        this.lasttime = lasttime;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getConcomitantsymptom() {
        return concomitantsymptom;
    }

    public void setConcomitantsymptom(String concomitantsymptom) {
        this.concomitantsymptom = concomitantsymptom;
    }

    public String getMotorsymptoms() {
        return motorsymptoms;
    }

    public void setMotorsymptoms(String motorsymptoms) {
        this.motorsymptoms = motorsymptoms;
    }

    public String getSleepsymptoms() {
        return sleepsymptoms;
    }

    public void setSleepsymptoms(String sleepsymptoms) {
        this.sleepsymptoms = sleepsymptoms;
    }

    public String getVisitingexperience() {
        return visitingexperience;
    }

    public void setVisitingexperience(String visitingexperience) {
        this.visitingexperience = visitingexperience;
    }

    public String getPastmedicalhistory() {
        return pastmedicalhistory;
    }

    public void setPastmedicalhistory(String pastmedicalhistory) {
        this.pastmedicalhistory = pastmedicalhistory;
    }

    public String getFamilyhistory() {
        return familyhistory;
    }

    public void setFamilyhistory(String familyhistory) {
        this.familyhistory = familyhistory;
    }

    public String getStressor() {
        return stressor;
    }

    public void setStressor(String stressor) {
        this.stressor = stressor;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}