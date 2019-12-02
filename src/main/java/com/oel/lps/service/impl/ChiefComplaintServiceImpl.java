package com.oel.lps.service.impl;

import com.oel.lps.bean.ChiefComplaint;
import com.oel.lps.bean.Patient;
import com.oel.lps.bean.PatientExperience;
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
        //Patient patientatient = (Patient) patientMapoper.queryPatientById(patientID);

        //测试新增


        //添加患者编号
        chiefComplaint.setPatientid(patientID);
        //添加系统时间
        SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String time = format0.format(date.getTime());
        chiefComplaint.setCreationTime(time);

        chiefComplaintMapper.addChiefComplaint(chiefComplaint);


    }

    /*
     * @Author ws
     * @Description //TODO
     * @Date  2019/11/29
     * @Param [patientExperience, patientID]
     * @return int
     * 添加就诊经历
     **/
    @Override
    public void addExperience(PatientExperience patientExperience, String patientID) {

        //添加测试数据

        //添加系统时间
        SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String time = format0.format(date.getTime());
        patientExperience.setCreationtime(time);

        //添加患者编号
        patientExperience.setPatientid(patientID);
        chiefComplaintMapper.addExperience(patientExperience);


    }
}
