<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="../../css/login.css">
</head>
<body>
<div class="login">
    <div class="login_body">
        <div class="info">
            <div class="logo">
                <img src="/images/logo.png" alt="">
            </div>
            <div class="uname">
                <div class="uname_top"></div>
                <div class="uname_btm"></div>
                <div class="line">
                    <img src="/images/line.png" alt="">
                </div>
                <input type="text" placeholder="请输入登录账号">
            </div>
            <div class="upwd">
                <div class="upwd_top"></div>
                <div class="upwd_btm"></div>
                <input type="password" placeholder="请输入密码">
                <div class="line">
                    <img src="/images/line.png" alt="">
                </div>
            </div>
            <div class="btn">
                <button>登录</button>
                <div class="btn_top"></div>
                <div class="btn_btm"></div>
            </div>
        </div>
    </div>
</div>
<script src="../../js/jquery-3.4.1.min.js"></script>
<script src="../../js/jquery.cookie.js"></script>
<script>
    $(".btn button").click(
        function(){
            console.log(1)
            var uname=$(".uname input")
            var upwd=$(".upwd input")
            var mylogin={
                username:uname.val(),
                password:upwd.val()
            }
            if(uname.val()==""){
                alert("账号为空")
            }else if(upwd.val()==""){
                alert("密码为空")
            }else{
                $.ajax({
                    url:"/loginUser",
                    type:"post",
                    data:mylogin,
                    success:function(data){
                        console.log(data)
                    if(data!="userList"){
                        alert("账号错误")
                    }
                    }
                })
            }
            /*if(remember.is(":checked")){
                $.cookie("user",uname.val(),{expires:7})
            }else{
                $.cookie("user","",{expires:-1})
            }*/
        }
    )
    /* $(function(){
        var mycookie=$.cookie("user")
        $(".uname input").val(mycookie)
        if($(".uname input").val()!=""){
            $(".remember input").attr("checked",true)
        }
    })*/
</script>
</body>
</html>