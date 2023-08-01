<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee insert</title>
</head>
<body>
	<h2>Employee info</h2>
	<br>
	<form:form action="saveEmployee" modelAttribute="employee">
		<form:hidden path="id"/>
		Name <form:input path="name"/>
		<br><br>
		Surname <form:input path="surname"/>
		<br><br>
		Department <form:input path="department"/>
		<br><br>
		Salary <form:input path="salary"/>
		<br><br>
		<input type="submit" value="OK">
	</form:form>
</body>
</html>