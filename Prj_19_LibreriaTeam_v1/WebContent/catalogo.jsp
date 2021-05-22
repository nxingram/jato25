<%@page import="java.util.List"%>
<%@page import="entities.Catalogo"%>
<link rel="stylesheet" href="css.css">
<% List<Catalogo> catalogo = (List<Catalogo>) request.getAttribute("catalogo"); %>

<table id="table_dipendenti">
	<thead>
		<tr>
			<th>Titolo Libro</th>
		
			<th>Nome Autore</th>
		
		</tr>
		<% for (Catalogo c :  catalogo) { %>

		<tr>
			<td><%= c.getLibro().getTitolo() %></td>
	
			<td><%= c.getAutore().getNome() %></td>
		

		</tr>

		<% } %>
	
</table>
