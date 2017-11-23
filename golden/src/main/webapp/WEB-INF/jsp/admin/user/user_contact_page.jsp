<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/include/global_java.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户基本信息</title>
<%@include file="/WEB-INF/include/global_css.jsp"%>
<%@include file="/WEB-INF/include/global_js.jsp"%>
<script type="text/javascript" src="${ctxResource }/resource/third/date/format_json_date.js"></script>
<script>
	function formatOperateColumn(value, row) {
		//----------------------------------------------1 js方法名和参数\--------------------------------------
		return '<a href="#" class="icon-edit" style="display:inline-block;width:40px;"  onclick="edit(\''
				+ row.contactId
				+ '\')">&nbsp;</a>'
				+ '<a href="#" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deletem(\''
				+ row.contactId + '\')">&nbsp;</a>';
	}
	//----------------------------------------------2方法名和url参/数--------------------------------------
	function edit(id) {

		window.location.href = 'edit.action?contactId=' + id;
	}
	//----------------------------------------------3方法名和url参/数--------------------------------------
	function deletem(id) {

		$.ajax({
			async : true, //是否异步
			type : "post",
			url : 'deleteAj.action?contactId=' + id,
			success : function(data) {
				if (data.code) {//失败
					alert(data.message);
				} else {//成功
					$.messager.alert('提示', '删除成功');
					doSearch();
				}

			}

		});

	}
	//----------------------------------------------4方法名--------------------------------------
	function newObject() {
		window.location.href = 'edit.action';
	}
	//----------------------------------------------4添加相应值--------------------------------------
	function doSearch() {
		$('#dgArea').datagrid({
			queryParams : {
				"userId" : $('#userId').val(),
				"contactType" : $('#contactType').val(),
				"contactPeople" : $('#contactPeople').val(),
				"telphoneNumber" : $('#telphoneNumber').val()
			}
		});
	}
</script>
</head>
<body>

	<div id="toolbar">
		<form id='formAreaQuery'>
			<div style="padding: 6px; padding-top: 15px;">
				<span>用户ID:</span>
				<input id="userId" style="height: 20px; border: 1px solid #ccc">
				
				<span>角色关系:</span>
				<input id="contactType" style="height: 20px; border: 1px solid #ccc">
				
				<span>紧急联系人号码:</span>
				<input id="contactPeople" style="height: 20px; border: 1px solid #ccc">
				
				<span>电话号码:</span>
				<input id="telphoneNumber" style="height: 20px; border: 1px solid #ccc">
				
				<a href="#"
					class="easyui-linkbutton" style="width: 60px" onclick="doSearch()">查询</a>
			</div>
			<div>
				<a href="#" class="easyui-linkbutton" iconCls="icon-add"
					plain="true" onclick="newObject()">新增</a> <a href="#"
					class="easyui-linkbutton" iconCls="icon-edit" plain="true"
					onclick="edit()">修改</a> <a href="#" class="easyui-linkbutton"
					iconCls="icon-remove" plain="true" onclick="deletem()">删除</a>
			</div>
		</form>
	</div>

	<table id="dgArea" class="easyui-datagrid"
		data-options="url:'page_json.action' ,fit:true,toolbar:'#toolbar',singleSelect:true,collapsible:true,method:'get',pagination:'true',fitColumns:true">
		<thead>
			<tr>
				<th
					data-options="field:'operate_column',width:160,align:'center',formatter:formatOperateColumn">操作</th>
				<th data-options="field:'userId',width:180,align:'center'">用户ID</th>
				<th data-options="field:'contactType',width:200,align:'center'">角色关系</th>
				<th data-options="field:'contactPeople',width:200,align:'center'">紧急联系人号码</th>
				<th data-options="field:'telphoneNumber',width:200,align:'center'">电话号码</th>

			</tr>
		</thead>
	</table>
</body>
</html>