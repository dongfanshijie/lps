package com.oel.lps.controller;

import com.oel.lps.bean.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {


    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/a")
    public String a() {
        return "a";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/patientList")
    public String patientList() {
        return "patient_list";
    }

    @RequestMapping("/loginUser")
    @ResponseBody
    public String loginUser(String username,String password,HttpSession session) {
        //授权认证
        UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(username,password);
        Subject subject = SecurityUtils.getSubject();
        try {
            //完成登录
            subject.login(usernamePasswordToken);
            //获得用户对象
            User user=(User) subject.getPrincipal();
            //存入session
            session.setAttribute("user", user);

            return "userList";
        } catch(Exception e) {
            return "login";//返回登录页面734 810
        }

    }
    @RequestMapping("/logOut")
    public String logOut(HttpSession session) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
//        session.removeAttribute("user");
        return "login";
    }
}
