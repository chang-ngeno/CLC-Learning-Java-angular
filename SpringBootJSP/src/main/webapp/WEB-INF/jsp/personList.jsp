<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8" />
<title>Person List</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body class="container">
	<h1>Person List</h1>

	<br />
	<br />
	<div>
		<table border="1" class="table table-bordered">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
			</tr>
			<c:forEach items="${persons}" var="person">
				<tr>
					<td>${person.firstName}</td>
					<td>${person.lastName}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>

</html>