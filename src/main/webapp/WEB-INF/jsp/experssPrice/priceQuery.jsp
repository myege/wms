<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>对外报价</title>
		
	</head>
	<body>
<script type="text/javascript">
	$(function(){
		$("#D_price").datagrid({
			idField    :'id',
            url        :'<%=path%>/experssPrice/findAll.do',
            columns    :[
                [
					{field :'id',checkbox : true,align :'center'},
                    {field :'expressno', title :'快递编码', width :30, align :'center'},
                    {field :'initial', title :'发件省', width :15, align :'center'},
                    {field :'bourn', title :'收件省', width :30, align :'center'},
                    {field :'maxweight',title :'重量>3kg件首重', width : 30,align :'center'},
                    {field :'maxnext', title :'重量>3公斤续重', width :15, align :'center'},
                    {field :'minweight', title :'重量≤3kg件首重', width :30, align :'center'}, 
                    {field :'minnext',title :'重量≤3kg件续重', width : 30,align :'center'},
                    {field :'aging', title :'时效', width :30, align :'center'}, 
                    {field :'istax', title :'是否含税', width :15, align :'center',
                    	formatter:function(value){
                    		if(value=="1")return "是";
                    		if(value="2")return "否";
                    	}	
                    },
                    {field :'type', title :'运输类型', width :15, align :'center',
                    	formatter:function(value){
                    		if(value=="1")return "汽运";
                    		if(value="2")return "航空";
                    	}	
                    }
                ]
            ],
            fitColumns :true,
            pagination :true,
            pageSize   :50,
            pageList   :[10,25,50],
            onLoadSuccess:function(){
            	unSelect("#find_price");
            }
		})
	})
	function update_price(){
		var rows=$("#D_price").datagrid("getSelections");
		var length = rows.length;
		if(length!=1){
			$.messager.alert('错误','只能选择一条数据进行修改','error');
			return;
		}else{
			var id = rows[0].id;
			createmodalwindow('修改价格',770,330,'<%=path%>/experssPrice/updateUI.do?id='+id);
		}
	}
	
	
	function Import_price(){
		createmodalwindow('导入报价',770,330,'<%=path%>/experssPrice/priceImpUI.do');
	}
	
	function query_price(){
		var obj = $("#find_price").serializeJson();
		$("#D_price").datagrid('load',obj);
	}
	$('#PriceExperssName').combobox({    
	    url:'<%=path %>/express/findCox.do',    
	    valueField:'express',    
	    textField:'expressname' ,
	    panelHeight:'auto',
	    onLoadSuccess: function (data) {
	        if (data) {
	            $('#PriceExperssName').combobox('setValue',data[0].id);
	        }
	    },
	  	 onSelect: function(){
	         $('#experssCode').val($('#PriceExperssName').combobox('getValue'));
	     }
	})
	
</script>
	<div>
		<form id="find_price">
			&nbsp;快递公司：<input id="PriceExperssName" data-options="width:'148'">
			<input name="experssPrice.expressno" id="experssCode" hidden="">
			&nbsp;&nbsp;&nbsp;收件省：<input  name="experssPrice.bourn"  class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="query_price()" data-options="iconCls:'icon-search'" >查询</a>
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="Import_price()" data-options="iconCls:'icon-print'">导入</a>
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="update_price()" data-options="iconCls:'icon-remove'">修改</a>
			&nbsp;<a style='color: blue'href='<%=path%>/import/_price.xlsx'>下载对外报价模板</a>
		</form>
	</div>
	<div id="D_price" style="OVERFLOW:auto;WIDTH:100%;HEIGHT:96%"></div>
	</body>
</html>