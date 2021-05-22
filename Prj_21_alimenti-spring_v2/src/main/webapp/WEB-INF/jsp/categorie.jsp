<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- JSTL tag! -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- JSTL tag! -->


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alimenti</title>
</head>
<body>
	<h1>Categorie</h1>
	<ul>
		<c:forEach items="${categorie}" var="cat">
			<!-- 
			<li><c:out value="cat"></c:out></li>
			 -->
			<li>${cat}</li>
		</c:forEach>
	</ul>
</body>
</html>