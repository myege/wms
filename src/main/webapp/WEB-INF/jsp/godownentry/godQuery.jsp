<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>入库管理</title>
	</head>
	<body>
		<script type="text/javascript">
	$(function(){
		$("#d_godownentry").datagrid({
			idField    :'id',
            url        :'<%=path%>/godownentry/findAll.do',
            columns    :[
                [
					{field :'id',checkbox : true,align :'center'},
                    {field :'godowndh', title :'入库单号', width :10, align :'center'},
                    {field :'deliverydh', title :'送货单号', width :10, align :'center'},
                    {field :'companycode', title :'商家编码', width :10, align :'center'},
                    {field :'companyname',title :'商家名称', width : 10,align :'center'},
                    {field :'cases', title :'总箱数', width :10, align :'center'}, 
                    {field :'num', title :'总数', width :10, align :'center'},
                    {field :'arrivaltime', title :'到货时间', width :10, align :'center',
                    	formatter:function(value){
                    		return formatDate(value);
                    	}	
                    },
                    {field :'name', title :'操作人', width :10, align :'center'},
                    {field :'receiptname',title :'收货人', width : 10,align :'center'},
                    {field :'receipttime', title :'收货时间', width :10, align :'center',
                    	formatter:function(value){
                    		return formatDate(value);
                    	}		
                    }, 
                ]
            ],
            fitColumns :true,
            pagination :true,
            pageSize   :50,
            pageList   :[10,25,50],
            onLoadSuccess:function(){
            	unSelect("#f_godownentry");
            }
		})
	})
	function deleteGod(){
		var rows=$("#d_godownentry").datagrid("getSelections");
		var length = rows.length;
		if(length==0){
			$.messager.alert('错误','请至少选择一行数据进行删除','error');
		}else{
			showBg();
			var ids="";
			for(var i=0;i<length;i++){
				if(i==0){
					ids += rows[i].id;
				}else{
					ids += ','+rows[i].id;
				}
			}
			$.post('<%=path%>/godownentry/deleteGod.do',{ids:ids},
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
							parent.reload("#d_godownentry");
							$('#d_showItem').datagrid('loadData', { total: 0, rows: [] });  
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
	
	function queryGod(){
		var obj = $("#f_godownentry").serializeJson();
		$("#d_godownentry").datagrid('load',obj);
	}
	function addGod(){
		createmodalwindow('新增入库单',770,600,'<%=path%>/godownentry/addUI.do');		
	}
	function updateType() {
		var rows=$("#d_godownentry").datagrid("getSelections");
		var length = rows.length;
		if(length==0){
			$.messager.alert('错误','请至少选择一行数据进行收货','error');
		}else{
			showBg();
			var ids="";
			for(var i=0;i<length;i++){
				if(i==0){
					ids += rows[i].id;
				}else{
					ids += ','+rows[i].id;
				}
				
			}
			$.post('<%=path%>/godownentry/update.do',{ids:ids},
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
							parent.reload("#d_godownentry");
							parent.reload("#d_shelf");
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
	$('#d_godownentry').datagrid({
		onClickRow: function(rowIndex,rowData){
			 $('#d_showItem').datagrid({
				 idField    :'id',
		       	 url        :'<%=path%>/godownentry/findSkuById.do?godowndh='+rowData.godowndh,
		         method     :'post',
		         columns    :[
		            [
							{field : 'id',checkbox : true,align : 'center'},
							{field :'godowndh', title :'入库单号', width :40, align :'center'},
							{field :'itemcode', title :'商品条码', width :40, align :'center'},
							{field :'companycode', title :'商家编码', width :40, align :'center'},
							{field :'sum', title :'数量', width :40, align :'center'},
							{field :'sku', title :'料号', width :40, align :'center'},
							{field :'betterusedata', title :'保质期至', width :40, align :'center',
								formatter:function(value){
		                    		return formatDate(value);
		                    	}	
							},
				    ]
		         ],
		         fitColumns :true,
			 });
		 }
	 });
	function ImpGod(){
		createmodalwindow('导入入库单',770,330,'<%=path%>/godownentry/godImpUI.do');
	}
	
	
	
	
/* 入库单列表：入库单号、送货单号、商家编码、商家名称、总箱数、总数、到货时间、操作人、收货人、收货时间
查询 ：入库单号、商家编码、到货时间
新增入库单（r_godownentry、r_godownentry_sku）：送货单号、商家名称（下拉）、总箱数、到货时间。商品(条码、数量、保质期)校验商品表，获取商品表信息
收货：type修改，上架表新增数据（按照入库单）
 */

		</script>
		<form id="f_godownentry">
		 	<c:if test="${modular.contains('godownentry_query')}">
		 	&nbsp;商家编码：<input name="godownentryCustom.companycode" id = "anycode" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;入库单号：<input  name="godownentryCustom.godowndh" id="anyname" class="easyui-textbox"   data-options="width:'148'">
			 &nbsp;到货时间：<input name="godownentryCustom.findarrivaltime"  id="pttime" class="easyui-datebox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryGod()" data-options="iconCls:'icon-search'" >查询</a> 
			</c:if>
			<c:if test="${modular.contains('godownentry_all')}">
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="addGod()" data-options="iconCls:'icon-add'">添加</a>
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="ImpGod()" data-options="iconCls:'icon-print'">批量导入</a>
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="updateType()" data-options="iconCls:'icon-undo'">收货</a>
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="deleteGod()" data-options="iconCls:'icon-remove'">删除</a>
			&nbsp;<a style='color: blue'href='<%=path%>/import/GodownentryImpl.xlsx'>下载入库单模板</a>
			</c:if>
		</form>
		<div id="d_godownentry" style="OVERFLOW:auto;WIDTH:100%;HEIGHT:70%"></div>
		<br><br>
		
		<div id="d_showItem"></div>
	</body>
</html>