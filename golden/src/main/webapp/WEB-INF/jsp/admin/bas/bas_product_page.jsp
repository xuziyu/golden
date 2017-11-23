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
				+ row.productId
				+ '\')">&nbsp;</a>'
				+ '<a href="#" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deletem(\''
				+ row.productId + '\')">&nbsp;</a>';
	}
	//----------------------------------------------2方法名和url参/数--------------------------------------
	function edit(id) {

		window.location.href = 'edit.action?productId=' + id;
	}
	//----------------------------------------------3方法名和url参/数--------------------------------------
	function deletem(id) {

		$.ajax({
			async : true, //是否异步
			type : "post",
			url : 'deleteAj.action?productId=' + id,
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
				"productMoney" : $('#productMoney').val(),
				"productIncome" : $('#productIncome').val(),
				"productTime" : $('#productTime').val(),
				"productType" : $('#productType').val(),
				"productWay" : $('#productWay').val(),
				"pcount" : $('#pcount').val(),
				"productProgress" : $('#productProgress').val(),
				"productSaveway" : $('#productSaveway').val(),
				"productRateben" : $('#productRateben').val(),
				"productPublishTime" : $('#productPublishTime').val(),
				"productName" : $('#productName').val(),
				"productTotalMoney" : $('#productTotalMoney').val(),
				"investmentScope" : $('#investmentScope').val(),
				"useOfProceeds" : $('#useOfProceeds').val(),
				"productState" : $('#productState').val(),
				"productPicture" : $('#productPicture').val(),
				"produceId" : $('#produceId').val(),
				"productDesc" : $('#productDesc').val(),
				"productSafe" : $('#productSafe').val()
			}
		});
	}
</script>
</head>
<body>

	<div id="toolbar">
		<form id='formAreaQuery'>
			<div style="padding: 6px; padding-top: 15px;">
				<span>已募集总金额:</span>
				<input id="productMoney" style="height: 20px; border: 1px solid #ccc">
				<span>预期年化收益:</span>
				<input id="productIncome" style="height: 20px; border: 1px solid #ccc">
				<span>项目期限:</span>
				<input id="productTime" style="height: 20px; border: 1px solid #ccc">
				<span>类型:</span>
				<input id="productType" style="height: 20px; border: 1px solid #ccc">
				<span>还款方式:</span>
				<input id="productWay" style="height: 20px; border: 1px solid #ccc">
				<span>还款截止期限:</span>
				<input id="pcount" style="height: 20px; border: 1px solid #ccc">
				<span>投资进度:</span>
				<input id="productProgress" style="height: 20px; border: 1px solid #ccc">
				<span>保障方式:</span>
				<input id="productSaveway" style="height: 20px; border: 1px solid #ccc">
				<span>需还本息:</span>
				<input id="productRateben" style="height: 20px; border: 1px solid #ccc">
				<span>发布时间:</span>
				<input id="productPublishTime" style="height: 20px; border: 1px solid #ccc">
				<span>产品名称:</span>
				<input id="productName" style="height: 20px; border: 1px solid #ccc">
				<span>募集资金:</span>
				<input id="productTotalMoney" style="height: 20px; border: 1px solid #ccc">
				<span>投资范围:</span>
				<input id="investmentScope" style="height: 20px; border: 1px solid #ccc">
				<span>资金用途:</span>
				<input id="useOfProceeds" style="height: 20px; border: 1px solid #ccc">
				<span>状态:</span>
				<input id="productState" style="height: 20px; border: 1px solid #ccc">
				<span>封面:</span>
				<input id="productPicture" style="height: 20px; border: 1px solid #ccc">
				<span>标主id:</span>
				<input id="produceId" style="height: 20px; border: 1px solid #ccc">
				<span>项目描述:</span>
				<input id="productDesc" style="height: 20px; border: 1px solid #ccc">
				<span>保障措施:</span>
				<input id="productSafe" style="height: 20px; border: 1px solid #ccc">
				
				
				<a href="#" class="easyui-linkbutton" style="width: 60px" onclick="doSearch()">查询</a>
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
				<th data-options="field:'productMoney',width:180,align:'center'">已募集总金额</th>
				<th data-options="field:'productIncome',width:180,align:'center'">预期年化收益</th>
				<th data-options="field:'productTime',width:180,align:'center',formatter:date">项目期限</th>
				<th data-options="field:'productType',width:180,align:'center'">类型</th>
				<th data-options="field:'productWay',width:180,align:'center'">还款方式</th>
				<th data-options="field:'pcount',width:180,align:'center',formatter:date">还款截止期限</th>
				<th data-options="field:'productProgress',width:180,align:'center'">投资进度</th>
				<th data-options="field:'productSaveway',width:180,align:'center'">保障方式</th>
				<th data-options="field:'productRateben',width:180,align:'center'">需还本息</th>
				<th data-options="field:'productPublishTime',width:180,align:'center',formatter:date">发布时间</th>
				<th data-options="field:'productName',width:180,align:'center'">产品名称</th>
				<th data-options="field:'productTotalMoney',width:180,align:'center'">募集资金</th>
				<th data-options="field:'investmentScope',width:180,align:'center'">投资范围</th>
				<th data-options="field:'useOfProceeds',width:180,align:'center'">资金用途</th>
				<th data-options="field:'productState',width:180,align:'center'">状态</th>
				<th data-options="field:'productPicture',width:180,align:'center'">封面</th>
				<th data-options="field:'produceId',width:180,align:'center'">标主id</th>
				<th data-options="field:'productDesc',width:180,align:'center'">项目描述</th>
				<th data-options="field:'productSafe',width:180,align:'center'">保障措施</th>
			</tr>
		</thead>
	</table>
</body>
</html>