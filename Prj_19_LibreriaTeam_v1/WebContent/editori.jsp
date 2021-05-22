<%@page import="java.util.List"%>
<%@page import="entities.Editore"%>
<link rel="stylesheet" href="css.css">
<%
List<Editore> editori = (List<Editore>) request.getAttribute("editori");
%>

<div class="columnWrapper">
	<div class="main">

		<table id="table_dipendenti">
			<thead>
				<tr>
					<th>Nome Editore</th>
				</tr>
				<%
				for (Editore e : editori) {
				%>

				<tr>
					<td><%=e.getNome()%></td>
					<td>
						<button class="iAddbutton" style="position: relative; left: 1em;"
							id="btnModify">modify</button>
						<form method="post" action="delete">
							<button style='position: relative; left: 1em;' id="btnCliccami">delete</button>
						</form>
					</td>
				</tr>


				<%
				}
				%>
			
		</table>
	</div>
</div>