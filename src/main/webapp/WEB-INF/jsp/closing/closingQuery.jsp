<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
	<title>快递结算</title>
</head>
<body>
<script type="text/javascript">
	$(function(){
		$("#D_closing").datagrid({
			idField    :'id',
            url        :'<%=path%>/closing/findAll.do',
            columns    :[
                [
					{field :'id',checkbox : true,align :'center'},
                    {field :'orderno', title :'订单号', width :30, align :'center'},
                    {field :'experssno', title :'快递单号', width :30, align :'center'}, 
                    {field :'experss', title :'快递公司', width :30, align :'center'},
                    {field :'companyno', title :'公司编码', width :15, align :'center'},
                    {field :'initial',title :'始发地', width : 30,align :'center'},
                    {field :'bourn', title :'收件地', width :30, align :'center'},
                    {field :'weight', title :'重量', width :15, align :'center'},
                    {field :'createtime', title :'订单创建时间', width :15, align :'center',
                    	formatter:function(value){
                    		return formatDate(value);
                    	}	
                    },
                    {field :'outmoney', title :'应付金额', width :30, align :'center' }, 
                    {field :'outtime', title :'付钱时间', width :15, align :'center',
                    	formatter:function(value){
                    		return formatDate(value);
                    	}
                    },
                    {field :'outtype',title :'付款状态', width : 30,align :'center',
                    	formatter:function(value){
                    		if(value==1){
                    			return "已结算"
                    		}
                    		if(value==2){
                    			return "异常订单"
                    		}
                    		if(value==0){
                    			return "未结算"
                    		}
                    	}	
                    },
                    {field :'money', title :'应收金额', width :30, align :'center' }, 
                    {field :'endtime', title :'收钱时间', width :15, align :'center',
                    	formatter:function(value){
                    		return formatDate(value);
                    	}
                    },
                    {field :'type',title :'收款状态', width : 30,align :'center',
                    	formatter:function(value){
                    		if(value==1){
                    			return "已结算"
                    		}
                    		if(value==2){
                    			return "异常订单"
                    		}
                    		if(value==0){
                    			return "未结算"
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
            	unSelect("#find_closing");
            }
		})
	})
	function query_closing(){
		var obj = $("#find_closing").serializeJson();
		$("#D_closing").datagrid('load',obj);
	}
	function jies_closing(){
		var obj = $("#find_closing").serializeJson();
		var row = $('#D_closing').datagrid('getSelections');
		var ids = "";
		var url = "";
		if (row.length != 0) {
			for (var i = 0; i < row.length; i++){
      			var ids = ids + row[i].id +",";
          	}
			url = "<%=path%>/closing/updetePrice.do",{ids:ids};
		}else{
			url = "<%=path%>/closing/updetePrice.do",obj;
		}
	}
	function jies_closing(url){
		
		var obj = $("#find_closing").serializeJson();
		var row = $('#D_closing').datagrid('getSelections');
		var ids = "";
		if (row.length == 0) {
			$.messager.confirm('系统提示','确定要结算全部么?',function(r){
		if(r){
			showBg();
			$.post('<%=path%>/closing/'+url+'.do',obj,
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
								parent.reload("#D_closing");
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
		}else{
			for (var i = 0; i < row.length; i++){
      			var ids = ids + row[i].id +",";
          	}
			$.messager.confirm('友情提示', "确定结算这几条么？", function(r){
			if (r){ 
			showBg();
				$.post('<%=path%>/closing/'+url+'.do',{ids:ids},
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
									parent.reload("#D_closing");
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
	function update_closing(){
		var rows=$("#D_closing").datagrid("getSelections");
		var length = rows.length;
		if(length!=1){
			$.messager.alert('错误','只能选择一条数据进行修改','error');
			return;
		}else{
			var id = rows[0].id;
			createmodalwindow('修改订单内容',660,220,'<%=path%>/closing/updateUI.do?id='+id);
		}
	}
	$('#namePrice').combobox({    
	    url:'<%=path %>/godownentry/findCom.do',    
	    valueField:'companycode',    
	    textField:'companyname' ,
	    onLoadSuccess: function (data) {
	        if (data) {
	            $('#namePrice').combobox('setValue',data[0].id);
	        }
	    },
	  	 onSelect: function(){
	         $('#priceCompany').val($('#namePrice').combobox('getValue'));
	     }
	})
	$('#experssName').combobox({    
	    url:'<%=path %>/express/findCox.do',    
	    valueField:'express',    
	    textField:'expressname' ,
	    panelHeight:'auto',
	    onLoadSuccess: function (data) {
	        if (data) {
	            $('#experssName').combobox('setValue',data[0].id);
	        }
	    },
	  	 onSelect: function(){
	         $('#priceExperss').val($('#experssName').combobox('getValue'));
	     }
	})
</script>
<div>
	<form id="find_closing">
	
		<input name="tOrderClosing.experss" id='priceExperss'hidden="">
		<input name="tOrderClosing.companyno" id='priceCompany' hidden="">
		&nbsp;快递单号：<input name="tOrderClosing.experssno" class="easyui-textbox"   data-options="width:'148'">
		&nbsp;快递公司：<input  id="experssName"  data-options="width:'148'">
		&nbsp;商家编码：<input  id="namePrice"  data-options="width:'148'">
		&nbsp;&nbsp;&nbsp;收件省：<input  name="tOrderClosing.bourn"  class="easyui-textbox"   data-options="width:'148'">
		&nbsp;应收状态：<select  class="easyui-combobox" name="tOrderClosing.type" data-options="editable:false,panelHeight:'auto'" style="width:100px;">
				<option value="" selected="selected">全部</option>
				<option value="0" >未结算</option>
				<option value="2">异常订单</option>	
				<option value="1">已结算</option>	
			 </select> 
		 &nbsp;应付状态：<select  class="easyui-combobox" name="tOrderClosing.outtype" data-options="editable:false,panelHeight:'auto'" style="width:100px;">
			<option value="" selected="selected">全部</option>
			<option value="0" >未结算</option>
			<option value="2">异常订单</option>	
			<option value="1">已结算</option>	
		 </select>
		&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="query_closing()" data-options="iconCls:'icon-search'" >查询</a>
		&nbsp;<a href="#" class="easyui-linkbutton" onclick="jies_closing('updetePrice')" data-options="iconCls:'icon-print'">结算收款</a>
		&nbsp;<a href="#" class="easyui-linkbutton" onclick="jies_closing('updetePriceOut')" data-options="iconCls:'icon-print'">结算付款</a>
		&nbsp;<a href="#" class="easyui-linkbutton" onclick="update_closing()" data-options="iconCls:'icon-remove'">修改</a>
	</form>
</div>
<div id="D_closing"style="height: 96%"></div>
</body>
<script type="text/javascript">

</script>
</html>