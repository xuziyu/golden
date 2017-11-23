<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑</title>
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