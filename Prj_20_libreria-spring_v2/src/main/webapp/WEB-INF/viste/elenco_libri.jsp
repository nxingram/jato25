<%@ include file="header.jsp" %>

	<h1>Elenco libri</h1>

	<ul>
		<c:forEach items="${libri}" var="libro">
			<li>
			<a href=/libri/${libro.getId()} >${libro.getTitolo()}</a></li>
			<a href=/libri/delete?id=${libro.getId()} >elimina</a>
			<!-- AJAX
			<a href=# onclick="eliminaRest">elimina</a>
			 -->
			</li>
			
		</c:forEach>
	</ul>

<%@ include file="footer.jsp" %>