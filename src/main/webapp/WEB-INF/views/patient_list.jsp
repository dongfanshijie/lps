<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="../../css/patient_list.css">
</head>
<body>
<div class="patient">
    <div class="patient_list">
        <div class="patient_body">
            <div class="logo">
                <img src="../../images/logo.png" alt="">
            </div>
            <div class="patient_nav">
                <div class="patient_guan active" onclick="myactive(0)">
                    <img src="/images/patient_img0_blue.png" alt="" class="patient_nav_img0">
                    <div>患者管理</div>
                </div>
                <div class="patient_xin" onclick="myactive(1)">
                    <img src="/images/patient_img1.png" alt=""class="patient_nav_img1">
                    <div>心身检查</div>
                </div>
                <div class="patient_shen" onclick="myactive(2)">
                    <img src="/images/patient_img2.png" alt=""class="patient_nav_img2">
                    <div>心身报告</div>
                </div>
                <div class="patient_liao" onclick="myactive(3)">
                    <img src="/images/patient_img3.png" alt="" class="patient_nav_img3">
                    <div>心身治疗</div>
                </div>
                <div class="patient_can" onclick="myactive(4)">
                    <img src="/images/patient_img4.png" alt=""class="patient_nav_img4">
                    <div>参数配置</div>
                </div>
                <div class="patient_user" onclick="myactive(5)">
                    <img src="/images/patient_img5.png" alt="" class="patient_nav_img5">
                    <div>角色权限</div>
                </div>
                <div class="patient_xi" onclick="myactive(6)">
                    <img src="/images/patient_img6.png" alt="" class="patient_nav_img6">
                    <div>系统设置</div>
                </div>
            </div>
        </div>
    </div>
    <div class="right">
        <div class="right_index">
            <div class="right_head">
                <div class="right_shou">
                    <img src="/images/patient_shou.png" alt="">
                </div>
                <div class="right_info">
                    <div class="right_ remind">
                        <img src="/images/patient_info.png" alt="">
                    </div>
                    <div class="right_serch">
                        <img src="/images/patient_serch.png" alt="">
                    </div>
                    <div class="right_sculpture">
                        <img src="/images/patient_img5_blue.png" alt="">
                    </div>
                    <div>
                        这是ID
                    </div>
                </div>
            </div>
            <div class="right_body"></div>
        </div>
    </div>
</div>
</body>
<script src="../../js/jquery-3.4.1.min.js"></script>
<script src="../../js/patient_list.js"></script>
</html>
