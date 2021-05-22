<%@page import="entities.Autore"%>
<%@page import="java.util.List"%>
<link rel="stylesheet" href="css.css">
<% List<Autore> autori = (List<Autore>) request.getAttribute("autori"); %>

<table id="table_dipendenti">
	<thead>
		<tr>
			<th>Nome Autore</th>
		</tr>

		<% for (Autore a :  autori) { %>

		<tr>
			<td><%= a.getNome() %></td>
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
