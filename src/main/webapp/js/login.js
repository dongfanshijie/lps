$(".btn button").click(
    function(){
     mylogin()
    }
)
 $(document).keydown(function(){
    if (event.keyCode == 13) {
        mylogin()
    }
})
/* $(function(){
    var mycookie=$.cookie("user")
    $(".uname input").val(mycookie)
    if($(".uname input").val()!=""){
        $(".remember input").attr("checked",true)
    }
})*/
function mylogin(){
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
                console.log(1)
                if(data!="userList"){
                    console.log(data)
                    alert("账号错误")
                }else{
                    location.href="/index"
                    console.log(1)
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