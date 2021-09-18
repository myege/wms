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
		$("#d_plangod").datagrid({
			idField    :'id',
            url        :'<%=path%>/plangod/findAll.do',
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
               /*      {field :'name', title :'操作人', width :10, align :'center'},
                    {field :'receiptname',title :'收货人', width : 10,align :'center'},
                    {field :'receipttime', title :'入库时间', width :10, align :'center',
                    	formatter:function(value){
                    		return formatDate(value);
                    	}		
                    }, */
                    {field :'type',title :'是否到货', width : 10,align :'center',
                    	formatter:function(value){
                    		if(value==0){
                    			return "未到货"
                    		}else if(value=1){
                    			return "已到货"
                    		}
                    	}		
                    },
                ]
            ],
            fitColumns :true,
            pagination :true,
            pageSize   :50,
            pageList   :[10,25,50],
            onLoadSuccess:function(){
            	unSelect("#d_plangod");
            }
		})
	})
	function queryplanGod(){
		var obj = $("#f_plangod").serializeJson();
		$("#d_plangod").datagrid('load',obj);
	}
	
	

	$('#d_plangod').datagrid({
		onClickRow: function(rowIndex,rowData){
			 $('#d_plangod_sku').datagrid({
				 idField    :'id',
		       	 url        :'<%=path%>/plangod/findSkuById.do?godowndh='+rowData.godowndh,
		         method     :'post',
		         columns    :[
		            [
							{field : 'id',checkbox : true,align : 'center'},
							{field :'godowndh', title :'入库单号', width :40, align :'center'},
							{field :'itemcode', title :'商品条码', width :40, align :'center'},
							{field :'companycode', title :'商家编码', width :40, align :'center'},
							{field :'sum', title :'数量', width :40, align :'center'},
							{field :'truesum', title :'实到数量', width :40, align :'center'},
							{field :'sku', title :'料号', width :40, align :'center'},
							{field :'betterusedata', title :'保质期至', width :40, align :'center',
								formatter:function(value){
		                    		return formatDate(value);
		                    	}	
							},
							 {field: 'opt', title: '操作', width: 10, align: 'center',
			                   	formatter: function (value,row,index) { //参数row表示当前行, 参数index表示当前行的索引值  
			                	var bt = '<a href="javascript:void(0);"  onclick="updateSumUI(\'' +row.id+","+row.sum+ '\')">到货</a>'
			                       return bt;  
			               	 	}
							 }
				    ]
		         ],
		         fitColumns :true,
			 });
		 }
	 });
function updateSumUI(id){
	var row = id.split(",")
	$('#updateSum').dialog('open').dialog('setTitle','到货');//调用弹窗
	
	$('#updateSum').form('clear');
	/* document.getElementById("upsum").innerHTML=row[1] */
	document.getElementById("upId").value=row[0]
}
function updateSum(){
	var sum = $('#tureSum').numberbox('getValue');
	var id = $('#upId').val();
	var dv = $('#betterUseData').datebox('getValue'); 
	$.post('<%=path %>/plangod/updateSum.do?sum='+sum+'&id='+id+'&dv='+dv,
			function(date){
		 if(date == 1){
			 $.messager.show({
					title:'成功',
					msg:"添加成功"
				})
			$('#updateSum').dialog('close');
			$('#d_plangod_sku').datagrid('reload'); 
		}else{
			$.messager.show({
				title:'失败',
				msg:"添加失败"
			})
		}
	})

}
function updateType() {
	var rows=$("#d_plangod").datagrid("getSelections");
	var length = rows.length;
	if(length==0){
		$.messager.alert('错误','请至少选择一行数据进行收货','error');
	}else{
		showBg();
		var ids="";
		for(var i=0;i<length;i++){
			if(i==0){
				if(rows[i].type==1){
					alert("已到货单子不能再一次到货");
					hideBg();
					return;
				}
				ids += rows[i].id;
			}else{
				if(rows[i].type==1){
					alert("已到货单子不能再一次到货");
					hideBg();
					return;
				}
				ids += ','+rows[i].id;
			}
			
		}
		$.post('<%=path%>/plangod/update.do',{ids:ids},
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
						parent.reload("#d_plangod");
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
function closeplan() {
	parent.closemodalwindow();
}


		</script>
		<form id="f_plangod">
		 	&nbsp;商家编码：<input name="plangodownentryCustom.companycode" id = "anycode" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;入库单号：<input  name="plangodownentryCustom.godowndh" id="anyname" class="easyui-textbox"   data-options="width:'148'">
			<!--  &nbsp;到货时间：<input name="plangodownentryCustom.findarrivaltime"  id="pttime" class="easyui-datebox"   data-options="width:'70'"> -->
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryplanGod()" data-options="iconCls:'icon-search'" >查询</a> 
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="updateType()" data-options="iconCls:'icon-undo'">入库</a>
			<!-- &nbsp;<a href="#" class="easyui-linkbutton" onclick="deleteGod()" data-options="iconCls:'icon-remove'">删除</a> -->
		</form>
		<div id="d_plangod" style="OVERFLOW:auto;WIDTH:100%;HEIGHT:70%"></div>
		<br><br>
	<div id="updateSum" class="easyui-dialog" title="Basic Dialog"  data-options="modal:true,closed:true,iconCls:'icon-remove'"  style="width:300px;height:200px;padding:10px" >
	<br>
		<div align="center">
		<input id="upId" hidden="">
		<!-- 已到数量 <span id="upsum"></span> -->到　货　数　量:<input class="easyui-numberbox"id="tureSum"><br>
		保　　质　　期:<input class="easyui-datebox"id='betterUseData' name="betterUseData">
		
		<br><br><br><br><br>
		<a href="#" class="easyui-linkbutton" onclick="updateSum()" id="submit" data-options="iconCls:'icon-save'" style="width:'70'">保存</a>
		
		
		</div>
		</div>
		<div id="d_plangod_sku"></div>
	</body>
</html>