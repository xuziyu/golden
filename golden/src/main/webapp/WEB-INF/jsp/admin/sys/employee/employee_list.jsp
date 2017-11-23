<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/global_java.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SysEmployee</title>
</head>
<body>
	SysEmployee
	<table></table>
	<c:forEach items="${employeeList }" var="employee">
    	${employee.employeeId} , 	${employee.employeeName}  <a href="">编辑</a>
		<br />
	</c:forEach>
</body>
</html>