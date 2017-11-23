<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/include/global_java.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学历信息</title>
<%@include file="/WEB-INF/include/global_css.jsp" %>
<%@include file="/WEB-INF/include/global_js.jsp" %>
<script type="text/javascript" src="${ctxResource }/resource/third/date/format_json_date.js"></script>
<script>
	function formatOperateColumn(value, row) {
		//----------------------------------------------1 js方法名和参数\--------------------------------------
		return '<a href="#" class="icon-edit" style="display:inline-block;width:40px;"  onclick="edit(\'' + row.educationId + '\')">&nbsp;</a>' +
			'<a href="#" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deletem(\'' + row.educationId + '\')">&nbsp;</a>'
			;
	}
	//----------------------------------------------2方法名和url参/数--------------------------------------
	function edit(id) {
		
		window.location.href='edit.action?educationId=' + id ;
	}
	//----------------------------------------------3方法名和url参/数--------------------------------------
	function deletem(id) {
		
		$.ajax({
			async:true, //是否异步
			type : "post",
			url : 'deleteAj.action?educationId=' + id ,
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
	
	function status(value, row) {
		if(value == '0')
			return '未审核';
		else if(value == '1')
			return '已审核';
		else if(value == '2')
			return '审核中';
	}
	function sta(value, row) {
		if(value == '0')
			return '有效';
		else if(value == '1')
			return '无效';
		
	}
	//----------------------------------------------4方法名--------------------------------------
	function newObject(){
		window.location.href = 'edit.action' ;
	}
	//----------------------------------------------4添加相应值--------------------------------------
	function doSearch(){
		 $('#dgArea').datagrid({
			 queryParams: {
				 "auditor":$('#auditor').val(),
				 "auditorId":$('#auditorId').val()
			} 
		 });
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
					<th data-options="field:'checkType',width:180,align:'center',formatter:status">审核状态</th>
					<th data-options="field:'vaild',width:180,align:'center',formatter:sta ">是否有效</th>
					<th data-options="field:'auditor',width:180,align:'center'">审核人姓名</th>
					<th data-options="field:'auditorId',width:180,align:'center'">审核人ID</th>
					
				
				</tr>
			</thead>
		</table>
</body>
</html>