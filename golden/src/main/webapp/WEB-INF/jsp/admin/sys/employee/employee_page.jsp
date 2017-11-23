<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/global_java.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>employee_page</title>

<script type="text/javascript">
	function gid(id){
		return document.getElementById(id);
	}

	function goPageIndex(index){
		gid("pageIndex").value = index ;
		gid("form").submit() ;
	}
</script>

</head>
<body>
	<a href="">新增</a><br/>
    SysEmployee list<br/>
    
    <form id="form" action="page.action" method="post">
    <input type="hidden" name="pageIndex" id="pageIndex" value="${page.pageIndex }" />
    	姓名:<input type="text" name="name" value="${name }"/> <br/>
    	<input type="submit" value="查询" />
   <hr/>
    
    <c:forEach items="${page.list }" var="employee">
    	${employee.employeeId} , 	${employee.employeeName}  
    	<a href="edit?employeeId=${employee.employeeId }">编辑</a> 
    	<a href="delete?employeeId=${employee.employeeId }">删除</a><br/>
    </c:forEach>
    <hr/>
<c:forEach begin="0" end="${page.pageCount-1 }" varStatus="status">
	<a href="javascript:goPageIndex(${status.index});">${status.index+1 }</a>
</c:forEach>

	<select name="pageSize" id="pageSize" onchange="javascript:goPageIndex(0);">
	
		<option value="5" <c:if test="${page.pageSize== 5}"> selected="selected"</c:if> >5</option>
		<option value="10" <c:if test="${page.pageSize== 10}"> selected="selected"</c:if> >10</option>
		<option value="100" <c:if test="${page.pageSize== 100}"> selected="selected"</c:if> >100</option>
	</select>
	
	总记录数:${page.recordCount} 总页数:${page.pageCount}
    </form>
</body>
</html>