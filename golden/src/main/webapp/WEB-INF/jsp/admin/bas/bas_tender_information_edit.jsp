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
    	<input type="hidden" name="tenderId" value="${basTenderInformation.tenderId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<td>用户id：</td>
    				<td><span>${basTenderInformation.userId}</span></td>
<%--     				<td><input type="text" name="userId" value="${basTenderInformation.userId}"/></td> --%>
    			</tr>
    			<tr>
    				<td>总标数：</td>
    				<td><span>${basTenderInformation.markcount}</span></td>
<%--     				<td><input type="text" name="markcount" value="${basTenderInformation.markcount}"/></td> --%>
    			</tr>
    			<tr>
    				<td>失标数：</td>
    				<td><span>${basTenderInformation.lmcount}</span></td>
<%--     				<td><input type="text" name="lmcount" value="${basTenderInformation.lmcount}"/></td> --%>
    			</tr>
    			<tr>
    				<td>中标数：</td>
    				<td><span>${basTenderInformation.gmcount}</span></td>
<%--     				<td><input type="text" name="gmcount" value="${basTenderInformation.gmcount}"/></td> --%>
    			</tr>
    			<tr>
    				<td>总金额：</td>
    				<td><span>${basTenderInformation.markmoney}</span></td>
<%--     				<td><input type="text" name="markmoney" value="${basTenderInformation.markmoney}"/></td> --%>
    			</tr>
    			<tr>
    				<td>总收益：</td>
    				<td><span>${basTenderInformation.markgain}</span></td>
<%--     				<td><input type="text" name="markgain" value="${basTenderInformation.markgain}"/></td> --%>
    			</tr>
    			<tr>
    				<td>开始时间：</td>
    				<td><span><fmt:formatDate value="${basTenderInformation.markbegindate}" pattern="yyyy-MM-dd HH:mm:ss"/></span></td>
<%--     				<td><input type="text" name="markbegindate" value="<fmt:formatDate value="${basTenderInformation.markbegindate}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td> --%>
    			</tr>
    			<tr>
    				<td>结束时间：</td>
    				<td><span><fmt:formatDate value="${basTenderInformation.markenddate}" pattern="yyyy-MM-dd HH:mm:ss"/></span></td>
<%--     				<td><input type="text" name="markenddate" value='<fmt:formatDate value="${basTenderInformation.markenddate}" pattern="yyyy-MM-dd HH:mm:ss"/>'/></td> --%>
    			</tr>
    			<tr>
    				<td>日期：</td>
    				<td><span><fmt:formatDate value="${basTenderInformation.date}" pattern="yyyy-MM-dd HH:mm:ss"/></span></td>
<%--     				<td><input type="text" name="date" value='<fmt:formatDate value="${basTenderInformation.date}" pattern="yyyy-MM-dd HH:mm:ss"/>'/></td> --%>
    			</tr>
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>