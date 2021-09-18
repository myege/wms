<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>批量复核</title>	
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		  <link rel="stylesheet" type="text/css" href="<%=path%>/jquery-easyui-1.4.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/jquery-easyui-1.4.1/themes/icon.css">
	<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="<%=path%>/js/printer.js"></script>
	<script type="text/javascript" src="<%=path%>/js/pageload.js"></script>
	<script type="text/javascript" src="<%=path%>/js/tools.js"></script>
	<script src="<%=path%>/js/menu.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css" />	
</head>
<body>
<script type="text/javascript">
function mailnoAdd(){
	var mailnoShipping = $('#mailnoShipping').val();
	$('#duiHao').focus();
}
function duiHaoAdd(){
	var au = document.createElement("audio");
	var mailnoShipping = $('#mailnoShipping').val();
	if(mailnoShipping == ""){
		alert("请输入复核条码");
		return false;
	}
	var duiHao = $('#duiHao').val();
       $.ajax({
        type: "POST",
        url: "<%=path%>/shipping/add2.do",
        data: {mailnoShipping:mailnoShipping,duiHao:duiHao},
        dataType: "json",
        success: function(data){
        	if(data.result==0){
	        	$(data.date).each(function() {
	            	$('#duihao_Show').datagrid('insertRow',{
	    				row:this
	    			});
	        	})
	        	au.preload="auto";
				au.src = "<%=path%>/music/cg.mp3";
				au.play();
	        	
        	}else{
        		parent.$.messager.show({
					title:'添加失败',
					msg:data.date
				})
        	}
        	 $('#duiHao').val(""); 	
      	}
    });
}
$(function(){
	$("#duihao_Show").datagrid({
		idField    :'id',
        columns    :[
            [
				{field :'id',checkbox : true,align :'center'},
                {field :'duihao', title :'复核条码', width :30, align :'center'},
                {field :'orderno', title :'订单号', width :30, align :'center'},
                {field :'mailno', title :'运单号', width :15, align :'center'},
                {field :'createtime', title :'订单创建时间', width :15, align :'center',
                	formatter:function(value){
                		return formatDate(value);
                	}	
                },
            ]
        ],
        fitColumns :true,
        pagination :true,
	})
})





</script>
<div align="center">
	<input type="text" id="mailnoShipping" style="height: 80px;width: 30%;font-size:45pt" placeholder="复核条码" onkeydown='if(event.keyCode==13){mailnoAdd();}' >
	<input type="text" id="duiHao" style="height: 80px;width: 30%;font-size:45pt" placeholder="快递单号" onkeydown='if(event.keyCode==13){duiHaoAdd();}' > 
</div>
<div id="duihao_Show"></div>
</body>
</html>