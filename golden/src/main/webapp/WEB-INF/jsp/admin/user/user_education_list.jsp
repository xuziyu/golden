<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/include/global_java.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>list</title>
<%@include file="/WEB-INF/include/global_css.jsp" %>
<%@include file="/WEB-INF/include/global_js.jsp" %>

<script>
	function formatOperateColumn(value, row) {
		return '<a href="#" class="icon-edit" style="display:inline-block;width:40px;"  onclick="editArea(\'' + row.realId + '\')">&nbsp;</a>' +
			'<a href="#" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteArea(\'' + row.realId + '\')">&nbsp;</a>'
			;
	}
	
	function editRow(id) {
		//alert('修改' + id);
		window.location.href='edit.action?realId=' + id ;
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
				<span>审核人姓名:</span>
				<input id="auditor" style="height:20px;border:1px solid #ccc">
					<span>审核人ID:</span>
				<input id="auditorId" style="height:20px;border:1px solid #ccc">
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
					<th data-options="field:'userId',width:180,align:'center'">用户ID</th>
					<th data-options="field:'schoo',width:180,align:'center'">毕业学校</th>
					<th data-options="field:'major',width:180,align:'center'">专业</th>
					<th data-options="field:'education',width:180,align:'center'">学历</th>
					<th data-options="field:'admissionDate',width:180,align:'center',formatter:date">入学时间</th>
					<th data-options="field:'graduationYear',width:180,align:'center',formatter:date">毕业年份</th>
					<th data-options="field:'certificate',width:180,align:'center'">证书</th>
					<th data-options="field:'certificationDate',width:180,align:'center,formatter:date'">认证时间</th>
					<th data-options="field:'checkType',width:180,align:'center'">审核状态</th>
					<th data-options="field:'vaild',width:180,align:'center' ">是否有效</th>
					<th data-options="field:'auditor',width:180,align:'center'">审核人姓名</th>
					<th data-options="field:'auditorId',width:180,align:'center'">审核人ID</th>
					
				
				</tr>
			</thead>
		</table>

</body>
</html>