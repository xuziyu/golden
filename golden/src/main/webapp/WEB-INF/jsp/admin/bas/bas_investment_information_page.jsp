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
<script type="text/javascript"
	src="${ctxResource }/resource/third/date/format_json_date.js"></script>
<script>
	function formatOperateColumn(value, row) {
		//----------------------------------------------1 js方法名和参数\--------------------------------------
		return '<a href="#" class="icon-edit" style="display:inline-block;width:40px;"  onclick="edit(\''
				+ row.investorId
				+ '\')">&nbsp;</a>'
				+ '<a href="#" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deletem(\''
				+ row.investorId + '\')">&nbsp;</a>';
	}
	//----------------------------------------------2方法名和url参/数--------------------------------------
	function edit(id) {

		window.location.href = 'edit.action?investorId=' + id;
	}
	//----------------------------------------------3方法名和url参/数--------------------------------------
	function deletem(id) {

		$.ajax({
			async : true, //是否异步
			type : "post",
			url : 'deleteAj.action?investorId=' + id,
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
				"tenderId" : $('#tenderId').val(),
				"investorMoney" : $('#investorMoney').val(),
				"investorStatus" : $('#investorStatus').val(),
				"investorStyle" : $('#investorStyle').val(),
				"brrowStatus" : $('#brrowStatus').val(),
				"investorRest" : $('#investorRest').val(),
				"profitModel" : $('#profitModel').val(),
				"profitMoney" : $('#profitMoney').val(),
				"investorDate" : $('#investorDate').val(),
				"replayDate" : $('#replayDate').val(),
				"investorType" : $('#investorType').val()
			}
		});
	}
</script>
</head>
<body>

	<div id="toolbar">
		<form id='formAreaQuery'>
			<div style="padding: 6px; padding-top: 15px;">
				<span>投资用户主键:</span>
				<input id="userId" style="height: 20px; border: 1px solid #ccc">
				 
				<span>投标主键:</span>
				<input id="tenderId" style="height: 20px; border: 1px solid #ccc">
				 
				<span>投资金额:</span>
				<input id="investorMoney" style="height: 20px; border: 1px solid #ccc">
				 
				<span>投资状态:</span>
				<input id="investorStatus" style="height: 20px; border: 1px solid #ccc">
				 
				<span>投资类型:</span>
				<input id="investorStyle" style="height: 20px; border: 1px solid #ccc">
				 
				<span>借贷状态:</span>
				<input id="brrowStatus" style="height: 20px; border: 1px solid #ccc">
				 
				<span>投资利率:</span>
				<input id="investorRest" style="height: 20px; border: 1px solid #ccc">
				 
				<span>盈利方式:</span>
				<input id="profitModel" style="height: 20px; border: 1px solid #ccc">
				 
				<span>盈利金额:</span>
				<input id="profitMoney" style="height: 20px; border: 1px solid #ccc">
				
				<span>投资时间:</span>
				<input id="investorDate" style="height: 20px; border: 1px solid #ccc">
				
				<span>还款时间:</span>
				<input id="replayDate" style="height: 20px; border: 1px solid #ccc">
				
				<span>投标状态:</span>
				<input id="investorType" style="height: 20px; border: 1px solid #ccc">
				
				 <a href="#"class="easyui-linkbutton" style="width: 60px" onclick="doSearch()">查询</a>
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
				<th data-options="field:'operate_column',width:160,align:'center',formatter:formatOperateColumn">操作</th>
				<th data-options="field:'userId',width:180,align:'center'">用户</th>
				<th data-options="field:'tenderId',width:180,align:'center'">投标id</th>
				<th data-options="field:'investorMoney',width:180,align:'center'">投资金额</th>
				<th data-options="field:'investorStatus',width:180,align:'center'">投资状态</th>
				<th data-options="field:'investorStyle',width:180,align:'center'">投资类型</th>
				<th data-options="field:'brrowStatus',width:180,align:'center'">借贷状态</th>
				<th data-options="field:'investorRest',width:180,align:'center'">投资利率</th>
				<th data-options="field:'profitModel',width:180,align:'center'">盈利方式</th>
				<th data-options="field:'profitMoney',width:180,align:'center'">盈利金额</th>
				<th data-options="field:'investorDate',width:200,align:'center',formatter:date">投资时间</th>
				<th data-options="field:'replayDate',width:180,align:'center'">还款期限</th>
				<th data-options="field:'investorType',width:180,align:'center'">投标状态</th>

			</tr>
		</thead>
	</table>
</body>
</html>