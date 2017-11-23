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
				+ row.userId
				+ '\')">&nbsp;</a>'
				+ '<a href="#" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deletem(\''
				+ row.userId + '\')">&nbsp;</a>';
	}
	//----------------------------------------------2方法名和url参/数--------------------------------------
	function edit(id) {

		window.location.href = 'edit.action?userId=' + id;
	}
	//----------------------------------------------3方法名和url参/数--------------------------------------
	function deletem(id) {

		$.ajax({
			async : true, //是否异步
			type : "post",
			url : 'deleteAj.action?userId=' + id,
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
				"userNick" : $('#userNick').val(),
				"realName" : $('#realName').val(),
				"email" : $('#email').val(),
				"phoneNumber" : $('#phoneNumber').val(),
				"registerTime" : $('#registerTime').val(),
				"black" : $('#black').val(),
				"bankCardId" : $('#bankCardId').val()
			}
		});
	}
</script>
</head>
<body>

	<div id="toolbar">
		<form id='formAreaQuery'>
			<div style="padding: 6px; padding-top: 15px;">
				<span>昵称:</span> <input id="userNick"
					style="height: 20px; border: 1px solid #ccc"> <span>真实姓名:</span>
				<input id="realName" style="height: 20px; border: 1px solid #ccc">
				<span>email:</span> <input id="email"
					style="height: 20px; border: 1px solid #ccc"> <span>电话号码:</span>
				<input id="phoneNumber" style="height: 20px; border: 1px solid #ccc">
				<span>注册时间:</span> <input id="registerTime"
					style="height: 20px; border: 1px solid #ccc"> <span>黑名单:</span>
				<input id="black" style="height: 20px; border: 1px solid #ccc">
				<span>黑名单id:</span> <input id="bankCardId"
					style="height: 20px; border: 1px solid #ccc"> <a href="#"
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
				<th data-options="field:'userNick',width:180,align:'center'">昵称</th>
				<th data-options="field:'realName',width:200,align:'center'">真实姓名</th>
				<th data-options="field:'email',width:200,align:'center'">email</th>
				<th data-options="field:'phoneNumber',width:200,align:'center'">电话号码</th>
				<th
					data-options="field:'registerTime',width:200,align:'center',formatter:date">注册时间</th>
				<th data-options="field:'black',width:200,align:'center'">黑名单</th>
				<th data-options="field:'bankCardId',width:200,align:'center'">黑名单id</th>
			</tr>
		</thead>
	</table>
</body>
</html>