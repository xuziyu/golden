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
    	<input type="hidden" name="applyCode" value="${UserApplyForLimit.applyCode}"/><br/>
    	<input type="hidden" name="userId" value="${UserApplyForLimit.userId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<td>用户ID：${UserApplyForLimit.userId}</td>
    			</tr>
    			<tr>
    				<td>是否放贷：</td>
    				<td>
    				<select name="applyState">
    		           <option value="0" <c:if test="${UserApplyForLimit.applyState == 0}"> selected="selected"</c:if> >放贷</option>	
			           <option value="1" <c:if test="${UserApplyForLimit.applyState == 1}"> selected="selected"</c:if> >不放贷</option>
					  <option value="2" <c:if test="${UserApplyForLimit.applyState == 2}"> selected="selected"</c:if> >待审核</option>
    	             <select>  
    				</td>
    			</tr>
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>