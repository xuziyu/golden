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
    	<input type="hidden" name="investorId" value="${basInvestmentInformation.investorId}"/><br/>
    	<table>
    		<tbody>
    			
    			<tr>
    				<td>用户id：</td>
    				<td><span>${basInvestmentInformation.userId}</span></td>
<%--     				<td><input type="text" name="userId" value="${basInvestmentInformation.userId}"/></td> --%>
    			</tr>
    			<tr>
    				<td>投资id：</td>
    				<td><span>${basInvestmentInformation.tenderId}</span></td>
<%--     				<td><input type="text" name="tenderId" value="${basInvestmentInformation.tenderId}"/></td> --%>
    			</tr>
    			<tr>
    				<td>投标金额：</td>
    				<td><span>${basInvestmentInformation.investorMoney}</span></td>
<%--     				<td><input type="text" name="investorMoney" value="${basInvestmentInformation.investorMoney}"/></td> --%>
    			</tr>
    			<tr>
    				<td>投资状态：</td>
<%--     				<td><span>${basInvestmentInformation.investorStatus}</span></td> --%>
    				<td><input type="text" name="investorStatus" value="${basInvestmentInformation.investorStatus}"/></td>
    			</tr>
    			<tr>
    				<td>投资类型：</td>
    				<td><span>${basInvestmentInformation.investorStyle}</span></td>
<%--     				<td><input type="text" name="investorStyle" value="${basInvestmentInformation.investorStyle}"/></td> --%>
    			</tr>
    			<tr>
    				<td>借贷状态：</td>
<%--     				<td><span>${basInvestmentInformation.brrowStatus}</span></td> --%>
    				<td><input type="text" name="brrowStatus" value="${basInvestmentInformation.brrowStatus}"/></td>
    			</tr>
    			<tr>
    				<td>投资利率：</td>
<%--     				<td><span>${basInvestmentInformation.investorRest}</span></td> --%>
    				<td><input type="text" name="investorRest" value="${basInvestmentInformation.investorRest}"/></td>
    			</tr>
    			<tr>
    				<td>盈利方式：</td>
    				<td><span>${basInvestmentInformation.profitModel}</span></td>
<%--     				<td><input type="text" name="profitModel" value="${basInvestmentInformation.profitModel}"/></td> --%>
    			</tr>
    			<tr>
    				<td>盈利金额：</td>
    				<td><span>${basInvestmentInformation.profitMoney}</span></td>
<%--     				<td><input type="text" name="profitMoney" value="${basInvestmentInformation.profitMoney}"/></td> --%>
    			</tr>
    			<tr>
    				<td>投资时间：</td>
    				<td><span><fmt:formatDate value="${basInvestmentInformation.investorDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span></td>
<%--     				<td><input type="text" name="investorDate" value="<fmt:formatDate value="${basInvestmentInformation.investorDate}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td> --%>
    			</tr>
    			<tr>
    				<td>还款期限：</td>
<%--     				<td><span>${basInvestmentInformation.replayDate}</span></td> --%>
    				<td><input type="text" name="replayDate" value="${basInvestmentInformation.replayDate}"/></td>
    			</tr>
    			<tr>
    				<td>投标状态：</td>
<%--     				<td><span>${basInvestmentInformation.investorType}</span></td> --%>
    				<td><input type="text" name="investorType" value="${basInvestmentInformation.investorType}"/></td>
    			</tr>
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>