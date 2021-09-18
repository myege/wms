<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
	</head>
	<body>
		<script type="text/javascript">
			$(function(){						
				$("#d_shelf").datagrid({
					idField    :'id',
		            url        :'<%=path%>/shelf/findAll.do?',
		            queryParams:{'shelfCustom.type':0},
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'godowndh', title :'入库单号', width :30, align :'center'},
		                    {field :'companycode', title :'商家编码', width :30, align :'center'},
		                    {field :'itemcode', title :'商品条码', width :30, align :'center'},
		                    {field :'itemname', title :'商品名称', width :30, align :'center'},
		                    {field :'sku', title :'料号', width :30, align :'center'},
		                    {field :'sum', title :'数量', width :30, align :'center'},
		                    {field :'betterusedata', title :'保质期至', width :30, align :'center',
		                    	formatter:function(value){
		                    		return formatDate2(value);
		                    	}	
		                    },
		                    {field :'shelvedate', title :'上架时间', width :30, align :'center',
		                    	formatter:function(value){
		                    		return formatDate(value);
		                    	}
		                    },
		                    {field :'tostorage', title :'上架库位', width :30, align :'center'},
		                    {field :'name', title :'上架人', width :30, align :'center'},
		                ]
		            ],
		            fitColumns :true,
		            pagination :true,
		            pageSize   :10,
		            pageList   :[10,25,50],
		            onLoadSuccess:function(){
		            	unSelect("#d_shelf");
		            }
				})
	
				
			})

			function queryShelf(){
				var obj = $("#f_shelf").serializeJson();
				$("#d_shelf").datagrid('load',obj);
			}
			function shelfUI(){
				var rows=$("#d_shelf").datagrid("getSelections");
				var length = rows.length;
				if(length!=1){
					$.messager.alert('错误','请选择一条数据进行上架','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					$.post('<%=path%>/shelf/checkIsShelf.do?',{id:id},
							function(r){
								if(r){
									createmodalwindow('上架',600,200,'<%=path%>/shelf/shelfUI.do?id='+id);
								}else{
									$.messager.alert('错误','已上架','error');
								}
							}		
					)
					
				}
			}
			function shelfUI2(){//批量上架
			//	alert("12312");
				createmodalwindow('批量上架',600,200,'<%=path%>/shelf/shelfUIpl.do?id=1');
				
			}
			
			
		</script>
		<form id="f_shelf">
			&nbsp;
			<select name="shelfCustom.type"  id="type"  class="easyui-combobox" style="width:148px" data-options="editable:false,panelHeight:'auto'" >
				<option value="">全部</option>
				<option value="0" selected="selected">未上架</option>
				<option value="1">已上架</option>
			</select>
			&nbsp;&nbsp;&nbsp;入库单号：<input name="shelfCustom.godowndh" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;商家编码：<input  name="shelfCustom.companycode" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;料号：<input  name="shelfCustom.sku" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryShelf()" data-options="iconCls:'icon-search'" >查询</a>
			<br/>
			<c:if test="${modular.contains('shelf_all')}">
			&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="shelfUI()" data-options="iconCls:'icon-add'">上架</a>
			
			&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="shelfUI2()" data-options="iconCls:'icon-add'">批量上架</a>
			</c:if>
		</form>	
		<div id="d_shelf" style="height:93%"></div>

		
	
	</body>
</html>