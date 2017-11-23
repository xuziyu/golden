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
    	<input type="hidden" name="contactId" value="${userContact.contactId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<td>用户ID：</td>
    				<td><span>${userContact.userId}</span></td>
<%--     				<td><input type="text" name="userId" value="${userContact.userId}"/></td> --%>
    			</tr>
    			<tr>
    				<td>角色关系：</td>
<%--     				<td><span>${userContact.contactType}</span></td> --%>
    				<td><input type="text" name="contactType" value="${userContact.contactType}"/></td>
    			</tr>
    			<tr>
    				<td>紧急联系人号码：</td>
<%--     				<td><span>${userContact.contactPeople}</span></td> --%>
    				<td><input type="text" name="contactPeople" value="${userContact.contactPeople}"/></td>
    			</tr>
    			<tr>
    				<td>电话号码：</td>
<%--     				<td><span>${userContact.telphoneNumber}</span></td> --%>
    				<td><input type="text" name="telphoneNumber" value="${userContact.telphoneNumber}"/></td>
    			</tr>
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>