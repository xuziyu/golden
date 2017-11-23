<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/include/global_java.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@include file="/WEB-INF/include/global_css.jsp" %>
<%@include file="/WEB-INF/include/global_js.jsp" %>

<script>
	function formatOperateColumn(value, row) {
		return '<a href="#" class="icon-edit" style="display:inline-block;width:40px;"  onclick="editArea(\'' + row.departmentId + '\')">&nbsp;</a>' +
			'<a href="#" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteArea(\'' + row.departmentId + '\')">&nbsp;</a>'
			;
	}
	
	function editRow(id) {
		//alert('修改' + id);
		window.location.href='edit.action?departmentId=' + id ;
	}
	
	function deleteRow(id) {
		alert('删除' + id);
	}
	
	function newArea(){
		window.location.href = 'edit.action' ;
	}
	


</script>
</head>
<body>
	
	<div id="toolbar">
		<form id='formAreaQuery'>
			<div style="padding:6px;padding-top: 15px;">
				<span>父组织ID:</span>
				<input id="parentDepartmentId" style="height:20px;border:1px solid #ccc">
				<span>部门名称:</span>
				<input id="departmentName" style="height:20px;border:1px solid #ccc">
			
				<a href="#" class="easyui-linkbutton" style="width:60px" onclick="doSearch()">查询</a>
			</div>
			<div>
				<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newObject()">新增</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="edit()">修改</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="deletem()">删除</a>
			</div>
		</form>
	</div>

		<table id="dgArea" class="easyui-datagrid" data-options="url:'page_json.action' ,fit:true,toolbar:'#toolbar',singleSelect:true,collapsible:true,method:'get',pagination:'true',fitColumns:true">
			<thead>
				<tr>
					<th data-options="field:'operate_column',width:160,align:'center',formatter:formatOperateColumn">操作</th>
					<th data-options="field:'parentDepartmentId',width:180,align:'center'">父组织</th>
					<th data-options="field:'departmentName',width:200,align:'center'">部门名称</th>
					<th data-options="field:'departmentTime',width:200,align:'center',formatter:date">创建时间</th>
					<th data-options="field:'departmentStatus',width:200,align:'center',formatter:status">部门状态</th>
					<th data-options="field:'departmentEscribes',width:200,align:'center',formatter:date">描述</th>
					<
					
				</tr>
			</thead>
		</table>
</body>
</html>