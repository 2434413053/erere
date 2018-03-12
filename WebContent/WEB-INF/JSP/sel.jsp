<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
</head>
<body>
		<form action="query">
		name:<input type="text" name='ename'> <select name="did">
			<option value="0">--亲选择--</option>
			<c:forEach items="${dl}" var="dept">
				<option value="${dept.did}">${dept.dname}</option>
			</c:forEach>
		</select> <input type="submit" value="模糊">
	</form>

	<table border="1">
		<tr>
			<td>eid</td>
			<td>ename</td>
			<td>esex</td>
			<td>date</td>
			<td>dname</td>
			<td><a href="addEmp">添加</a></td>
		</tr>

		<c:forEach items="${el}" var="e">
			<tr>
				<td>${e.eid }</td>
				<td>${e.ename }</td>
				<td>${e.esex }</td>
				<td>${e.date }</td>
				<td>${e.dept.dname}</td>
				<td><a href="deleteEmp?eid=${e.eid}">删除</a><a
					href="queryByEid?eid=${e.eid}">修改</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>