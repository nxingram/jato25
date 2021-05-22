<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Studenti</title>
</head>
<body>
	<h1>Pagina Studenti</h1>
	<%
		out.print(request.getAttribute("paolo"));
	%>
</body>
</html>