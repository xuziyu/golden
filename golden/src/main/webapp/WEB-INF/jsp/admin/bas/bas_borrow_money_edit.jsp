<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="save.action" method="post">
    	<input type="hidden" name="borrowId" value="${basBorrowMoney.borrowId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<td>用户ID：${basBorrowMoney.userId}</td>
    			</tr>
    			<tr>
    				<td>备注1</td>			
    				<td><input type="text" name="borrowRemark1" value="${basBorrowMoney.borrowRemark1}"/></td>
    			</tr>
    			<tr>
    				<td>备注2</td>			
    				<td><input type="text" name="borrowRemark2" value="${basBorrowMoney.borrowRemark2}"/></td>
    			</tr>
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>