package com.oel.lps.controller;

import com.oel.lps.bean.ChiefComplaint;
import com.oel.lps.service.ChiefComplaintService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: lps
 * @description: ChiefComplaintController
 * @author: ws
 * @create: 2019-11-22 14:46
 * 筛查主诉
 **/
@Controller
public class ChiefComplaintController {

    @Autowired
    private ChiefComplaintService chiefComplaintService;



    /**
     * @Author ws
     * @Description //TODO
     * @Date  2019/11/22
     * @Param [patientID]
    * @return int
     * 主诉新增
    **/
    @RequestMapping("addChiefComplaint")
    @ResponseBody
    public  int addChiefComplaint(ChiefComplaint chiefComplaint,String patientID){

        if (StringUtils.isNoneBlank(patientID)){
            chiefComplaintService.addChiefComplaint(chiefComplaint,patientID);
        }

        return 0;
    }
}
