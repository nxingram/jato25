<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Area riservata</h1>
	
	<% if (request.getAttribute("autorizzato") != null) { %>
	
		<h2>test informazioni segreta</h2>
	
	<% } %>
	
	
</body>
</html>