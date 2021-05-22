<%@page import="libreria200.model.Studente"%>
<html>
<body>
<h2>Hello World!</h2>
</body>
<% Studente s = new Studente("nome", "cognome"); %>

<h3>Benvenuto <%=s.getNome() + " "+ s.getCognome() %></h3>
</html>
