package com.oel.lps.bean;

import java.io.Serializable;

/**
 * l_volume
 * @author 
 */
public class Volume implements Serializable {
    private Integer id;

    /**
     * 问卷题目
     */
    private String name;

    /**
     * 选项
     */
    private String a;

    /**
     * 选项
     */
    private String b;

    /**
     * 选项
     */
    private String c;

    /**
     * 选项
     */
    private String d;

    /**
     * 选项
     */
    private String f;

    private Integer vnamid;

    private Integer special;

    /**
     * 跳转对应题
     */
    private Integer jump;

    /**
     * 赋值对象题号
     */
    private Integer assignment;

    //临时字段 题目大标题
    private String volumeName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public Integer getVnamid() {
        return vnamid;
    }

    public void setVnamid(Integer vnamid) {
        this.vnamid = vnamid;
    }

    public Integer getSpecial() {
        return special;
    }

    public void setSpecial(Integer special) {
        this.special = special;
    }

    public Integer getJump() {
        return jump;
    }

    public void setJump(Integer jump) {
        this.jump = jump;
    }

    public Integer getAssignment() {
        return assignment;
    }

    public void setAssignment(Integer assignment) {
        this.assignment = assignment;
    }
}