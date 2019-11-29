package com.oel.lps.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * l_dcpr_middle
 * @author 
 */
public class DcprMiddle implements Serializable {
    private Integer id;

    /**
     * 患者id
     */
    private String patientID;

    /**
     * DCpr id
     */
    private Integer dcprID;

    /**
     * 答案
     */
    private String answer;

    /**
     * 创建时间
     */
    private String creationTime;



    private static final long serialVersionUID = 1L;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public Integer getDcprID() {
        return dcprID;
    }

    public void setDcprID(Integer dcprID) {
        this.dcprID = dcprID;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}