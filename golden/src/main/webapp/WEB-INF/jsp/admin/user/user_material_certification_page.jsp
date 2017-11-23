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
<script type="text/javascript" src="${ctxResource }/resource/third/date/format_json_date.js"></script>
<script>
	function formatOperateColumn(value, row) {
		//----------------------------------------------1 js方法名和参数\--------------------------------------
		return '<a href="#" class="icon-edit" style="display:inline-block;width:40px;"  onclick="edit(\'' + row.materiaId + '\')">&nbsp;</a>' +
			'<a href="#" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deletem(\'' + row.materiaId + '\')">&nbsp;</a>'
			;
	}
	//----------------------------------------------2方法名和url参/数--------------------------------------
	function edit(id) {
		
		window.location.href='edit.action?materiaId=' + id ;
	}
	//----------------------------------------------3方法名和url参/数--------------------------------------
	function deletem(id) {
		
		$.ajax({
			async:true, //是否异步
			type : "post",
			url : 'deleteAj.action?materiaId=' + id ,
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
				 "valid":$('#valid').val(),
				 "materiaType":$('#materiaType').val(),
				 "materia":$('#materia').val()
			} 
		 });
	}

</script>
</head>
<body>

	<div id="toolbar">
		<form id='formAreaQuery'>
			<div style="padding:6px;padding-top: 15px;">
				<span>是否有效:</span>
				<input id="valid" style="height:20px;border:1px solid #ccc">
				<span>材料类型:</span>
				<input id="materiaType" style="height:20px;border:1px solid #ccc">
				<span>材料:</span>
				<input id="materia" style="height:20px;border:1px solid #ccc">
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
					<th data-options="field:'materiaType',width:200,align:'center'">材料类型</th>
					<th data-options="field:'materia',width:200,align:'center'">材料</th>
					<th data-options="field:'createDate',width:200,align:'center',formatter:date">创建时间</th>
					<th data-options="field:'valid',width:200,align:'center',formatter:sta">是否有效</th>
				
				</tr>
			</thead>
		</table>
</body>
</html>