<%@page import="java.util.ArrayList"%>
<%@page import="model.Libro"%>
<%@page import="java.util.List"%>

<% List<Libro> libri = (ArrayList<Libro>) request.getAttribute("libri");  %>

<table>
<% for(Libro l : libri){ %>
	<tr><td><%=l.getTitolo() %><td></tr>

<% } %>
</table>