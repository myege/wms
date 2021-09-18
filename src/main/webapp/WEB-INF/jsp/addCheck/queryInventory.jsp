<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>商家管理</title>
	</head>
	<body>
		<script type="text/javascript">
			$(function(){						
				$("#add_inventory").datagrid({
					idField    :'id',
		            url        :'<%=path%>/inventory/findAll.do?inventoryCustom.type=0',
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
							{field :'companycode', title :'商家编码', width :30, align :'center'},
							{field :'itemname', title :'商品名称', width :30, align :'center'},
			                {field :'itemcode', title :'商品条码', width :30, align :'center'},
			                {field :'itemsku', title :'料号', width :30, align :'center'},
			                {field :'storage', title :'库位', width :30, align :'center'},			               
			                {field :'sum', title :'首次上架数量', width :30, align :'center'},
			                {field :'inventory', title :'库存数', width :30, align :'center'},
			                {field :'inventoryoccupy', title :'占用库存', width :30, align :'center'},
			                {field :'inventoryfrozen', title :'冻结库存', width :30, align :'center'},
			                {field :'shift', title :'区间转移', width :30, align :'center'},
			                {field :'type', title :'状态', width :30, align :'center',
			                	formatter:function(value){
			                		if(value==0){
			                			return "正常库存";
			                		}else{
			                			return "历史库存";
			                		}
			                	}	
			                },
			                {field :'sort', title :'区域', width :30, align :'center',
			                	formatter:function(value){
			                		if(value==0){
			                			return "储存区";
			                		}else if(value==1){
			                			return "捡货区";
			                		}else if(value==2){
			                			return "残次品";
			                		}
			                	}	
			                },

		                ]
		            ],
		            fitColumns :true,
		            pagination :true,
		            pageSize   :10,
		            pageList   :[10,25,50],
				})
			})

			function queryAddInventory(){
				var obj = $("#fadd_inventory").serializeJson();
				$("#add_inventory").datagrid('load',obj);
			}
			
function addChek(){
	var rows=$("#add_inventory").datagrid("getSelections");
	var length = rows.length;
	var obj = $("#fadd_inventory").serializeJson();
	$.messager.confirm('友情提示', "确定生成盘点信息", function(r){ 
	if (r){ 
		var ids="";
		for(var i=0;i<length;i++){
			if(i==0){
				ids += rows[i].id;
			}else{
			ids += ','+rows[i].id;
			}						
		}
		$.post('<%=path %>/addCheck/addCheck.do?ids='+ids,obj,
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
		})
}

			
		</script>
			<form id="fadd_inventory">
			&nbsp;商家编码：<input name="inventoryCustom.companycode" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;商品名称：<input  name="inventoryCustom.itemname" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;商品条码：<input  name="inventoryCustom.itemcode" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;商品SKU：<input  name="inventoryCustom.itemsku" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;库位：<input  name="inventoryCustom.storage" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;
			
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryAddInventory()" data-options="iconCls:'icon-search'" >查询</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="addChek()" data-options="iconCls:'icon-search'" >生成盘点单</a>
			<br/>
		</form>	
		<div id="add_inventory" style="OVERFLOW:auto;WIDTH:100%;HEIGHT:93%"></div>
	</body>
</html>