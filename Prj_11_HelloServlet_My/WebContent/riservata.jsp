<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Area Riservata</h1>
	<%
		if (session.getAttribute("logged") != null) {
	%>

	<h2>contenuto riservato!!</h2>
	<p>Benvenuto <%=session.getAttribute("logged")%></p>

	<%
		}
	%>
</body>
</html>