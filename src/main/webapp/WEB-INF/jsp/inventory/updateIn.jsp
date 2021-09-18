<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title></title>	
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
			function frozen(){
				showBg();
				var sum=$("#sumInven").val();
				var storage=$("#storage").combobox('getValue');
				var companycode=$("#companycode").val();
				var inven = ${model.inventory}
				if(sum>inven){
					alert("库存不足")
					hideBg();
					return false;
				}
				if(sum==""){
					alert("请填写库存")
					hideBg();
					return false;
				}
				if(companycode==""){
					alert("请选择商家")
					hideBg();
					return false;
				}
				
				if(storage==""){
					alert("请选择库位")
					hideBg();
					return false;
				}
				var obj = $("#f_inventory_updateIn").serializeJson();
				$.post('<%=path%>/inventory/updateIn.do',obj,
					function(data){						
						var r = data.resultInfo;
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
							parent.reload("#d_inventory");						
							
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
			function cancle(){
				parent.closemodalwindow();
			}
			
		</script>
		<div>
		<form id="f_inventory_updateIn">
			<input type="hidden" value="${model.id}" name="id">
			<input type="hidden" name="companycode" id="companycode">
			
			<div align="center">
				接受商家<input id="companyname" name="companyname" style="width:148px" data-options="editable:false,panelHeight:'auto'">
				转让数量<input  id="sumInven" name="sumInven" class="easyui-numberbox"   data-options="width:'148',min:0">
				接受库位<select id="storage" name="storage"  class="easyui-combobox" style="width:148px" data-options="panelHeight:'auto'">
							<option value="">请选择</option>
							<c:forEach items="${storageCustoms }" var="storageCustom" >
								<option value="${storageCustom.storage}">${storageCustom.storage }</option>
							</c:forEach>
						</select>
			</div>
			<br><br><br>
			<div align="center">
				<a href="#" class="easyui-linkbutton" onclick="frozen()" data-options="iconCls:'icon-save'" >转移</a>
				&emsp;&emsp;&emsp;&emsp;&emsp;
				<a href="#" class="easyui-linkbutton" onclick="cancle()" data-options="iconCls:'icon-back'">取消</a>
			</div>
		</form>
		</div>
	</body>
	<script type="text/javascript">
	$('#companyname').combobox({    
	    url:'<%=path %>/inventory/findCom.do?code='+"${model.companycode}",    
	    valueField:'companycode',    
	    textField:'companyname' ,
	    
	    onLoadSuccess: function (data) {
	        if (data) {
	            $('#companyname').combobox('setValue',data[0].id);
	        }
	    },
	  	 onSelect: function(){
	           $('#companycode').val($('#companyname').combobox('getValue'));
	       }	
	})
	
	</script>
</html>