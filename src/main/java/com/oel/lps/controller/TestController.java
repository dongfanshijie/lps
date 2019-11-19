package com.oel.lps.controller;


import com.oel.lps.bean.TestBean;

import com.oel.lps.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("test")
public class TestController {


    @Autowired
    private TestService testService;


    //测试
   // @RequestMapping("querTest")
    @GetMapping("querTest")
    @ResponseBody
    public HashMap<String, Object> querTest(TestBean testBean){

        return testService.querTest(testBean);
    }

    //跳转测试页面
    @RequestMapping("userlist")
    public String toUserlist(){
        return "userList";
    }
}
