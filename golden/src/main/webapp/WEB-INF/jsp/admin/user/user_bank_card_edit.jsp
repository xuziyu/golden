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
    	<input type="hidden" name="cardId" value="${userBankCard.cardId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<td>用户id：</td>
    				<td><span>${userBankCard.userId}</span></td>
<%--     				<td><input type="text" name="userId" value="${userBankCard.userId}"/></td> --%>
    			</tr>
    			<tr>
    				<td>交易编号：</td>
    				<td><span>${userBankCard.tradeCode}</span></td>
<%--     				<td><input type="text" name="tradeCode" value="${userBankCard.tradeCode}"/></td> --%>
    			</tr>
    			<tr>
    				<td>身份证：</td>
    				<td><span>${userBankCard.identityNumber}</span></td>
<%--     				<td><input type="text" name="identityNumber" value="${userBankCard.identityNumber}"/></td> --%>
    			</tr>
    			<tr>
    				<td>开户行：</td>
    				<td><span>${userBankCard.bankName}</span></td>
<%--     				<td><input type="text" name="bankName" value="${userBankCard.bankName}"/></td> --%>
    			</tr>
    			<tr>
    				<td>提交时间：</td>
    				<td><span><fmt:formatDate value="${userBankCard.submitTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span></td>
<%--     				<td><input type="text" name="submitTime" value='<fmt:formatDate value="${userBankCard.submitTime}" pattern="yyyy-MM-dd HH:mm:ss"/>'/></td> --%>
    			</tr>
    			<tr>
    				<td>审核状态：</td>
    				<td><input type="text" name="state" value="${userBankCard.state}"/></td>
    			</tr>
    			<tr>
    				<td>余额：</td>
    				<td><span>${userBankCard.blance}</span></td>
<%--     				<td><input type="text" name="blance" value="${userBankCard.blance}"/></td> --%>
    			</tr>
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>