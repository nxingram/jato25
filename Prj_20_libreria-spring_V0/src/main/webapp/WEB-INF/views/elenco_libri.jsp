<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- JSTL -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Elenco Libri</h1>
	<ul>
		<c:forEach items="${libri }" var="libro">
			<li>${libro.getTitolo()}</li>
		</c:forEach>

	</ul>
</body>
</html>