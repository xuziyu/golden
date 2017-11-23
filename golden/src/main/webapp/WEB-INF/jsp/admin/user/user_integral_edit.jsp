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
    	<input type="hidden" name="cuserId" value="${userIntegral.cuserId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<td>用户名：</td>
    				<td><span>${userIntegral.userId}</span></td>
<%--     				<td><input type="text" name="userId" value="${userIntegral.userId}"/></td> --%>
    			</tr>
    			<tr>
    				<td>信用积分：</td>
<%--     				<td><span>${userIntegral.creditPoint}</span></td> --%>
    				<td><input type="text" name="creditPoint" value="${userIntegral.creditPoint}"/></td>
    			</tr>
    			<tr>
    				<td>会员积分：</td>
<%--     				<td><span>${userIntegral.memberPoint}</span></td> --%>
    				<td><input type="text" name="memberPoint" value="${userIntegral.memberPoint}"/></td>
    			</tr>
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>