<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="../../css/patient_list.css">
    <link rel="stylesheet" href="../../css/patient_record.css">
    <link rel="stylesheet" href="../../css/patient_complaint.css">
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
                    <div class="right_remind">
                        <img src="/images/patient_info.png" alt="">
                    </div>
                    <div class="right_serch">
                        <img src="/images/patient_serch.png" alt="">
                    </div>
                    <div class="right_sculpture">
                        <img src="/images/touxiang.png" alt="">
                    </div>
                    <div class="right_id">
                       这是ID
                    </div>
                </div>
            </div>
            <div class="patient_right_guanli">
                <div class="right_body">
                    <div class="right_body_wode right_active">
                        我的首页
                    </div>
                    <div class="right_body_huanzhe">
                        患者列表
                    </div>
                </div>
                <div class="patient_right_tiao1">
                    <div class="right_body_list">
                        <input type="text" class="patient_id" placeholder="患者编号">
                        <input type="text" class="patient_name" placeholder="患者姓名">
                        <input type="text" class="patient_num" placeholder="身份证号">
                        <input type="text" class="patient_date" placeholder="创建日期">
                        <button class="patient_chaxun">查询</button>
                        <button class="patient_dengji">患者登记</button>
                    </div>
                    <div class="patient_table">
                        <div class="patient_test">
                            <ul class="patient_state">
                                <li>
                                    评测状态：
                                </li>
                                <li onclick="zhuangtai(0)">
                                    <img src="/images/patient_yuan.png" alt="">
                                    <span>
                                    待完成
                                </span>
                                </li>
                                <li onclick="zhuangtai(1)">
                                    <img src="/images/patient_yuan.png" alt="">
                                    <span>
                                    进行中
                                </span>
                                </li>
                                <li onclick="zhuangtai(2)">
                                    <img src="/images/patient_yuan.png" alt="">
                                    <span>已完成</span>
                                </li>
                            </ul>
                            <ul class="patient_content">
                                <li>评测内容：</li>
                                <li onclick="neirong(0)">
                                    <img src="/images/patient_yuan.png" alt="">
                                    <span>
                                    筛查评测
                                </span>
                                </li>
                                <li onclick="neirong(1)">
                                    <img src="/images/patient_yuan.png" alt="">
                                    <span>
                                    专科评测
                                </span>
                                </li>
                                <li onclick="neirong(2)">
                                    <img src="/images/patient_yuan.png" alt="">
                                    <span>
                                    整体评测
                                </span>
                                </li>
                            </ul>
                        </div>
                        <div class="patient_tables">
                            <ul class="patient_tables_title">
                                <li>序号</li>
                                <li>编号</li>
                                <li>患者姓名</li>
                                <li>出生日期</li>
                                <li>年龄</li>
                                <li>性别</li>
                                <li>来源科室</li>
                                <li>来源医生</li>
                                <li>
                                    <div class="patient_renwu">
                                        <span class="patient_renwu_active">测评任务</span>
                                        <span class="patient_renwu_none">治疗任务</span>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="patient_record" style="display: none;">
                <div class="patient_record_index">
                    <div class="patient_record_select">
                        <div class="patient_left_select">
                            <div>评测内容:</div>
                            <select name="" id="neirong_select">
                                <option value="">全部</option>
                                <option value="">不全</option>
                                <option value="">一点</option>
                            </select>
                        </div>
                        <div class="patient_right_select">
                            <div>
                                评测状态:
                            </div>
                            <select name="" id="zhuangtai_select">
                                <option value="">全部</option>
                                <option value="">不全</option>
                                <option value="">一点</option>
                            </select>
                        </div>
                        <div class="patient_record_serch">
                            <button>查询</button>
                        </div>
                    </div>
                    <div class="patient_record_table">
                        <div class="record_table_index">
                            <ul class="record_table_head">
                                <li>序号</li>
                                <li>创建时间</li>
                                <li>测评内容</li>
                                <li>测评状态</li>
                                <li>测评师</li>
                                <li>测评科室</li>
                                <li>操作</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="patient_complaint">
                <div class="patient_complaint_index">
                    <div class="patient_complaint_head">
                        <div class="patient_complaint_num">
                            <pre>编  号：P100011811010100002</pre>
                        </div>
                        <div class="patient_complaint_info">
                            <pre>姓  名：王五</pre>
                            <pre>年  龄：21岁</pre>
                            <pre>性  别：男</pre>
                        </div>
                        <div class="patient_complaint_doctor">
                            <pre>体  重：75kg</pre>
                            <pre>来源医生：孙江月</pre>
                            <pre>来源科室：心内科</pre>
                        </div>
                    </div>
                    <div class="patient_complaint_body">
                        <div class="complaint_body_content">
                            <div class="comlaint_body_item">
                                <div class="comlaint_body_point">
                                    <div class="comlaint_point_content">
                                        <div class="comlaint_point_big">
                                            <div class="comlaint_point_small">1</div>
                                        </div>
                                        <div>主诉</div>
                                    </div>
                                    <div class="comlaint_body_line"></div>
                                    <div class="comlaint_point_content">
                                        <div class="comlaint_point_big">
                                            <div class="comlaint_point_small">2</div>
                                        </div>
                                        <div>HRV</div>
                                    </div>
                                    <div class="comlaint_body_line"></div>
                                    <div class="comlaint_point_content">
                                        <div class="comlaint_point_big">
                                            <div class="comlaint_point_small">3</div>
                                        </div>
                                        <div>问卷</div>
                                    </div>
                                    <div class="comlaint_body_line"></div>
                                    <div class="comlaint_point_content">
                                        <div class="comlaint_point_big">
                                            <div class="comlaint_point_small">4</div>
                                        </div>
                                        <div>量表</div>
                                    </div>
                                    <div class="comlaint_body_line"></div>
                                    <div class="comlaint_point_content">
                                        <div class="comlaint_point_big">
                                            <div class="comlaint_point_small">5</div>
                                        </div>
                                        <div>结果</div>
                                    </div>
                                </div>
                                <div class="patient_complaint_input">
                                    <div class="complaint_input_zhuyao">
                                        <div class="complaint_zhuyao_input">
                                            <span>
                                                主要症状
                                            </span>
                                            <span class="content_red">*</span>
                                            <span>:</span>
                                        </div>
                                        <div class="complaint_zhuyao_area">
                                            <textarea name="" id="" cols="200" rows="7" placeholder="最多可输入500字，超出后输入不显示（必填项）"></textarea>
                                        </div>
                                    </div>
                                    <div class="complaint_input_fazuopinlv">
                                        <div class="complaint_input_fazuo">
                                            <div class="complaint_fazuo_input">
                                                <span>发作频率</span>
                                                <span class="content_red">*</span>
                                                <span>:</span>
                                            </div>
                                            <div class="complaint_fazuo_area">
                                                <input type="text" placeholder="请输入发作频率">
                                            </div>
                                        </div>
                                        <div class="complaint_input_shouci">
                                            <div class="complaint_shouci_input">
                                                <span>首次发作</span>
                                                <span class="content_red">*</span>
                                                <span>:</span>
                                            </div>
                                            <div class="complaint_shouci_area">
                                                <input type="text" placeholder="请选择年月日时分">
                                            </div>
                                        </div>
                                        <div class="complaint_input_moci">
                                            <div class="complaint_moci_input">
                                                <span>末次发作</span>
                                                <span class="content_red">*</span>
                                                <span>:</span>
                                            </div>
                                            <div class="complaint_moci_area">
                                                <input type="text" placeholder="请选择年月日时分">
                                            </div>
                                        </div>
                                        <div class="complaint_input_yanzhong">
                                            <div class="complaint_yanzhong_input">
                                                <span>严重程度</span>
                                                <span class="content_red">*</span>
                                                <span>:</span>
                                            </div>
                                            <div class="complaint_yanzhong_area">
                                                <input type="text" placeholder="请选择">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="complaint_input_bansui">
                                        <div class="complaint_bansui_input">
                                            <span>伴随症状 ：</span>
                                        </div>
                                        <div class="complaint_bansui_area">
                                            <input type="text" placeholder="最多可输入30字，超出后输入不显示（选填项）">
                                        </div>
                                    </div>
                                    <div class="complaint_input_yundong">
                                        <div class="complaint_yundong_input">
                                            <span>运动症状：</span>
                                        </div>
                                        <div class="complaint_yundong_area">
                                            <input type="text" placeholder="最多可输入30字，超出后输入不显示（选填项）">
                                        </div>
                                    </div>
                                    <div class="complaint_input_shuimian">
                                        <div class="complaint_shuimian_input">
                                            <span>睡眠症状：</span>
                                        </div>
                                        <div class="complaint_shuimian_area">
                                            <input type="text" placeholder="最多可输入30字，超出后输入不显示（选填项）">
                                        </div>
                                    </div>
                                    <div class="complaint_input_jiuzhen">
                                        <div class="complaint_jiuzhen_button">
                                            <div class="complaint_jiuzhen_input">
                                                <span>就诊经历：</span>
                                            </div>
                                            <div class="complaint_jiuzhen_area">
                                                <button>点击添加</button>
                                            </div>
                                        </div>
                                        <div class="complaint_jiuzhen_radio">
                                            <img src="/images/patient_yuan.png" alt="">
                                            <div>
                                                暂无就诊经历
                                            </div>
                                        </div>
                                    </div>
                                    <div class="complaint_input_bingshi">
                                        <div class="complaint_input_jiwang">
                                            <div class="complaint_jiwang_input">
                                                <span>既往病史</span>
                                                <span>*</span>
                                                <span>:</span>
                                            </div>
                                            <div class="complaint_jiwang_area">
                                                <input type="text">
                                            </div>
                                        </div>
                                        <div class="complaint_input_jiazu">
                                            <div class="complaint_jiazu_input">
                                                <span>家族病史</span>
                                                <span>*</span>
                                                <span>:</span>
                                            </div>
                                            <div class="complaint_jiazu_area">
                                                <input type="text">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="complaint_input_yingji">
                                        <div class="complaint_yingji_input">
                                            <span>应激源：</span>
                                        </div>
                                        <div>
                                            <button>点击添加</button>
                                        </div>
                                    </div>
                                    <div>
                                        <div>
                                            <button>保存</button>
                                        </div>
                                        <div>
                                            <button>完成</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script src="../../js/jquery-3.4.1.min.js"></script>
<script src="../../js/patient_list.js"></script>
<script src="../../js/patient_record.js"></script>
<script src="../../js/patient_complaint.js"></script>
</html>