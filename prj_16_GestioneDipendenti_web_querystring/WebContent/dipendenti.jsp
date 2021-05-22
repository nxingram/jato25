<%@page import="java.util.Locale"%>
<%@page import="model.Dipendente"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
  <%@include file="css/style.css" %>
</style>
<title>Dipendenti</title>
</head>
<body>
	<%@include file="/components/menu.jsp"%>
	
	<% 
	String type =  (String) request.getParameter("filter");	// from querystring	
	if(type==null)
		type = "dipendenti";
	ArrayList<Dipendente> dipendenti = (ArrayList<Dipendente>) request.getAttribute("dipendenti");
	%>
	
	<h2>Elenco <%=type %></h2>
	<table>
		<thead>
			<tr>
				<td>Matricola</td>
				<td>Cognome</td>
				<td>Nome</td>
			</tr>
		</thead>
		<tbody>
			<%
				for (Dipendente d : dipendenti) {
			%>
			<tr>
				<td><%=d.getnMatricola()%></td>
				<td><%=d.getCognome()%></td>
				<td><%=d.getNome()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>


</body>
</html>