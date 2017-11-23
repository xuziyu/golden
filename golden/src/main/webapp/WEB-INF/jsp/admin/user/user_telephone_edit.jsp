<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增修页面</title>
</head>
<body>
    <form action="save.action" method="post">
    	<input type="hidden" name="tid" value="${userTelephone.tid}"/><br/>
    	<table>
    		<tbody>
    		<tr>
    				<td>认证时间：</td>
    				<td><input type="date" name="approveDate" value="${userTelephone.approveDate}"/></td>
    			</tr>
    			<tr>
    				<td>审核是否通过：</td>
    				<td>
    				<select name="approveState">
    		           <option value="0" <c:if test="${userTelephone.approveState == 0}"> selected="selected"</c:if> >未审核</option>	
			           <option value="1" <c:if test="${userTelephone.approveState == 1}"> selected="selected"</c:if> >已审核</option>
					  <option value="2" <c:if test="${userTelephone.approveState == 2}"> selected="selected"</c:if> >审核中</option>
    	             <select>  
    				</td>
    			</tr>
    			<tr>
    				<td>审核是否有效：</td>
    				<td>
    				<select name="valid">
    		           <option value="0" <c:if test="${userTelephone.valid == 0}"> selected="selected"</c:if> >有效</option>	
			           <option value="1" <c:if test="${userTelephone.valid == 1}"> selected="selected"</c:if> >无效</option>
					 
    	             <select>  
    				</td>
    			</tr>
    			<tr>
    				<td>审核人姓名：</td>
    				<td><input type="text" name="auditor" value="${userTelephone.auditor}"/></td>
    			</tr>
    			<tr>
    				<td>审核人id：</td>
    				<td><input type="text" name="auditorId" value="${userTelephone.auditorId}"/></td>
    			</tr>
    			
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>