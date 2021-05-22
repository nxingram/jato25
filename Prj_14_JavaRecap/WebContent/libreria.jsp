<%@page import="model.Libro"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Libreria</title>
</head>
<body>
	<h1>Libreria</h1>
	<%
		ArrayList<Libro> libri = (ArrayList<Libro>) request.getAttribute("libri");
		for(Libro libro: libri){
	%>
	<ul>
		<li>
			<%=libro %>
		</li>
	</ul>
	<% } %>

</body>
</html>