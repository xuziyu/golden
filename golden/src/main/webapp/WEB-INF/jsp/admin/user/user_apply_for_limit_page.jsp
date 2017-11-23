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
				+ row.applyCode
				+ '\')">&nbsp;</a>'
				+ '<a href="#" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deletem(\''
				+ row.applyCode + '\')">&nbsp;</a>';
	}
	//----------------------------------------------2方法名和url参/数--------------------------------------
	function edit(id) {

		window.location.href = 'edit.action?applyCode=' + id;
	}
	//----------------------------------------------3方法名和url参/数--------------------------------------
	function deletem(id) {

		$.ajax({
			async : true, //是否异步
			type : "post",
			url : 'deleteAj.action?applyCode=' + id,
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
				"applyCode" : $('#applyCode').val(),
				"userId" : $('#userId').val(),
				"originalCredit" : $('#originalCredit').val(),
				"houseOfProperty" : $('#houseOfProperty').val(),
				"applyLimit" : $('#applyLimit').val(),
				"applyDate" : $('#applyDate').val(),
				"applyState" : $('#applyState').val(),
				"checkId" : $('#checkId').val(),
				"vaild" : $('#vaild').val()
			}
		});
	}
</script>
</head>
<body>

	<div id="toolbar">
		<form id='formAreaQuery'>
			<div style="padding: 6px; padding-top: 15px;">
				<span>申请编号:</span>
				<input id="applyCode" style="height: 20px; border: 1px solid #ccc">
				
				<span>原信用额:</span>
				<input id="originalCredit" style="height: 20px; border: 1px solid #ccc">
				
				<span>房产证明照片:</span>
				<input id="houseOfProperty" style="height: 20px; border: 1px solid #ccc">
				
				<span>申请信用额:</span>
				<input id="applyLimit" style="height: 20px; border: 1px solid #ccc">
				
				<span>申请时间:</span>
				<input id="applyDate" style="height: 20px; border: 1px solid #ccc">
				
				<span>状态:</span>
				<input id="applyState" style="height: 20px; border: 1px solid #ccc">
				
				<span>审核人ID:</span>
				<input id="checkId" style="height: 20px; border: 1px solid #ccc">
				
				<span>合法:</span>
				<input id="vaild" style="height: 20px; border: 1px solid #ccc">
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
				<th data-options="field:'applyCode',width:180,align:'center'">申请编号</th>
				<th data-options="field:'originalCredit',width:200,align:'center'">原信用额</th>
				<th data-options="field:'houseOfProperty',width:200,align:'center'">房产证明照片</th>
				<th data-options="field:'applyLimit',width:200,align:'center'">申请信用额</th>
				<th
					data-options="field:'applyDate',width:200,align:'center',formatter:date">申请时间</th>
				<th data-options="field:'applyState',width:200,align:'center'">状态</th>
				<th data-options="field:'checkId',width:200,align:'center'">审核人ID</th>
				<th data-options="field:'vaild',width:200,align:'center'">合法</th>
			</tr>
		</thead>
	</table>
</body>
</html>