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
    	<input type="hidden" name="accountId" value="${userAccountAssets.accountId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<td>用户id：</td>
    				<td><input type="text" name="userId" value="${userAccountAssets.userId}"/></td>
    			</tr>
    			<tr>
    				<td>可用余额：</td>
    				<td><input type="text" name="accountBalance" value="${userAccountAssets.accountBalance}"/></td>
    			</tr>
    			<tr>
    				<td>冻结金额：</td>
    				<td><input type="text" name="accountFreeze" value="${userAccountAssets.accountFreeze}"/></td>
    			</tr>
    			<tr>
    				<td>待收金额：</td>
    				<td><input type="text" name="accountDue" value="${userAccountAssets.accountDue}"/></td>
    			</tr>
    			<tr>
    				<td>待还金额：</td>
    				<td><input type="text" name="accountPaid" value="${userAccountAssets.accountPaid}"/></td>
    			</tr>
    			<tr>
    				<td>总金额：</td>
    				<td><input type="text" name="totalMoney" value="${userAccountAssets.totalMoney}"/></td>
    			</tr>
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>