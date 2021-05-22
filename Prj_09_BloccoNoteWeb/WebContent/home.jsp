<%@ page import="model.Nota"%>
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
	
		if (request.getParameter("nota")!=null){
			
			String s =  request.getParameter("nota")  ;
			
			Nota n = new Nota(s);

			out.print(  n );
		}
	
	%>
	
</body>
</html>