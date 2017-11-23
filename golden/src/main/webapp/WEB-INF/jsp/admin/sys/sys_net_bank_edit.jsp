<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/include/global_java.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="save.action" method="post">
    	<input type="hidden" name="tradeId" value="${sysNetBank.tradeId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<td>银行卡号：</td>
    				<td><input type="text" name="cardId" value="${sysNetBank.cardId}"/></td>
    			</tr>
    			<tr>
    				<td>类型：</td>
    				<td><input type="text" name="tradeType" value="${sysNetBank.tradeType}"/></td>
    			</tr>
    			<tr>
    				<td>余额：</td>
    				<td><input type="text" name="tradeMoney" value="${sysNetBank.tradeMoney}"/></td>
    			</tr>
<!--     			<tr> -->
<!--     				<td>黑名单：</td> -->
<%--     				<td><input type="text" name="cardPassword" value="${sysNetBank.cardPassword}"/></td> --%>
<!--     			</tr> -->
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>