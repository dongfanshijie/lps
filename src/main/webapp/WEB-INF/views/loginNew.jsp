<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2019/11/22
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <div class="login_body">
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
</body>
<script src="../../js/jquery-3.4.1.min.js"></script>
<script src="../../js/jquery.cookie.js"></script>
<script src="../../js/login.js"></script>
<script>
    $(".btn").click(
        function(){
            var uname=$(".uname input")
            var upwd=$(".upwd input")
            var remember=$(".remember input")
            var mylogin={
                uname:uname.val(),
                upwd:upwd.val()
            }
            if(uname.val()==""){
                console.log(1)
                alert("账号为空")
            }else if(upwd.val()==""){
                alert("密码为空")
                console.log(2)
            }else{
                console.log(3)
                $.ajax({
                    url:"/loginUser",
                    type:"post",
                    data:mylogin,
                    success:function(data){
                        alert("请求成功")
                    }
                })
            }
        }
    )
</script>
</html>
