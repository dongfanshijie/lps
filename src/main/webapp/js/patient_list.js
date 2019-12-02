function myactive(e){
    var i="/images/patient_img"
    if(e==0){
       $(".patient_nav").children(":first-child").addClass("active").siblings().removeClass("active")

    }else if(e==6){
        $(".patient_nav").children(":last").addClass("active").siblings().removeClass("active")
    }else{
        $(".patient_nav").children(`:nth-child(${e+1})`).addClass("active").siblings().removeClass("active")
    }
if(e==0){
    $(".patient_nav .patient_nav_img0").attr("src",i+0+"_blue.png")
}else{
    $(".patient_nav .patient_nav_img0").attr("src",i+0+".png")
}
    if(e==1){
        $(".patient_nav .patient_nav_img1").attr("src",i+1+"_blue.png")
    }else{
        $(".patient_nav .patient_nav_img1").attr("src",i+1+".png")
    }
    if(e==2){
        $(".patient_nav .patient_nav_img2").attr("src",i+2+"_blue.png")
    }else{
        $(".patient_nav .patient_nav_img2").attr("src",i+2+".png")
    }
    if(e==3){
        $(".patient_nav .patient_nav_img3").attr("src",i+3+"_blue.png")
    }else{
        $(".patient_nav .patient_nav_img3").attr("src",i+3+".png")
    }
    if(e==4){
        $(".patient_nav .patient_nav_img4").attr("src",i+4+"_blue.png")
    }else{
        $(".patient_nav .patient_nav_img4").attr("src",i+4+".png")
    }
    if(e==5){
        $(".patient_nav .patient_nav_img5").attr("src",i+5+"_blue.png")
    }else{
        $(".patient_nav .patient_nav_img5").attr("src",i+5+".png")
    }
    if(e==6){
        $(".patient_nav .patient_nav_img6").attr("src",i+6+"_blue.png")
    }else{
        $(".patient_nav .patient_nav_img6").attr("src",i+6+".png")
    }
}


$(".right_body div").click(
    function(){
        $(this).addClass("right_active").siblings().removeClass("right_active")
    }
)

$(".patient_chaxun").click(
    function(){
        var patientid=$(".patient_id").val()
        var patientname=$(".patient_name").val()
        var patientnum=$(".patient_num").val()
        var idcardno=$(".patient_date").val()
        var data={
            "patientid":patientid,
            "patientname":patientname,
            "patientnum":patientnum,
            "idcardno":idcardno
        }

        $.ajax({
            url:"/queryPatient",
            type:"get",
            data:data,
            success:function(data) {
                for (var i=0;i<data.length;i++){
                    if($(".patient_tables ul").length<(data.length+1)){
                        $(".patient_tables").append("<ul><li>" + data[i].id + "</li>" + "<li>" + data[i].patientId + "</li>" +
                            "<li>" + data[i].patientName + "</li>" + "<li>" + data[i].patientDate + "</li>" + "<li>" + data[i].patientAge + "</li>"
                            + "<li>" + data[i].patientSex + "</li>" + "<li>" + data[i].sourceDepartment + "</li>" + "<li>" + data[i].sourceDoctor + "</li>" + "<li><div class='patient_dispatch'>" +
                            "<span>测评记录</span><span>筛查评测</span><span>专科评测</span>" +
                            "<span>整体评测</span><span>筛查报告</span><span>专科报告</span>" +
                            "<span>整体报告</span></div></li></ul>")
                    }
                   if(data[i].whole==1){
                      $(".patient_dispatch>span:nth-child(4)").addClass("patient_dispatch_active")

                   }
                   if(data[i].specialty==1){
                       $(".patient_dispatch>span:nth-child(3)").addClass("patient_dispatch_active")
                   }
                   if(data[i].estingItems==1){
                       $(".patient_dispatch>span:nth-child(2)").addClass("patient_dispatch_active")
                   }
                }
            }
        })
    }
)
$(document).on("click",".patient_dispatch>span:first-child",function(){
    console.log($(this).parent().parent().prev().prev().prev().prev().prev().prev().html())
    console.log(1)
})

$(".patient_renwu span").click(
    function(){
        $(this).addClass("patient_renwu_active").removeClass("patient_renwu_none").siblings().removeClass("patient_renwu_active").addClass("patient_renwu_none")
    }
)


function zhuangtai(e){
    if(e==0){
        $(".patient_state>li:nth-child(2) img").attr("src","/images/patient_act.png")
        $(".patient_state>li:nth-child(3) img").attr("src","/images/patient_yuan.png")
        $(".patient_state>li:last-child img").attr("src","/images/patient_yuan.png")

    }else if(e==1){
        $(".patient_state>li:nth-child(3) img").attr("src","/images/patient_act.png")
        $(".patient_state>li:nth-child(2) img").attr("src","/images/patient_yuan.png")
        $(".patient_state>li:last-child img").attr("src","/images/patient_yuan.png")
    }else if(e==2){
        $(".patient_state>li:last-child img").attr("src","/images/patient_act.png")
        $(".patient_state>li:nth-child(3) img").attr("src","/images/patient_yuan.png")
        $(".patient_state>li:nth-child(2) img").attr("src","/images/patient_yuan.png")
    }
    var data={
        "state":e
    }
    $.ajax({
        url:"",
        type:"get",
        data:data,
        success:function(data){
            console.log(data)
        }
    })
}