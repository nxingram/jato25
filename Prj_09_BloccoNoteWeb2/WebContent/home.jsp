
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
	
	<form method="post">
		<input type="text" name="nota">
		<input type="submit" value="Aggiungi nota">
	</form>
	
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
		if (request.getParameter("nota")!=null){
			
			String s =  request.getParameter("nota")  ;
			
			//Nota n = new Nota(s);

			bn.addNota(s);		
			
			//out.print(  n );
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