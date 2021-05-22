
<%@page import="controller.BloccoNote"%>
<%@page import="model.Nota"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Blocco note</h1>
	
	<%@ include file="form_inserimento.html" %>
	<%
	BloccoNote bn = null;
	//c'è già un blocco note nella sessione per questo utente?
			if (session.getAttribute("blocco") != null){
			//se c'è lo uso
				bn = (BloccoNote) session.getAttribute("blocco");
			} else {
			//se non c'è lo creo, quindi lo uso
				bn = new BloccoNote();
			}
			
	
	
		//verifico se l'utente ha inserito una nuova nota
		if (request.getParameter("nota")!=null && request.getParameter("nota").length() > 0){
			
			String s =  request.getParameter("nota")  ;

			bn.addNota(s);		
		}


		
		//salvo il blocco nella sessione di tomcat
		session.setAttribute("blocco", bn);
		
	%>
	<ul>
	<% 
		//stampo il blocco note
		for (Nota n : bn.getLista()){
			out.print("<li>" +  n  + "</li>");
		}
	%>
	</ul>	
		
</body>
</html>