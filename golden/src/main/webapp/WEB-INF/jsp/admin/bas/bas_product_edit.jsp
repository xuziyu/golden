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
    	<input type="hidden" name="productId" value="${basProduct.productId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<td>已募集总金额：</td>
    				<td><span>${basProduct.productMoney}</span></td>
<%--     				<td><input type="text" name="productMoney" value="${basProduct.productMoney}"/></td> --%>
    			</tr>
    			<tr>
    				<td>预期年化收益：</td>
    				<td><span>${basProduct.productIncome}</span></td>
<%--     				<td><input type="text" name="productIncome" value="${basProduct.productIncome}"/></td> --%>
    			</tr>
    			<tr>
    				<td>项目期限：</td>
    				<td><span><fmt:formatDate value="${basProduct.productTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span></td>
<%--     				<td><input type="text" name="productTime" value="<fmt:formatDate value="${basProduct.productTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td> --%>
    			</tr>
    			<tr>
    				<td>类型：</td>
<%--     				<td><span>${basProduct.productType}</span></td> --%>
    				<td><input type="text" name="productType" value="${basProduct.productType}"/></td>
    			</tr>
    			<tr>
    				<td>还款方式：</td>
<%--     				<td><span>${basProduct.productWay}</span></td> --%>
    				<td><input type="text" name="productWay" value="${basProduct.productWay}"/></td>
    			</tr>
    			<tr>
    				<td>还款截止期限：</td>
    				<td><span><fmt:formatDate value="${basProduct.pcount}" pattern="yyyy-MM-dd HH:mm:ss"/></span></td>
<%--     				<td><input type="text" name="pcount" value="<fmt:formatDate value="${basProduct.pcount}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td> --%>
    			</tr>
    			<tr>
    				<td>投资进度：</td>
<%--     				<td><span>${basProduct.productProgress}</span></td> --%>
    				<td><input type="text" name="productProgress" value="${basProduct.productProgress}"/></td>
    			</tr>
    			<tr>
    				<td>保障方式：</td>
<%--     				<td><span>${basProduct.productSaveway}</span></td> --%>
    				<td><input type="text" name="productSaveway" value="${basProduct.productSaveway}"/></td>
    			</tr>
    			<tr>
    				<td>需还本息：</td>
    				<td><span>${basProduct.productRateben}</span></td>
<%--     				<td><input type="text" name="productRateben" value="${basProduct.productRateben}"/></td> --%>
    			</tr>
    			<tr>
    				<td>发布时间：</td>
    				<td><span><fmt:formatDate value="${basProduct.productPublishTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span></td>
<%--     				<td><input type="text" name="productPublishTime" value="<fmt:formatDate value="${basProduct.productPublishTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td> --%>
    			</tr>
    			<tr>
    				<td>产品名称：</td>
    				<td><span>${basProduct.productName}</span></td>
<%--     				<td><input type="text" name="productName" value="${basProduct.productName}"/></td> --%>
    			</tr>
    			<tr>
    				<td>募集资金：</td>
    				<td><span>${basProduct.productTotalMoney}</span></td>
<%--     				<td><input type="text" name="productTotalMoney" value="${basProduct.productTotalMoney}"/></td> --%>
    			</tr>
    			<tr>
    				<td>投资范围：</td>
    				<td><span>${basProduct.investmentScope}</span></td>
<%--     				<td><input type="text" name="investmentScope" value="${basProduct.investmentScope}"/></td> --%>
    			</tr>
    			<tr>
    				<td>资金用途：</td>
<%--     				<td><span>${basProduct.useOfProceeds}</span></td> --%>
    				<td><input type="text" name="useOfProceeds" value="${basProduct.useOfProceeds}"/></td>
    			</tr>
    			<tr>
    				<td>状态：</td>
<%--     				<td><span>${basProduct.productState}</span></td> --%>
    				<td><input type="text" name="productState" value="${basProduct.productState}"/></td>
    			</tr>
    			<tr>
    				<td>封面：</td>
    				<td><span>${basProduct.productPicture}</span></td>
<%--     				<td><input type="text" name="productPicture" value="${basProduct.productPicture}"/></td> --%>
    			</tr>
    			<tr>
    				<td>标主id：</td>
    				<td><span>${basProduct.produceId}</span></td>
<%--     				<td><input type="text" name="produceId" value="${basProduct.produceId}"/></td> --%>
    			</tr>
    			<tr>
    				<td>项目描述：</td>
    				<td><span>${basProduct.productDesc}</span></td>
<%--     				<td><input type="text" name="productDesc" value="${basProduct.productDesc}"/></td> --%>
    			</tr>
    			<tr>
    				<td>保障措施：</td>
    				<td><span>${basProduct.productSafe}</span></td>
<%--     				<td><input type="text" name="productSafe" value="${basProduct.productSafe}"/></td> --%>
    			</tr>
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>