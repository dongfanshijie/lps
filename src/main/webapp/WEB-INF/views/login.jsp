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
            <div class="uname">
                <div>账号</div>
                <input type="text">
            </div>
            <div class="upwd">
                <div>密码</div>
                <input type="password">
            </div>
            <div class="remember">
                <input type="checkbox">
                <div>记住密码</div>
            </div>
            <div>
                <button class="btn">登录</button>
            </div>
        </div>
    </div>
</div>
<script src="../../js/jquery-3.4.1.min.js"></script>
<script src="../../js/jquery.cookie.js"></script>
<script>
    $(".btn").click(
        function(){
            var uname=$(".uname input")
            var upwd=$(".upwd input")
            var remember=$(".remember input")
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
            if(remember.is(":checked")){
                $.cookie("user",uname.val(),{expires:7})
            }else{
                $.cookie("user","",{expires:-1})
            }
        }
    )
    $(function(){
        var mycookie=$.cookie("user")
        $(".uname input").val(mycookie)
        if($(".uname input").val()!=""){
            $(".remember input").attr("checked",true)
        }
    })
</script>
</body>
</html>