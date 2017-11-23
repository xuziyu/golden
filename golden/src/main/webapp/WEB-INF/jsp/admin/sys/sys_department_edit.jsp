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
    	<input type="hidden" name="cuserId" value="${sysDepartment.departmentId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<td>父组织id：</td>
    				<td><input type="text" name="userId" value="${sysDepartment.parentDepartmentId}"/></td>
    			</tr>
    			<tr>
    				<td>部门名称：</td>
    				<td><input type="text" name="creditPoint" value="${sysDepartment.departmentName}"/></td>
    			</tr>
    			<tr>
    				<td>创建时间：</td>
    				<td><input type="text" name="memberPoint" value="${sysDepartment.departmentTime}"/></td>
    			</tr>
    			<tr>
    				<td>部门状态：</td>
    				<td>	<select name="departmentStatus">
    					<option value="0" <c:if test="${sysDepartment.departmentStatus == 0}"> selected="selected"</c:if> >未审核</option>	
						<option value="1" <c:if test="${sysDepartment.departmentStatus== 1}"> selected="selected"</c:if> >已审核</option>
						<option value="2" <c:if test="${sysDepartment.departmentStatus == 2}"> selected="selected"</c:if> >审核中</option>
    				       <select> 
    	            </td>
    			</tr>
    			<tr>
    				<td>描述：</td>
    				<td><input type="text" name="memberPoint" value="${sysDepartment.departmentEscribes}"/></td>
    			</tr>
    			
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>