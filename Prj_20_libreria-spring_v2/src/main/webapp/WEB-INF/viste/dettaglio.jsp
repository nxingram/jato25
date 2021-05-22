<%@ include file="header.jsp" %>




<h1>${libro.getTitolo()}</h1>
<h2>Pagine: ${libro.getPagine()}</h2>
<h2>Prezzo i.e: ${libro.getPrezzo()}</h2>
<h2>Prezzo i.c: ${libro.getP_iva()}</h2>


<a class="btn btn-primary" href="../libri">Torna all'elenco</a>

<%@ include file="footer.jsp" %>