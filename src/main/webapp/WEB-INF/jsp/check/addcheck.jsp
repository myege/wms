<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>ComAdd</title>	
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

function savecheck(){
	showBg();
	var company = $('#codename').combobox('getValue');
	var storages;
	var array=$("[name='storages']");//单引号 的name替换为相应的name
	for(var i=0;i<array.length;i++){
		if(storages==null){
			storages = $(array[i]).val()+","
		}
		if(storages!=null){
			storages += $(array[i]).val()+","
		}
	}
	$.post('<%=path %>/check/add.do?company='+company+"&storages="+storages,
		function(date){
		var r = date.resultInfo;
		if(r.type==0){
			$.messager.show({
				title:'错误',
				msg:'错误代码：'+r.messageCode+'<br/>'+r.message
			})
		}else if(r.type == 1){
			parent.$.messager.show({
				title:'成功',
				msg:r.message
			})
		parent.closemodalwindow();
		parent.reload("#D_Check");
		}else if(r.type==2){
			$.messager.show({
				title:'提示',
				msg:r.messageCode+' '+r.message
			})
		}else if(r.type==3){
			$.messager.show({
				title:'信息',
				msg:r.messageCode+' '+r.message
			})
		}
		hideBg();
	}
	)
}

function selectCompany(company){
	var divId = company+"storage";
	if(document.getElementById(company+"storage")){
		document.getElementById(company+"storage").remove();
	}else{
		  var parent = document.getElementById("rightx");
          var divId = document.createElement("div");
          divId.setAttribute("id",company+"storage");//给div一个id
          parent.appendChild(divId);  
          var i = 1;
          $.getJSON('<%=path %>/inventory/findCode.do?companycode='+company,
        	function(data) {
        	   $.each(data,function(idx,item){ 
        		  if(idx==0){ 
        		  return true;//同countinue，返回false同break 
        		  } 
        		   divId.innerHTML +='<input type="checkbox" checked="checked" value="'+item.storage+'"><label>'+item.storage+'</label>' 
        	}); 
       	});
	}
}
</script>
<div id="check" style="width:100%;height:100%;">
    <div id="left"style="width:29%;height:100%;border:1px solid #8DB2E3;float:left;">
    	<div align="center">请选择商家</div>
    	<c:forEach items="${company }" var="f" >
			 <input value="${f.companycode }" type="submit" onclick="selectCompany(this.value)" /> 
		</c:forEach>
    </div>
    <div id="rightx" style="width:69%;height:100%;margin-left:10px;border:1px solid #8DB2E3;float:right;">
    	<div align="center">请选择库位</div>
    	
    </div>
</div>

</body>

</html>