<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/include/global_java.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户基本信息</title>
<%@include file="/WEB-INF/include/global_css.jsp" %>
<%@include file="/WEB-INF/include/global_js.jsp" %>
<script>
	function formatOperateColumn(value, row) {
		return '<a href="#" class="icon-edit" style="display:inline-block;width:40px;"  onclick="editUser(\'' + row.userId + '\')">&nbsp;</a>' +
			'<a href="#" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteUser(\'' + row.userId + '\')">&nbsp;</a>'
			;
	}
	
	function editUser(id) {
		
		window.location.href='edit.action?userId=' + id ;
	}
	
	function deleteUser(id) {
		
		$.ajax({
			async:true, //是否异步
			type : "post",
			url : 'deleteAj.action?userId=' + id ,
			success : function(data) {
				if(data.code ){//失败
					alert(data.message);
				}else{//成功
					$.messager.alert('提示','删除成功');
					doSearch() ;
				}
				
			}

		});
		
	}
	
	function newUser(){
		window.location.href = 'edit.action' ;
	}
	
	function doSearch(){
		 $('#dgArea').datagrid({
			 queryParams: {
				 "userId":$('#userId').val(), 
				
			} 
		 });
	}

</script>
</head>
<body>

	<div id="toolbar">
		<form id='formAreaQuery'>
			<div style="padding:6px;padding-top: 15px;">
				<span>用户ID:</span>
				<input id="userId" style="height:20px;border:1px solid #ccc">
				<a href="#" class="easyui-linkbutton" style="width:60px" onclick="doSearch()">查询</a>
			</div>
			<div>
				<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">修改</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="delUser()">删除</a>
			</div>
		</form>
	</div>

		<table id="dgArea" class="easyui-datagrid" data-options="url:'SysMainAccout_page_json.action' ,fit:true,toolbar:'#toolbar',singleSelect:true,collapsible:true,method:'get',pagination:'true',fitColumns:true">
			<thead>
				<tr>
					<th data-options="field:'operate_column',width:160,align:'center',formatter:formatOperateColumn">操作</th>
					<th data-options="field:'userId',width:180,align:'center'">用户ID</th>
					<th data-options="field:'bankcardId',width:200,align:'center'">银行卡ID</th>
					<th data-options="field:'balance',width:200,align:'center'">余额</th>
					<th data-options="field:'date',width:200,align:'center'">时间</th>
					<th data-options="field:'dealType',width:200,align:'center'">交易类型</th>
				</tr>
			</thead>
		</table>
</body>
</html>