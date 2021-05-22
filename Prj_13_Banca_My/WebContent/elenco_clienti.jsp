<%@page import="model.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clienti</title>
</head>
<body>
	<%
		ArrayList<Cliente> clienti = (ArrayList<Cliente>) request.getAttribute("clienti");
	%>
	<h1>Elenco Clienti</h1>
	<table>
		<%
			for (Cliente cliente : clienti) {
		%>
		<tr>
			<td><%=cliente%></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>