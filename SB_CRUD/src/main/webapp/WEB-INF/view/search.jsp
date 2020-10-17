<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Database List</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

	<form action="<%=request.getContextPath()%>/RegController" method="get">
		<table border="2">
			<tr>
				<td>ID</td>
				<td>FirstName</td>
				<td>LastName</td>
				<td>UserName</td>
				<td>Password</td>
				<td>PasswordRepeat</td>
				<td>Delete</td>
				<td>Edit</td>
			</tr>

			<c:forEach items="${data}" var="i" varStatus="j">
				<tr>
					<td>${j.count}</td>
					<td>${i.fname}</td>
					<td>${i.lname}</td>
					<td>${i.uname}</td>
					<td>${i.password}</td>
					<td>${i.rpassword}</td>
					<td><a href="delete?id=${i.id}">delete</a></td>
					<td><a href="edit?id=${i.id}">edit</a></td>

				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>