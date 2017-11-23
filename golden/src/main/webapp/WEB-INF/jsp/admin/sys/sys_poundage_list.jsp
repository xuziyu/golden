<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/include/global_java.jsp" %>
<html>
<head>
<title>list</title>
<%@include file="/WEB-INF/include/global_css.jsp" %>
<%@include file="/WEB-INF/include/global_js.jsp" %>

<script>
	function formatOperateColumn(value, row) {
		return '<a href="#" class="icon-edit" style="display:inline-block;width:40px;"  onclick="editArea(\'' + row.poundageId + '\')">&nbsp;</a>' +
			'<a href="#" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteArea(\'' + row.poundageId + '\')">&nbsp;</a>'
			;
	}
	
	function editRow(id) {
		//alert('修改' + id);
		window.location.href='edit.action?poundageId=' + id ;
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
	<form action="save.action" method="post">
    	<input type="hidden" name="poundageId" value="${sysPoundage.poundageId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<%-- <td>黑名单：</td>
    				<td><input type="text" name="black" value="${sysPoundage.black}"/></td> --%>
    				<tr>
    				<td>审核状态：</td>
    				<td>	<select name="checkType">
    					<option value="0" <c:if test="${sysPoundage.checkType == 0}"> selected="selected"</c:if> >未审核</option>	
						<option value="1" <c:if test="${sysPoundage.checkType == 1}"> selected="selected"</c:if> >已审核</option>
						<option value="2" <c:if test="${sysPoundage.checkType == 2}"> selected="selected"</c:if> >审核中</option>
    				       <select> 
    	          </td>
    				</tr>
    						
    				<tr>
    				<td>用户ID：</td>
    				<td><input type="text" name="userId" value="${sysPoundage.userId}"/></td>
    				</tr>
    				
    				<tr>
    				<td>手续费金额：</td>
    				<td><input type="text" name="poundageServiceMoney" value="${sysPoundage.poundageServiceMoney}"/></td>
    				</tr>
    				<tr>
    				<td>类型：</td>
    				
    				<td>
    				  <select name="poundageType">
    					<option value="0" <c:if test="${sysPoundage.poundageType == 0}"> selected="selected"</c:if> >本地</option>	
						<option value="1" <c:if test="${sysPoundage.poundageType == 1}"> selected="selected"</c:if> >银行卡</option>
						
    				  <select>
    				
    				</td>
    				</tr>
    				<tr>
    				<td>时间：</td>
    				<td><input type="text" name="time" value="${sysPoundage.time}"/>
    				
    				
    				</td>
    				</tr>
    				<tr>
    				<td>本地账户：</td>
    				<td><input type="text" name="localaccount" value="${sysPoundage.localaccount}"/></td>
    				</tr>
    				<tr>
    				<td>往来账户：</td>
    				<td><input type="text" name="bookaccount" value="${sysPoundage.bookaccount}"/></td>
    				</tr>
    				<tr>
    				<td>交易方式：</td>
    				<td><input type="text" name="paytype" value="${sysPoundage.paytype}"/>
    				  <select name="paytype">
    					<option value="0" <c:if test="${sysPoundage.paytype == 0}"> selected="selected"</c:if> >本地付款</option>	
						<option value="1" <c:if test="${sysPoundage.paytype == 1}"> selected="selected"</c:if> >银行卡付款</option>
						
    				  <select>
    				
    				</td>
    				</tr>
    			</tr>
    			
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>