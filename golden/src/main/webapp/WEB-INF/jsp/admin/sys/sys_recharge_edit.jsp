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
    	<input type="hidden" name="rechargeId" value="${sysRecharge.rechargeId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<td>流水号：</td>
    				<td><span>${sysRecharge.rechargeCode}</span></td>
<%--     				<td><input type="text" name="rechargeCode" value="${sysRecharge.rechargeCode}"/></td> --%>
    			</tr>
  				<tr>
    				<td>用户id：</td>
    				<td><span>${sysRecharge.userId}</span></td>
<%--     				<td><input type="text" name="userId" value="${sysRecharge.userId}"/></td> --%>
    			</tr>
    			<tr>
    				<td>充值类型：</td>
    				<td><span>${sysRecharge.rechargeType}</span></td>
<%--     				<td><input type="text" name="rechargeType" value="${sysRecharge.rechargeType}"/></td> --%>
    			</tr>
    			<tr>
    				<td>充值金额：</td>
    				<td><span>${sysRecharge.rechargeMoney}</span></td>
<%--     				<td><input type="text" name="rechargeMoney" value="${sysRecharge.rechargeMoney}"/></td> --%>
    			</tr>
    			<tr>
    				<td>充值时间：</td>
    				<td><span><fmt:formatDate value="${sysRecharge.rechargeTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span></td>
<%--     				<td><input type="text" name="rechargeTime" value='<fmt:formatDate value="${sysRecharge.rechargeTime}" pattern="yyyy-MM-dd HH:mm:ss"/>'/></td> --%>
    			</tr>
    			<tr>
    				<td>状态：</td>
<%--     				<td><span>${sysRecharge.rechargeStatu}</span></td> --%>
    				<td><input type="text" name="rechargeStatu" value="${sysRecharge.rechargeStatu}"/></td>
    			</tr>
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>