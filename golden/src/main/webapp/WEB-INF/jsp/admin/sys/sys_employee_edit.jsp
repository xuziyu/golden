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
    	<input type="hidden" name="employeeId" value="${sysEmployee.employeeId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<td>部门编号：</td>
    				<td><span>${sysEmployee.departmentId}</span></td>
<%--     				<td><input type="text" name="departmentId" value="${sysEmployee.departmentId}"/></td> --%>
    			</tr>
				<tr>
    				<td>员工姓名：</td>
    				<td><span>${sysEmployee.employeeName}</span></td>
<%--     				<td><input type="text" name="employeeName" value="${sysEmployee.employeeName}"/></td> --%>
    			</tr>
    			<tr>
    				<td>员工性别：</td>
    				<td><span>${sysEmployee.employeeGender}</span></td>
<%--     				<td><input type="text" name="employeeGender" value="${sysEmployee.employeeGender}"/></td> --%>
    			</tr>
    			<tr>
    				<td>生日：</td>
    				<td><span><fmt:formatDate value="${sysEmployee.employeeBirth}" pattern="yyyy-MM-dd HH:mm:ss"/></span></td>
<%--     				<td><input type="text" name="employeeBirth" value="${sysEmployee.employeeBirth}"/></td> --%>
    			</tr>
    			<tr>
    				<td>身份证号码：</td>
    				<td><span>${sysEmployee.employeeIdcard}</span></td>
<%--     				<td><input type="text" name="employeeIdcard" value="${sysEmployee.employeeIdcard}"/></td> --%>
    			</tr>
    			<tr>
    				<td>电话号码：</td>
    				<td><span>${sysEmployee.employeePhone}</span></td>
<%--     				<td><input type="text" name="employeePhone" value="${sysEmployee.employeePhone}"/></td> --%>
    			</tr>
    			<tr>
    				<td>邮箱：</td>
    				<td><span>${sysEmployee.employeeEmail}</span></td>
<%--     				<td><input type="text" name="employeeEmail" value="${sysEmployee.employeeEmail}"/></td> --%>
    			</tr>
    			<tr>
    				<td>职位编号：</td>
    				<td><span>${sysEmployee.jobNum}</span></td>
<%--     				<td><input type="text" name="jobNum" value="${sysEmployee.jobNum}"/></td> --%>
    			</tr>
    			<tr>
    				<td>职位名称：</td>
    				<td><span>${sysEmployee.jobName}</span></td>
<%--     				<td><input type="text" name="jobName" value="${sysEmployee.jobName}"/></td> --%>
    			</tr>
    			<tr>
    				<td>入职时间：</td>
<%--     				<td><span><fmt:formatDate value="${sysEmployee.entryTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span></td> --%>
    				<td><input type="text" name="entryTime" value="<fmt:formatDate value="${sysEmployee.entryTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td>
    			</tr>
    			<tr>
    				<td>状态</td>
<%--     				<td><span>${sysEmployee.employeeStatus}</span></td> --%>
    				<td><input type="text" name="employeeStatus" value="${sysEmployee.employeeStatus}"/></td>
    			</tr>
    			<tr>
    				<td>密码：</td>
<%--     				<td><span>${sysEmployee.employeePassword}</span></td> --%>
    				<td><input type="text" name="employeePassword" value="${sysEmployee.employeePassword}"/></td>
    			</tr>
    			
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>