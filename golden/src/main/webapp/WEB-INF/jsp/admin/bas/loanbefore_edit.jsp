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
    	<input type="hidden" name="realId" value="${UserRealName.realId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<td>真实姓名：${UserRealName.realName}</td>
    			</tr>
    			<tr>
    				<td>用户ID：${UserRealName.userId}</td>
    			</tr>
    			<tr>
    				<td>审核状态：</td>
    				<select name="check">
    		           <option value="0" <c:if test="${UserRealName.check == 0}"> selected="selected"</c:if> >通过</option>	
			           <option value="1" <c:if test="${UserRealName.check == 1}"> selected="selected"</c:if> >未通过</option>
					  <option value="2" <c:if test="${UserRealName.check == 2}"> selected="selected"</c:if> >待审核</option>
    	             <select>  
    			</tr>
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>