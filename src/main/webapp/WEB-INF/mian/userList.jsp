<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 引入Jquery(要在最上面) -->	
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.min.js"></script>

<!-- 引入Bootstrap -->							  
<link rel="stylesheet" href="<%=request.getContextPath() %>/js/bootstrap3/css/bootstrap.css">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/bootstrap3/js/bootstrap.js"></script>
<!-- 引入table -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/js/bootstrap-table/bootstrap-table.css">
<script src="<%=request.getContextPath() %>/js/bootstrap-table/bootstrap-table.js"></script>
<script src="<%=request.getContextPath() %>/js/bootstrap-table/locale/bootstrap-table-zh-CN.js"></script>

<!-- 引入时间 -->
<script src="<%=request.getContextPath() %>/js/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
<script src="<%=request.getContextPath() %>/js/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath() %>/js/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css">
<!-- 引入bootbok -->
<script src="<%=request.getContextPath() %>/js/bootstrap-bootbox/bootbox.js"></script>
<!-- 引入上传图片 -->
<script src="<%=request.getContextPath() %>/js/bootstrap-fileinput/js/fileinput.js"></script>
<script src="<%=request.getContextPath() %>/js/bootstrap-fileinput/js/locales/zh.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath() %>/js/bootstrap-fileinput/css/fileinput.css">
</head>
<body>
<!-- 调差 -->
<div id="toolbar">
<form class="form-inline">
  <div class="form-group">
    用户名：<input type="text" id="account" class="form-control" placeholder="输入用户名">
  出生时间：<input type="text" class="form-control date" name="goods.createTime" id="createTime" placeholder="输入时间">
  </div>
  <button onclick="searchUser()" type="button" class="btn btn-info glyphicon glyphicon-search" >搜索</button><br>
    <button onclick="delUser()" type="button" class="btn btn-warning glyphicon glyphicon-trash" >批量删除</button>
  <button onclick="addUser()" type="button" class="btn btn-info glyphicon glyphicon-plus" >新增</button>

</form>
</div>
<table class="table" id="myTable"></table>
</body>
<script type="text/javascript">
//调查询
function searchUser(){
	$('#myTable').bootstrapTable('refresh');
	
}



//打开新增页面

var res;
	function createAddContent(url){
		$.ajax({
			url:url,
			async:false,
			success:function(data){
				res = data;
			}
		});
		return res;
	}


function addUser(){
	
	bootbox.dialog({
		title:'添加商品',
	    message: createAddContent("<%=request.getContextPath() %>/page/toAdd.do"),
	    closeButton: true,
	    buttons : {
	        "success" : {
	            "label" : "<i class='icon-ok'></i> 保存",
	            "className" : "btn-sm btn-success",
	            "callback" : function() {
	            	$.ajax({
	            		url:'<%=request.getContextPath() %>/user/addUser.do',
	            		type:'post',
	            		data:$("#myForm").serialize(),
	            		dataType:'json',
	            		success:function(data){
	            			$('#myTable').bootstrapTable('refresh');
	            		}
	            	}); 
		        }
	        },
	        "cancel" : {
	            "label" : "<i class='icon-info'></i> 取消",
	            "className" : "btn-sm btn-danger",
	            "callback" : function() {
	            	
	            }
	        }
	    }
	    
	});
}


//日期
$('.date').datetimepicker({
	  language: 'zh-CN',//显示中文
	  //format: 'yyyy-mm-dd hh:ii:ss',//显示格式
	  format: 'yyyy-mm-dd',//显示格式
	  minView: "month",//设置只显示到月份
	  initialDate: new Date(),//初始化当前日期
	  autoclose: true,//选中自动关闭
	  todayBtn: true//显示今日按钮
	 });
//删除
function delUser(){
	bootbox.confirm({ 
		  title:"提示",
		  size: "small",
		  message: "确定删除吗？", 
		 
	
		  buttons: {
		        confirm: {
		            label: '确定',
		            className: 'btn-success'
		        },
		        cancel: {
		            label: '取消',
		            className: 'btn-danger'
		            
		        },
		       
		    },
		    //判断状态
		    callback: function(result){ 
		    	
		    	if(result){


		    		var arr = $('#myTable').bootstrapTable('getSelections'); //获取表选择的行

		    		//alert(arr)
		    		var sid = "";
		    		
		    			for(var i=0;i<arr.length;i++){
		    				if(sid==""){
		    					sid += arr[i].id
		    					
		    				}else{
		    					sid +=","+arr[i].id
		    					
		    				}
		    				
		    			}
		    			alert(sid)
		    	}
		    	
		    },
	})
	
	
	
		
		
		
		
		
}
//查询
$('#myTable').bootstrapTable({
	toolbar:'#toolbar',
  url:"<%=request.getContextPath()%>/test/querTest",
	pagination:true, //是否展示分页
	pageList:[5, 10, 20, 50],//分页组件
	pageNumber:1,
	pageSize:2,//默认每页条数
	queryParams:function(){
		return{
			page: this.pageNumber,
			rows: this.pageSize,
			account:$("#account").val()
		}
	},
	
	sidePagination:'server',//分页方式：client客户端分页，server服务端分页（*
	
	columns:[
	         {field:'check',checkbox:true},
	          {field:'id',title:'编号'},
	          {field:'name',title:'姓名'},
	          {field:'tools',title:'操作', width:100,align:'center',formatter:function(value,row,index){
	        	 var str = "<a href='javascript:openUpdateBy("+row.id+")'>修改</a>"
	        	 	str+="| <a href='javascript:deleteByid("+row.id+")'>删除</a>"
	        	  return str;
	          }}
	          
	            
	]
	
})

//修改弹框
var res;
	function createAddContent(url){
		$.ajax({
			url:url,
			async:false,
			success:function(data){
				res = data;
			}
		});
		return res;
	}

function openUpdateBy(id){
	bootbox.dialog({
		title:'修改用户',
	    message: createAddContent("<%=request.getContextPath() %>/page/updateUser.do"),
	    closeButton: true,
	    buttons : {
	        "success" : {
	            "label" : "<i class='icon-ok'></i> 保存",
	            "className" : "btn-sm btn-success",
	            "callback" : function() {
	            	$.ajax({
	            		url:'<%=request.getContextPath() %>/user/updataUser.do',
	            		type:'post',
	            		data:$("#myForm").serialize(),
	            		dataType:'json',
	            		success:function(data){
	            			$('#myTable').bootstrapTable('refresh');
	            		}
	            	}); 
		        }
	        },

	        "cancel" : {
	            "label" : "<i class='icon-info'></i> 取消",
	            "className" : "btn-sm btn-danger",
	            "callback" : function() {
	            	
	            }
	        }
	    }
	    
	});
	$.ajax({
		url:'<%=request.getContextPath() %>/user/queryUserById.do',
		type:"post",
		data:{"id":id},
		success:function(data){
			$("#id").val(data.id)
			$("#user_name").val(data.user_name)
			$("#account1").val(data.account)
			$("#password").val(data.password)
			$("#registration_date").val(data.registration_date)
			$("#leag").val(data.roleId)
			$("#dept").val(data.dept_id)
			$("#e_mail").val(data.e_mail)
			$("#sex").each(function(){
				var sexid = $(this).val();
				if(sexid==data.sex){
					$(this).prop("checked",true)
					
				}
				
			})
			
			$("#city").val(data.province)
			
			initArea(data.province,data.city)
			$("#testimg").val(data.head_img)
			updateImg(data.head_img)
		}
	})
	
	//回显图片
	function updateImg(url){
	
	$('#head_img').fileinput({
		//初始化 预览：图片http地址
		initialPreview:url,
		//初始化图片配置：
				initialPreviewConfig: [
		   	        {key: 1, showDelete: false}
				 ],
		//是否初始化图片显示
		initialPreviewAsData: true,
		language: 'zh', //设置语言
		uploadUrl: '<%=request.getContextPath() %>/user/uploadUserImg.do', //上传的地址
		allowedFileExtensions: ['jpg', 'gif', 'png'],//接收的文件后缀
		showUpload: true, //是否显示上传按钮
		showCaption: false,//是否显示标题
		browseClass: "btn btn-primary", //按钮样式 
		//dropZoneEnabled: false,//是否显示拖拽区域
		//minImageWidth: 50, //图片的最小宽度
		//minImageHeight: 50,//图片的最小高度
		//maxImageWidth: 1000,//图片的最大宽度
		//maxImageHeight: 1000,//图片的最大高度
		//maxFileSize: 0,//单位为kb，如果为0表示不限制文件大小
		//minFileCount: 0,
		maxFileCount: 1, //表示允许同时上传的最大文件个数
		enctype: 'multipart/form-data',
		validateInitialCount:true,
		previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
		msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
		
	}).on('fileuploaded', function(event, data, previewId, index) {
		var imgval = $('#testimg').val();
		if(imgval == null || imgval == "" || imgval == undefined){
			imgval = "http://<%= request.getServerName()%>:<%=request.getServerPort()%><%=request.getContextPath()%>/"+data.response;
		}else{
			imgval += ","+"http://<%= request.getServerName()%>:<%=request.getServerPort()%><%=request.getContextPath()%>/"+data.response;
		}
		$('#testimg').val(imgval);
	});
	
	}
}
</script>
</html>