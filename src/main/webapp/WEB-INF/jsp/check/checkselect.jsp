<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>盘点</title>
	</head>
	<body>
		<script type="text/javascript">
			$(function(){
				$("#D_Check").datagrid({
					idField    :'id',
		           url:'',
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
							{field :'code', title :'盘点标记', width :20, align :'center'},
							{field :'createtime', title :'盘点时间', width :20, align :'center',
								formatter:function(value){
		                    		return formatDate(value);
		                    	}	
							},
		                    {field :'storage',title :'库位', width : 15,align :'center'},
		                    {field :'companycode', title :'商家编码', width :10, align :'center'},
		                    {field :'itemcode', title :'商品条码', width :15, align :'center'},
		                    {field :'inventory', title :'原纪录库存', width :10, align :'center'}, 
		                    {field :'itemsku', title :'商品Sku', width :15, align :'center'},
		                    {field :'itemname', title :'商品名字', width :30, align :'center'},
		                    {field :'tcompany', title :'实际商家', width :15, align :'center'},
		                    {field :'tcode', title :'实际商品条码', width :15, align :'center'},
		                    {field :'tsku', title :'实际商品Sku', width :15, align :'center'},
		                    {field :'tname', title :'实际商品名字', width :30, align :'center'},
		                    {field :'tinventory', title :'最新库存', width :15, align :'center'},
		                ]
		            ],
		            fitColumns :true,
		            pagination :true,
		            pageSize   :50,
		            pageList   :[10,25,50],
		            onLoadSuccess:function(){
		            	unSelect("#findCheck");
		            }
				})
			})

				
		 	function queryCheck(){
				var code = $("#codew").combobox('getValue');
				if(code==""){
					$.messager.alert('提示','请选择盘点记录');
					return
				}
				var obj = $("#findCheck").serializeJson();
				$("#D_Check").datagrid('options').url = '<%=path%>/check/findAll.do';
				$("#D_Check").datagrid('load',obj);
			}
			function addCheck(){
				createmodalwindow('新增盘点',900,900,'<%=path%>/check/addUI.do');		
			}
			function ImportCkeck(){
				createmodalwindow('导入盘点信息',770,330,'<%=path%>/check/ckeckImpUI.do');
			}
			function updateTureCheck(){
				var rows=$("#D_Check").datagrid("getSelections");
				var length = rows.length;
				if(length==0){
					$.messager.alert('错误','请选择一条数据进行修改','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					createmodalwindow('修改盘点信息',770,330,'<%=path%>/check/updateTureCheckUI.do?id='+id);
				}
			}
			function updateInveter(){
				var obj;
				var rows=$("#D_Check").datagrid("getSelections");
				var length = rows.length;
				if(length!=0){
					$.messager.confirm('友情提示', "确定确认这<font color='red'>"+length+"</font>条数据？", function(r){ 
						if (r){ 
							var ids="";
							for(var i=0;i<length;i++){
								if(i==0){
									ids += rows[i].id;
								}else{
									ids += ','+rows[i].id;
								}						
							}
							$("#ids").val(ids);
							$.post('<%=path%>/check/updateInvectory.do?ids='+ids,
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
											setTimeout(function(){
												parent.closemodalwindow();
												parent.reload("#D_Check");
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
										}	hideBg();
									}		
								)
						}
					})
				}else{
					$("#companycode").val($("#companyw").val());
					$("#storage").val($("#storagew").val());
					
					$.messager.confirm('友情提示', "确定库存？", function(r){ 
						if (r){ 
							obj = $("#f_chekc_export").serializeJson();
							$.post('<%=path%>/check/updateInvectory.do',obj,
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
											setTimeout(function(){
												parent.closemodalwindow();
												parent.reload("#D_Check");
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
										}	hideBg();
									}		
								)
						}
					})
				}
			}
		  	function deleteCheck(){
		  		showBg()
				var rows=$("#D_Check").datagrid("getSelections");
				var length = rows.length;
				if(length==0){
					hideBg();
					$.messager.alert('错误','请至少选择一行数据进行删除','error');
				}else{
					var ids="";
					for(var i=0;i<length;i++){
						if(i==0){
							ids += rows[i].id;
						}else{
							ids += ','+rows[i].id;
						}
					}
					$.post('<%=path%>/check/delete.do',{ids:ids},
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
									parent.reload("#D_Check");
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
			}
		  	$('#codew').combobox({    
			    url:'<%=path%>/check/findCode.do',    
			    valueField:'code',    
			    textField:'code' ,
			   panelHeight:'auto',
			});
		  	$('#isdelete').combobox({    
		  		valueField: 'label',
				textField: 'value',
				panelHeight:'auto',
			  	data: [{
					label: '0',
					value: '正在盘点'
				},{
					label: '1',
					value: '历史盘点'
				}],
		  	});
		</script>
	<div>
		<form id="findCheck"  method="post">
		&nbsp;盘点记录：<input id="codew"name="tCheck.code">
		&nbsp;盘点记录：<input id="isdelete"name="tCheck.isdelete">
		&nbsp;商家编码：<input id="companyw"name="tCheck.companycode" class="easyui-textbox"   data-options="width:'70'">
		&nbsp;库位编码：<input id="storagew"name="tCheck.storage" class="easyui-textbox"   data-options="width:'70'">
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryCheck()" data-options="iconCls:'icon-search'" >查询</a>
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="ImportCkeck()" data-options="iconCls:'icon-print'">导入</a>
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="updateTureCheck()" data-options="iconCls:'icon-print'">修改盘点信息</a>
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="updateInveter()" data-options="iconCls:'icon-add'">更新库存</a>
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="deleteCheck()" data-options="iconCls:'icon-add'">完结盘点</a>
		</form>
		</div>
		<div id="D_Check" style="height: 96%"></div>
		<form id="f_chekc_export" action="<%=path%>/check/updateInvectory.do?" method="post">
			<input type="hidden" name="tCheck.companycode" id="companycode"/>
			<input type="hidden"  name="tCheck.storage" id="storage"/>
		</form>
	</body>
	<script type="text/javascript">
		
	</script>
</html>