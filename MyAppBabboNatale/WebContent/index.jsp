<%@page import="app.controllers.UserController"%>
<%@page import="app.models.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>

	<%@ include file="forms/form_login.jsp"%>

	<%
		// 	login logic
	 	User user = null;
		
		if (session.getAttribute("user") != null) {
			user = (User) session.getAttribute("user");
			    response.sendRedirect("home.jsp");
		} else {
			UserController uc = new UserController();
			User validUser = uc.validateUser(request);
			
			if(validUser != null){
				//salvo il blocco nella sessione di tomcat
				session.setAttribute("user", validUser);
			    response.sendRedirect("home.jsp");
			}
		}



	%>
</body>
</html>