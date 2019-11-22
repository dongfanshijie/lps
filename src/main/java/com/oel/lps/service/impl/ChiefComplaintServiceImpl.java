package com.oel.lps.service.impl;

import com.oel.lps.bean.ChiefComplaint;
import com.oel.lps.bean.Patient;
import com.oel.lps.mapper.ChiefComplaintMapper;
import com.oel.lps.mapper.PatientMapoper;
import com.oel.lps.service.ChiefComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @program: lps
 * @description: ChiefComplaintServiceImpl
 * @author: ws
 * @create: 2019-11-22 14:49
 **/
@Service
public class ChiefComplaintServiceImpl implements ChiefComplaintService {

    @Autowired
    private ChiefComplaintMapper chiefComplaintMapper;

    @Autowired
    private PatientMapoper patientMapoper;
    /**
     * @Author ws
     * @Description //TODO
     * @Date  2019/11/22
     * @Param [patientID]
     * @return int
     * 主诉新增
     **/
    @Override
    public void addChiefComplaint(ChiefComplaint chiefComplaint, String patientID) {
        //根据患者id获取患者编号
        Patient patientatient = (Patient) patientMapoper.queryPatientById(patientID);

        //测试新增
        chiefComplaint.setSymptom("主要症状暂无");
        chiefComplaint.setFrequency("每天");
        chiefComplaint.setFirsttime("2018-11-12");
        chiefComplaint.setLasttime("2018-11-25");
        chiefComplaint.setDegree("中度");
        chiefComplaint.setConcomitantsymptom("无症状");
        chiefComplaint.setMotorsymptoms("无运动症状");
        chiefComplaint.setSleepsymptoms("很好");
        chiefComplaint.setVisitingexperience("无就诊经历");
        chiefComplaint.setPastmedicalhistory("无病史");
        chiefComplaint.setFamilyhistory("无家族史");
        chiefComplaint.setStressor("无应激源");

        //添加患者编号
        chiefComplaint.setPatientid(patientatient.getPatientId());
        //添加系统时间
        SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String time = format0.format(date.getTime());
        chiefComplaint.setFirsttime(time);

        patientMapoper.addChiefComplaint(chiefComplaint);


    }
}
