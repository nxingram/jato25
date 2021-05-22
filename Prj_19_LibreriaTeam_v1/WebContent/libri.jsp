<%@page import="java.util.Map"%>
<%@page import="entities.Libro"%>
<link rel="stylesheet" href="css.css">
<% Map<Integer, Libro> libri = (Map<Integer, Libro>) request.getAttribute("libri"); %>

<table id="table_dipendenti">
	<thead>
		<tr>
			<th>Titolo Libro</th>
		</tr>

		<% for (Libro l :  libri.values()) { %>

		<tr>
			<td><%= l.getTitolo() %></td>
			<td>
				<button class="iAddbutton" style="position: relative; left: 1em;"
					id="btnModify">modify</button>
				<form method="post" action="delete">
					<button style='position: relative; left: 1em;' id="btnCliccami">delete</button>
				</form>
			</td>
		</tr>

		<% } %>
	
</table>
