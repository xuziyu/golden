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
				<span>用户ID:</span>
				<input id="userId" style="height:20px;border:1px solid #ccc">
				<span>真实姓名:</span>
				<input id="realName" style="height:20px;border:1px solid #ccc">
				<span>性别:</span>
				<input id="gender" style="height:20px;border:1px solid #ccc">
				<span>身份证号码:</span>
				<input id="identityNum" style="height:20px;border:1px solid #ccc">
			
				<span>审核人姓名:</span>
				<input id="auditor" style="height:20px;border:1px solid #ccc">
				<span>审核人id:</span>
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
					<th data-options="field:'realName',width:200,align:'center'">真实姓名</th>
					<th data-options="field:'gender',width:200,align:'center'">性别</th>
					<th data-options="field:'identityNum',width:200,align:'center'">身份证号</th>
					<th data-options="field:'attestationDate',width:200,align:'center'">认证时间</th>
					<th data-options="field:'check',width:200,align:'center'">审核是否通过</th>
					<th data-options="field:'brithDate',width:200,align:'center'">出生日期</th>
					<th data-options="field:'placeOfDomicile',width:200,align:'center'">户籍所在地</th>
					<th data-options="field:'theFrontOfIdCard',width:200,align:'center'">身份证正面</th>
					<th data-options="field:'theBackOfIdCard',width:200,align:'center'">身份证反面</th>
					<th data-options="field:'auditor',width:200,align:'center'">审核人姓名</th>
					<th data-options="field:'auditorId',width:200,align:'center'">审核人id</th>
					
				</tr>
			</thead>
		</table>
</body>
		
		

</body>
</html>