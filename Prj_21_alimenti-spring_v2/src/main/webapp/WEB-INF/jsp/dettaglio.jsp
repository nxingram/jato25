<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alimenti</title>
</head>
<body>
	<!-- 
	<h1>Sono il file index.jsp: ${chiave}</h1>
	 -->
	<h1>Scheda prodotto</h1>
	<h2>${alimento.prodotto}</h2>
	<ul>
		<li>Cat: ${alimento.categoria}</li>
		<li>proteine: ${alimento.proteine}</li>
		<li>lipidi: ${alimento.lipidi}</li>
		<li>carboidrati: ${alimento.carboidrati}</li>
		<li>energia: ${alimento.energia}</li>
	</ul>
</body>
</html>