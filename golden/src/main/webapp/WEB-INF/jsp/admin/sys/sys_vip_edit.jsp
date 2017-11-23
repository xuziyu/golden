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
    	<input type="hidden" name="vipId" value="${sysVip.vipId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<td>用户id：</td>
    				<td><input type="text" name="userId" value="${sysVip.userId}"/></td>
    			</tr>
    			<tr>
    				<td>付费状态：</td>
    				<td><input type="text" name="vipState" value="${sysVip.vipState}"/></td>
    			</tr>
    			<tr>
    				<td>用户信用：</td>
    				<td><input type="text" name="userCredit" value="${sysVip.userCredit}"/></td>
    			</tr>
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>