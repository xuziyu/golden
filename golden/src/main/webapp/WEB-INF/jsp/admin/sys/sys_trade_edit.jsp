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
    	<input type="hidden" name="tradeId" value="${sysTrade.tradeId}"/><br/>
    	<table>
    		<tbody>
    			<tr>
    				<%-- <td>黑名单：</td>
    				<td><input type="text" name="black" value="${sysTrade.black}"/></td> --%>			
    				
    				<tr>
    				<td>用户ID：</td>
    				<td><input type="text" name="userI" value="${sysTrade.userI}"/></td>
    				</tr>
    				
    				<tr>
    				<td> 交易金额：</td>
    				<td><input type="text" name="tradeMoney" value="${sysTrade.tradeMoney}"/></td>
    				</tr>
    				<tr>
    				<td> 类型：</td>
    				<td>
    					<select name="tradeType">
    					<option value="0" <c:if test="${sysTrade.tradeType == 0}"> selected="selected"</c:if> >未付款</option>	
						<option value="1" <c:if test="${sysTrade.tradeType== 1}"> selected="selected"</c:if> >待付款</option>
						<option value="2" <c:if test="${sysTrade.tradeType== 1}"> selected="selected"</c:if> >已付款</option>
						
    				       <select> 
    				
    				</td>
    				</tr>
    				<tr>
    				<td> 时间：</td>
    				<td><input type="text" name="tradeTime" value="${sysTrade.tradeTime}"/></td>
    				</tr>
    				<tr>
    				<td> 备注：</td>
    				<td><input type="text" name="tradeRemark" value="${sysTrade.tradeRemark}"/></td>
    				</tr>
    				
    			</tr>
    			
    		</tbody>
    	</table>
    	<input type="submit" value="保存" />
    </form>
</body>
</html>