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
    	<input type="hidden" name="applyCode" value="${userApplyForLimit.applyCode}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<td>用户id：</td>
    				<td><span>${userApplyForLimit.userId}</span></td>
    			</tr>
    			<tr>
    				<td>原信用额：</td>
    				<td><span>${userApplyForLimit.originalCredit}</span></td>
<%--     				<td><input type="text" name="originalCredit" value="${userApplyForLimit.originalCredit}"/></td> --%>
    			</tr>
    			<tr>
    				<td>房产证明照片：</td>
    				<td><span>${userApplyForLimit.houseOfProperty}</span></td>
<%--     				<td><input type="text" name="houseOfProperty" value="${userApplyForLimit.houseOfProperty}"/></td> --%>
    			</tr>
    			<tr>
    				<td>申请信用额：</td>
    				<td><span>${userApplyForLimit.applyLimit}</span></td>
<%--     				<td><input type="text" name="applyLimit" value="${userApplyForLimit.applyLimit}"/></td> --%>
    			</tr>
    			<tr>
    				<td>申请时间：</td>
    				<td><span><fmt:formatDate value="${userApplyForLimit.applyDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span></td>
<%--     				<td><input type="text" name="applyDate" value='<fmt:formatDate value="${userApplyForLimit.applyDate}" pattern="yyyy-MM-dd HH:mm:ss"/>'/></td> --%>
    			</tr>
    			<tr>
    				<td>状态：</td>
<%--     				<td><span>${userApplyForLimit.applyState}</span></td> --%>
    				<td><input type="text" name="applyState" value="${userApplyForLimit.applyState}"/></td>
    			</tr>
    			<tr>
    				<td>审核人ID：</td>
<%--     				<td><span>${userApplyForLimit.checkId}</span></td> --%>
    				<td><input type="text" name="checkId" value="${userApplyForLimit.checkId}"/></td>
    			</tr>
    			<tr>
    				<td>合法：</td>
<%--     				<td><span>${userApplyForLimit.vaild}</span></td> --%>
    				<td><input type="text" name="vaild" value="${userApplyForLimit.vaild}"/></td>
    			</tr>
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>