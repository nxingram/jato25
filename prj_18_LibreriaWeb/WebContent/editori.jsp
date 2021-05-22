<%@page import="model.Editore"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Libro"%>
<%@page import="java.util.List"%>

<% List<Editore> editori = (ArrayList<Editore>) request.getAttribute("editori");  %>

<table>
<% for(Editore e : editori){ %>
	<tr><td><%=e.getNome() %><td></tr>

<% } %>
</table>