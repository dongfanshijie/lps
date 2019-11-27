function myactive(e){
    var i="/images/patient_img"
    if(e==0){
       $(".patient_nav").children(":first-child").addClass("active").siblings().removeClass("active")

    }else if(e==6){
        $(".patient_nav").children(":last").addClass("active").siblings().removeClass("active")
    }else{
        $(".patient_nav").children(':nth-child(e+1)').addClass("active").siblings().removeClass("active")
    }
    $(".patient_nav .patient_act").eq(e).css("display","block").parents().siblings().children(".patient_act").css("display","none")
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