<%@page import="controller.BloccoNote"%>
<%@page import="model.Nota"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
	<h1>Benvenuti</h1>

	<%@ include file="form_inserimento.jsp"%>

	<%
		BloccoNote bn = null;
	if (session.getAttribute("blocco") != null) {
		bn = (BloccoNote) session.getAttribute("blocco");
	} else {
		bn = new BloccoNote();
	}

	String req = request.getParameter("nota");
	if (req != null && !req.equals("")) {
		bn.addNota(req);
	}

	session.setAttribute("blocco", bn);
	%>

	<ul>
		<%
			for (Nota n : bn.getLista()) {
			out.print("<li>" + n + "</li>");
		}
		%>
	</ul>

</body>
</html>