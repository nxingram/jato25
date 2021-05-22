<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<form action="/admin/updProduct" method="post">
	<input type="hidden" name="id" value="${alimento.id}">
	<input type="text" name="prodotto" value="${alimento.prodotto}"><br>
	<input type="text" name="categoria" value="${alimento.categoria}"><br>
	<input type="number" name="proteine" value="${alimento.proteine}"><br>
	<input type="number" name="lipidi" value="${alimento.lipidi}"><br>
	<input type="number" name="carboidrati" value="${alimento.carboidrati}"><br>
	<input type="number" name="energia" value="${alimento.energia}"><br><br>
	<input type="submit" value="aggiorna prodotto"> 
</form>
</body>
</html>