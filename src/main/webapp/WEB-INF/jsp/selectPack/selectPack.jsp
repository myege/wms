<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
	<title>复核模式</title>
</head>
<body>
<script type="text/javascript">
$("#selectPack_show").datagrid({
	idField    :'id',
	 url        :'<%=path%>/selectPack/findAll.do',
       columns    :[
           [
           		{field :'id',checkbox : true,align :'center'},
               {field :'name', title :'名字',width :10 ,align :'center'},
               {field :'bm', title :'控件编码',width:15,  align :'center'},
               {field :'status', title :'状态', width :15, align :'center',
            	   formatter:function(value){
						if(value==1){
							return "启用";
						}else if(value==0){
							return "不启用";
						}
					}
              }
           ]
       ],
   	fitColumns :true,
	pagination :true,
	pageSize   :50,
	pageList   :[10,25,50],
	
	singleSelect: true,
	onLoadSuccess:function(){
       	unSelect("#selectPack_show");
    }

})

function updatePack(code){
		
	var rows=$("#selectPack_show").datagrid("getSelections");
	var length = rows.length;
	if(length!=1){
		$.messager.alert('错误','只能选择一条数据进行修改','error');
		return;
	}else{
		var id = rows[0].id;
		$.post('<%=path%>/selectPack/update.do?id='+id+'&code='+code,
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
							parent.reload("#selectPack_show");
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
	
}

</script>
<div>
	&nbsp;<a href="#" class="easyui-linkbutton" onclick="updatePack(0)" data-options="iconCls:'icon-add'">关闭</a>
	&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="updatePack(1)" data-options="iconCls:'icon-edit'">开启</a>
</div>
<div id="selectPack_show"></div>
</body>
</html>