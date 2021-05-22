<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
</head>
<body>
<form action="/admin/addProduct" method="post">
<!-- 	<input type="hidden" name="id" value="null"> -->
	<input type="text" name="prodotto" placeholder="prodotto"><br>
	<input type="text" name="categoria" placeholder="categoria"><br>
	<input type="number" name="proteine" placeholder="proteine"><br>
	<input type="number" name="lipidi" placeholder="lipidi"><br>
	<input type="number" name="carboidrati" placeholder="carboidrati"><br>
	<input type="number" name="energia" placeholder="energia"><br><br>
	<input type="submit" value="aggiungi prodotto"> 
</form>
</body>
</html>