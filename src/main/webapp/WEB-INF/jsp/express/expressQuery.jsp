<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
	<title>快递理管</title>
	
</head>
<body>
<script type="text/javascript">
	$(function(){
		$("#D_Express").datagrid({
			idField    :'id',
            url        :'<%=path%>/express/findAll.do',
            columns    :[
                [
					{field :'id',checkbox : true,align :'center'},
                    {field :'express', title :'快递编号', width :30, align :'center'},
                    {field :'expressname', title :'快递名称', width :30, align :'center'},
                    {field :'isuse', title :'类别', width :15, align :'center',
                    	formatter:function(value){
                    		if(value=='1'){
                    			return '启用';
                    		}else if(value=='0'){
                    			return '未启用';
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
            	unSelect("#findExpress");
            }
		})
	})
	function updeteEx(code){
		var rows=$("#D_Express").datagrid("getSelections");
		if(rows.length==0){
			$.messager.alert('错误','请选择一行进行更改状态','error');
		}else{
			var ids="";
			for(var i=0;i<rows.length;i++){
				if(i==0){
					ids += rows[i].id;
				}else{
					ids += ','+rows[i].id;
				}
			}
			$.messager.confirm('Confirm', '确定更改快递状态么吗？', function(r){
				if (r){
					update(ids,code);
				}
			});
		}
	}
	function update(ids,code){
		showBg();
		$.post('<%=path%>/express/update.do?code='+code,{ids:ids},
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
						parent.reload("#D_Express");
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
	
	/*列表：模板编号、模板名称、类别、创建时间、操作
新增模板：模板编号、模板名称、类别
操作：设计、删除

  */
function addEx(){
	createmodalwindow('添加快递',770,330,'<%=path%>/express/addUI.do');
}
  	
  	
		</script>
	<div>
		<form id="findExpress">
		<c:if test="${modular.contains('express_all')}">
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="addEx()" data-options="iconCls:'icon-add'">添加</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="updeteEx('1')" data-options="iconCls:'icon-add'">启用快递</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="updeteEx('0')" data-options="iconCls:'icon-add'">关闭快递</a>
		</c:if>
		</form>
		</div>
		<div id="D_Express" style="height: 96%"></div>
	</body>
</html>