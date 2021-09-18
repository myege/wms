<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>区间转移</title>
	</head>
	<body>
		<script type="text/javascript">
			$(function(){
				$("#d_qjzy").datagrid({
					idField    :'id',
		            url        :'<%=path%>/qjzy/findAll.do?qjzyCustom.isdelete=0',
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'companycode', title :'商家编码', width :15, align :'center'},
		                    {field :'itemsku', title :'商品料号', width :15, align :'center'},
		                    {field :'itemname', title :'商品名称', width :30, align :'center' },
		                    {field :'num',title :'数量', width : 15,align :'center'},
		                    {field :'receiver', title :'交接人', width :15, align :'center'}, 
		                    {field :'receivedaddress', title :'交接地址', width :40, align :'center' },
		                    {field :'storage', title :'库位', width :40, align :'center' },
		                    {field :'createtime', title :'创建时间', width :15, align :'center',
		                    	formatter:function(value){
		                    		if(value==null || value == ''){
		                    			return '';
		                    		}else{
		                    			return formatDate(value);
		                    		}
		                    	}	
		                    },
							{field :'type', title :'状态', width :15, align :'center',
								formatter:function(value){
									if(value==1){
										return '<font color="#808080 ">已交接</font>';
									}else{
										return '未交接';
									}
								}		
							}
		                ]
		            ],
		            fitColumns :true,
		            pagination :true,
		            pageSize   :50,
		            pageList   :[10,25,50],
		            onLoadSuccess:function(){
		            	unSelect("#d_qjzy");
		            }
				})
			})
			function queryQjzy(){
				var obj = $("#f_qjzy").serializeJson();
				$("#d_qjzy").datagrid('load',obj);
			}
			function addQjzy(){
				createmodalwindow('申请区间转移',550,220,'<%=path%>/qjzy/addUI.do');
			}
			function updateQjzy(){
				var rows=$("#d_qjzy").datagrid("getSelections");
				var length = rows.length;
				if(length==0){
					$.messager.alert('错误','请选择一条数据进行修改','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					createmodalwindow('修改用户',800,300,'<%=path%>/qjzy/updateUI.do?id='+id);
				}
				
			}
			function deleteManyQjzy(){
				var rows=$("#d_qjzy").datagrid("getSelections");
				var length = rows.length;
				if(length==0){
					$.messager.alert('错误','请至少选择一行数据进行删除','error');
				}else{
					$.messager.confirm('提示','您确定删除选择的这<font color="red">'+length+'</font>条数据吗？',
							function(r){								
								if(r){
									showBg();
										var ids="";
										for(var i=0;i<length;i++){
											if(i==0){
												ids += rows[i].id;
											}else{
												ids += ','+rows[i].id;
											}
											
										}										
										$.post('<%=path%>/qjzy/delete.do',{ids:ids},
											 function(data){
												hideBg();
												var r = data.resultInfo;
												if(r.type==0){
													$.messager.show({
														title:'错误',
														msg:'错误代码：'+r.messageCode+'<br/>'+r.message
													})
												}else if(r.type == 1){
													$.messager.show({
														title:'成功',
														msg:r.message
													})
													setTimeout(function(){
														parent.closemodalwindow();
														parent.reload("#d_qjzy");
													}, 1000)
													
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
											}			
										);
								}
					})
				}
			}
function overQzjy(){
	var obj = $("#f_qjzy").serializeJson();
	var row = $('#d_qjzy').datagrid('getSelections');
	var ids = "";
	if (row.length == 0) { 
		$.messager.confirm('系统提示','请选择一条数据进行转移');
	}else{
		for (var i = 0; i < row.length; i++){
     			var ids = ids + row[i].id +",";
         	}
		$.messager.confirm('友情提示', "确定转移这几条么？", function(r){
		if (r){ 
		showBg();
			$.post('<%=path%>/qjzy/overQzjy.do',{ids:ids},
					 function(data){
					hideBg();
						var r = data.resultInfo;
						if(r.type==0){
							$.messager.show({
								title:'错误',
								msg:'错误代码：'+r.messageCode+'<br/>'+r.message
							})
						}else if(r.type == 1){
							$.messager.show({
								title:'成功',
								msg:r.message
							})
							setTimeout(function(){
								parent.closemodalwindow();
								parent.reload("#d_qjzy");
								parent.reload("#d_inventory");
								parent.reload("#d_storage");
							}, 1000)
							
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
					}			
				);
   		}else{
   			hideBg();
	        return;
    	} 
	    }); 
	}
}
		</script>
		<div>
		<form id="f_qjzy">
			&nbsp;商家编码：
			<select name="qjzyCustom.companycode" class="easyui-combobox" data-options="editable:false" >
				<option value="">请选择</option>
				<c:forEach items="${companyList }" var="item">
					<option value="${item.companycode}">${item.companycode}</option>
				</c:forEach>
			</select>
			&nbsp;&nbsp;&nbsp;料号：<input  name="qjzyCustom.itemsku" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;商品名称：<input  name="qjzyCustom.itemname" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;创建时间：<input name="qjzyCustom.startTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'最小创建时间'">
			至 <input name="qjzyCustom.endTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'最大创建时间'">

			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryQjzy()" data-options="iconCls:'icon-search'" >查询</a>
			&nbsp;&nbsp;&nbsp;
			<c:if test="${modular.contains('qjzy_all')}">
 			&nbsp;<a href="#" class="easyui-linkbutton" onclick="addQjzy()" data-options="iconCls:'icon-add'">申请区间转移</a>
 			&nbsp;<a href="#" class="easyui-linkbutton" onclick="overQzjy()" data-options="iconCls:'icon-add'">完成区间转移</a>
			<!-- &nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="updateQjzy()" data-options="iconCls:'icon-edit'">修改</a> -->
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="deleteManyQjzy()" data-options="iconCls:'icon-remove'">删除</a>
			</c:if>
		</form>
		</div>
		<div id="d_qjzy"></div>
	</body>
</html>