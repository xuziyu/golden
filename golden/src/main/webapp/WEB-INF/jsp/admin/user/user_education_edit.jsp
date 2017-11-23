<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑</title>
</head>
<body>
    <form action="save.action" method="post">
    	<input type="hidden" name="educationId" value="${userEducation.educationId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<%-- <td>黑名单：</td>
    				<td><input type="text" name="black" value="${userEducation.black}"/></td> --%>
    				<tr>
    				<td>审核状态：</td>
    				<td>	<select name="checkType">
    					<option value="0" <c:if test="${userEducation.checkType == 0}"> selected="selected"</c:if> >未审核</option>	
						<option value="1" <c:if test="${userEducation.checkType == 1}"> selected="selected"</c:if> >已审核</option>
						<option value="2" <c:if test="${userEducation.checkType == 2}"> selected="selected"</c:if> >审核中</option>
    				       <select> 
    	          </td>
    				</tr>
    				
    				<tr>
    				<td>是否有效：</td>
    				<td>
    					<select name="vaild">
    					<option value="0" <c:if test="${userEducation.vaild == 0}"> selected="selected"</c:if> >有效</option>	
						<option value="1" <c:if test="${userEducation.vaild == 1}"> selected="selected"</c:if> >无效</option>
						
    				       <select> 
    				</td>
    				
    				</tr>
    				
    				<tr>
    				<td>审核人姓名：</td>
    				<td><input type="text" name="auditor" value="${userEducation.auditor}"/></td>
    				</tr>
    				
    				<tr>
    				<td> 审核人ID：</td>
    				<td><input type="text" name="auditorId" value="${userEducation.auditorId}"/></td>
    				</tr>
    			</tr>
    			
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>