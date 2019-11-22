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

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

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

    public String getCreationTime() {
        return creationTime;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ChiefComplaint other = (ChiefComplaint) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSymptom() == null ? other.getSymptom() == null : this.getSymptom().equals(other.getSymptom()))
            && (this.getFrequency() == null ? other.getFrequency() == null : this.getFrequency().equals(other.getFrequency()))
            && (this.getFirsttime() == null ? other.getFirsttime() == null : this.getFirsttime().equals(other.getFirsttime()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()))
            && (this.getDegree() == null ? other.getDegree() == null : this.getDegree().equals(other.getDegree()))
            && (this.getConcomitantsymptom() == null ? other.getConcomitantsymptom() == null : this.getConcomitantsymptom().equals(other.getConcomitantsymptom()))
            && (this.getMotorsymptoms() == null ? other.getMotorsymptoms() == null : this.getMotorsymptoms().equals(other.getMotorsymptoms()))
            && (this.getSleepsymptoms() == null ? other.getSleepsymptoms() == null : this.getSleepsymptoms().equals(other.getSleepsymptoms()))
            && (this.getVisitingexperience() == null ? other.getVisitingexperience() == null : this.getVisitingexperience().equals(other.getVisitingexperience()))
            && (this.getPastmedicalhistory() == null ? other.getPastmedicalhistory() == null : this.getPastmedicalhistory().equals(other.getPastmedicalhistory()))
            && (this.getFamilyhistory() == null ? other.getFamilyhistory() == null : this.getFamilyhistory().equals(other.getFamilyhistory()))
            && (this.getStressor() == null ? other.getStressor() == null : this.getStressor().equals(other.getStressor()))
            && (this.getPatientid() == null ? other.getPatientid() == null : this.getPatientid().equals(other.getPatientid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSymptom() == null) ? 0 : getSymptom().hashCode());
        result = prime * result + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        result = prime * result + ((getFirsttime() == null) ? 0 : getFirsttime().hashCode());
        result = prime * result + ((getLasttime() == null) ? 0 : getLasttime().hashCode());
        result = prime * result + ((getDegree() == null) ? 0 : getDegree().hashCode());
        result = prime * result + ((getConcomitantsymptom() == null) ? 0 : getConcomitantsymptom().hashCode());
        result = prime * result + ((getMotorsymptoms() == null) ? 0 : getMotorsymptoms().hashCode());
        result = prime * result + ((getSleepsymptoms() == null) ? 0 : getSleepsymptoms().hashCode());
        result = prime * result + ((getVisitingexperience() == null) ? 0 : getVisitingexperience().hashCode());
        result = prime * result + ((getPastmedicalhistory() == null) ? 0 : getPastmedicalhistory().hashCode());
        result = prime * result + ((getFamilyhistory() == null) ? 0 : getFamilyhistory().hashCode());
        result = prime * result + ((getStressor() == null) ? 0 : getStressor().hashCode());
        result = prime * result + ((getPatientid() == null) ? 0 : getPatientid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", symptom=").append(symptom);
        sb.append(", frequency=").append(frequency);
        sb.append(", firsttime=").append(firsttime);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", degree=").append(degree);
        sb.append(", concomitantsymptom=").append(concomitantsymptom);
        sb.append(", motorsymptoms=").append(motorsymptoms);
        sb.append(", sleepsymptoms=").append(sleepsymptoms);
        sb.append(", visitingexperience=").append(visitingexperience);
        sb.append(", pastmedicalhistory=").append(pastmedicalhistory);
        sb.append(", familyhistory=").append(familyhistory);
        sb.append(", stressor=").append(stressor);
        sb.append(", patientid=").append(patientid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}