package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Noleggio;
import model.Veicolo;

/**
 * Servlet implementation class Noleggi
 */
@WebServlet("/noleggi")
public class NoleggiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private NoleggioController nc;
       

    public NoleggiServlet() {
        super();
        nc = new NoleggioController();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Flotta f = new Flotta();
		ArrayList<Veicolo> veicoli = f.getVeicoli();		
		nc.addNoleggio(veicoli.get(0), 2, "batman");
		nc.addNoleggio(veicoli.get(1), 3, "robin");
		
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Noleggio> noleggi = nc.getNoleggi();
		for (Noleggio noleggio : noleggi) {
//			System.out.println(noleggio);
			sb.append(noleggio).append(" - ");
		}
		
		response.getWriter().append("/noleggi: ");
		response.getWriter().append(sb);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
