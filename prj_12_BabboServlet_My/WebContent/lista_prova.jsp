<%@page import="model.Dono"%>
<%@page import="java.util.ArrayList"%>

<h1>Elenco doni</h1>
<%
	ArrayList<Dono> listaDoni = (ArrayList<Dono>) request.getAttribute("listaDoni");
%>
<table border="1">
	<thead>Lista doni</thead>
	<%
		for (Dono dono : listaDoni) {
	%>
	<tr>
		<td><%=dono.getNome()%></td>
	</tr>
	<%
		}
	%>
</table>
