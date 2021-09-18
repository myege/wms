<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>快递添加</title>	
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
	function saveSupp(){
	showBg();
		
		var obj=$('#saveSupplies').serializeJson();
		$.post('<%=path %>/supplies/add.do',obj,
			function(date){
			var r = date.resultInfo;
			if(r.type==0){
				parent.$.messager.show({
					title:'错误',
					msg:'错误代码：'+r.messageCode+'<br/>'+r.message
				})
			}else if(r.type == 1){
				$.messager.show({
					title:'成功',
					msg:r.message
				})
			parent.closemodalwindow();
			parent.reload("#D_supplies");
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
			}hideBg();
		}
		)
	}
	function canclec(){
		parent.closemodalwindow();
	}
	$('#suppliesname').numberbox({
	    min:0,
	    precision:2
	});
	
</script>
<!-- 添加耗材：耗材名称、类型、单价（元）-->
	<div>
		<form id="saveSupplies">
		<div align="center"><h1>新增耗材</h1></div>
		<div>耗　材　名　称:<input  id='suppliesname' name='suppliesname' class="combo"  style="font-size:15px;width:170px" type="text" />
			 &emsp;&emsp;&emsp;&emsp;单　　　　　价:<span class="combo"  style="width:162px;">  
            <input name="price" class="combo combo-text" id="price" >
            <span>  
            <span style="width:58px;">元</span>  
            </span>  
        </span> 
		</div>
		<div>耗　材　类　别:<select  class="easyui-combobox" name="suppliestype" style="width:168px;" data-options="panelHeight:'auto'">   
		    <option value="外箱">外箱</option>   
		    <option value="填充物">填充物</option>   
		    <option value="其他">其他</option>   
		</select>  
		 &emsp;&emsp;&emsp;&emsp;类　　　　　型:<select  class="easyui-combobox" name="type" style="width:168px;" data-options="panelHeight:'auto'" >   
		    <option value="自购">自购</option>   
		    <option value="仓库">仓库</option>   
		    <option value="提供">提供</option>   
			<option value="其他">其他</option>	
		</select>  
		</div>
		<div>
			<div>耗　材　规　格:<input  id='spec' name='spec' class="combo"  style="font-size:15px;width:170px" type="text" />
		</div>
			
		<br><br>
		<div align="center">
			<a href="#" class="easyui-linkbutton" onclick="saveSupp()" data-options="iconCls:'icon-add'" >保存</a>
			&emsp;&emsp;&emsp;&emsp;
			<a href="#" class="easyui-linkbutton" onclick="canclec()" data-options="iconCls:'icon-back'">取消</a>
		</div>
	</form>
	</div>
</body>
</html>