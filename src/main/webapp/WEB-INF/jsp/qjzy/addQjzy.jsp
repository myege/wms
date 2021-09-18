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
	function saveQjzy(){
		showBg();
		var obj=$('#f_inventory_shift').serializeJson();
		$.post('<%=path %>/qjzy/shift.do',obj,
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
			parent.reload("#d_qjzy");
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
	function canclec(){
		parent.closemodalwindow();
	}

	
</script>
	<div>
		<form id="f_inventory_shift">
			<div align="center">库位：
			<select class="easyui-combobox" name="qjzyStorage" data-options="panelHeight:'auto'" style="width:148px;">
			<option value="">请选择</option>
                <c:forEach var="storage" items="${storageList}" > 
					<option value="${storage}">${storage}</option>
				</c:forEach>
			 </select>
			数量：
			<input name="sum" class="easyui-textbox"   data-options="width:'148'" ><br/>
			原因：
			<input name="shiftReason" class="easyui-textbox"   data-options="width:'148'" >
			地址：
			<input name="qjzyAddr" class="easyui-textbox"   data-options="width:'148'" >
			<div align="center">
			<br><br>
			</div>
			<a href="#" class="easyui-linkbutton" onclick="saveQjzy()" data-options="iconCls:'icon-save'" >保存</a>
			&emsp;&emsp;&emsp;&emsp;
			<a href="#" class="easyui-linkbutton" onclick="canclec()" data-options="iconCls:'icon-back'">取消</a>
		</div>
		</form>
		</div>
</body>
<script type="text/javascript">
$('#nameQjzy').combobox({    
    url:'<%=path %>/godownentry/findCom.do',    
    valueField:'companycode',    
    textField:'companyname' ,
    onLoadSuccess: function (data) {
        if (data) {
            $('#nameQjzy').combobox('setValue',data[0].id);
        }
    },
  	 onSelect: function(){
         $('#QjzyCompany').val($('#nameQjzy').combobox('getValue'));
     }
})
</script>
</html>