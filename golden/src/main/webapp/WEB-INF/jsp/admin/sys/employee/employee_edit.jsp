<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SysEmployee Edit</title>
</head>
<body>
	<form action="save" method="post">
    	id:<input type="hidden" name="employeeId" value="${sysEmployee.employeeId }"/><br/>
    	name:<input type="text" name="employeeName" value="${sysEmployee.employeeName }" />
    	<input type="submit" value="保存" />
    </form>
</body>
</html>