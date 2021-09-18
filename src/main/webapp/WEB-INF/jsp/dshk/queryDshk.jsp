<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>代收货款管理</title>
	</head>
	<body>
		<script type="text/javascript">
			$(function(){
				$("#d_dshk").datagrid({
					idField    :'id',
		            url        :'<%=path%>/dshk/findAll.do?dshkCustom.isdelete=0',
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'companycode', title :'商家编码', width :30, align :'center'},
		                    {field :'orderno', title :'订单号开头', width :30, align :'center'},
		                    {field :'worth', title :'金额', width :15, align :'center' },
		                    {field :'sendname',title :'发件人', width : 30,align :'center'},
		                    {field :'sendtel', title :'发件人电话', width :30, align :'center'}, 
		                    {field :'sendaddress', title :'发件地址', width :15, align :'center' },
		                    {field :'createtime', title :'创建时间', width :15, align :'center',
		                    	formatter:function(value){
		                    		if(value==null || value == ''){
		                    			return '';
		                    		}else{
		                    			return formatDate(value);
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
		            	unSelect("#d_dshk");
		            }
				})
			})
			function queryDshk(){
				var obj = $("#f_dshk").serializeJson();
				$("#d_dshk").datagrid('load',obj);
			}
			function addDshk(){
				createmodalwindow('添加用户',800,300,'<%=path%>/dshk/addUI.do');
			}
			function updateDshk(){
				var rows=$("#d_dshk").datagrid("getSelections");
				var length = rows.length;
				if(length==0){
					$.messager.alert('错误','请选择一条数据进行修改','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					createmodalwindow('修改用户',800,300,'<%=path%>/dshk/updateUI.do?id='+id);
				}
				
			}
			function deleteManyDshk(){
				var rows=$("#d_dshk").datagrid("getSelections");
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
										$.post('<%=path%>/dshk/delete.do',{ids:ids},
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
														parent.reload("#d_dshk");
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

		</script>
		<div>
		<form id="f_dshk">
			&nbsp;商家编码：
			<select name="dshkCustom.companycode" class="easyui-combobox" data-options="editable:false" >
				<option value="">请选择</option>
				<c:forEach items="${companyList }" var="item">
					<option value="${item.companycode}">${item.companycode}</option>
				</c:forEach>
			</select>
			&nbsp;&nbsp;&nbsp;订单号：<input  name="dshkCustom.orderno" class="easyui-textbox"   data-options="width:'70'">
			&nbsp;&nbsp;&nbsp;创建时间：<input name="dshkCustom.startTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'最小创建时间'">
			至 <input name="dshkCustom.endTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'最大创建时间'">

			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryDshk()" data-options="iconCls:'icon-search'" >查询</a>
			<br/>
			<c:if test="${modular.contains('dshk_all')}">
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="addDshk()" data-options="iconCls:'icon-add'">添加</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="updateDshk()" data-options="iconCls:'icon-edit'">修改</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="deleteManyDshk()" data-options="iconCls:'icon-remove'">删除</a>
			</c:if>
		</form>
		</div>
		<div id="d_dshk"></div>
	</body>
</html>