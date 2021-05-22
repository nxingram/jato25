<%@page import="entities.Catalogo"%>
<%@page import="java.util.List"%>
<!-- <link rel="stylesheet" href="css.css"> -->
<% List<Catalogo> catalogo = (List<Catalogo>) request.getAttribute("catalogo"); %>

<table class="table" id="table_dipendenti">
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
