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
    	<input type="hidden" name="feedbackId" value="${sysFeedback.feedbackId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<td>反馈人：</td>
    				<td><span>${sysFeedback.feedbackName}</span></td>
<%--     				<td><input type="text" name="feedbackName" value="${sysFeedback.feedbackName}"/></td> --%>
    			</tr>
    			<tr>
    				<td>反馈内容：</td>
    				<td><span>${sysFeedback.feedbackConent}</span></td>
<%--     				<td><input type="text" name="feedbackConent" value="${sysFeedback.feedbackConent}"/></td> --%>
    			</tr>
    			<tr>
    				<td>反馈时间：</td>
    				<td><span><fmt:formatDate value="${sysFeedback.feedbackTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span></td>
<!--     				<td> -->
<%--     					<input type="text" name="feedbackTime" value='<fmt:formatDate value="${sysFeedback.feedbackTime}" pattern="yyyy-MM-dd HH:mm:ss"/>'/> --%>
<!--     				</td> -->
    			</tr>
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>