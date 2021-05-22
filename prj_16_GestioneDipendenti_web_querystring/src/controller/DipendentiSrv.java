package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;
import service.LibroMatricolaSrv;

@WebServlet("/dipendenti")
public class DipendentiSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LibroMatricolaSrv libroMatricolaSrv;

	public DipendentiSrv() {
		super();
		this.libroMatricolaSrv = new LibroMatricolaSrv();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Dipendente> dipendenti = this.libroMatricolaSrv.getDipendenti();
		ArrayList<Dipendente> filteredList = new ArrayList<Dipendente>();
		String filter = (String) request.getParameter("filter");

		if (filter == null || filter == "") {
			request.setAttribute("dipendenti", dipendenti);
		} else {
			switch (filter) {
			case "dirigenti":
				filteredList = (ArrayList<Dipendente>) dipendenti.stream().filter(d -> d instanceof Dirigente)
						.collect(Collectors.toList());
				break;
			case "impiegati":
				filteredList = (ArrayList<Dipendente>) dipendenti.stream().filter(d -> d instanceof Impiegato)
						.collect(Collectors.toList());
				break;
			case "fattorini":
				filteredList = (ArrayList<Dipendente>) dipendenti.stream().filter(d -> d instanceof Fattorino)
						.collect(Collectors.toList());
				break;

			default:
				request.setAttribute("dipendenti", dipendenti);
				break;
			}

			request.setAttribute("dipendenti", filteredList);
		}
		
		request.getRequestDispatcher("dipendenti.jsp").forward(request, response);

	}


}
