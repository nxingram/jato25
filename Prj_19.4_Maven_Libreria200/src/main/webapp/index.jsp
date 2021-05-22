<%@page import="libreria200.model.Studente"%>
<html>
<body>
<h2>Hello World!</h2>

<% Studente s = new Studente("mauro", "bogliaccino"); %>

<h3>Benvenuto <%= s.getNome().toUpperCase() %></h3>

</body>
</html>
