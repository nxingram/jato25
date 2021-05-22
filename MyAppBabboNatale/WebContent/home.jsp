<%@page import="app.models.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<%
		// 	login logic
	 	User user = null;		
		if (session.getAttribute("user") == null) {
			    response.sendRedirect("index.jsp");
		} else{
			user = (User) session.getAttribute("user");
		}
	%>
	<h1>Home</h1>
<div><%=user.getFirstName() + " " + user.getLastName() %></div>
<div><%=user.toString() %></div>

</body>
</html>