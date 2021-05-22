package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Studente;

/**
 * Servlet implementation class StudentiCtrl
 * {@link https://github.com/maboglia/CorsoJava/blob/master/appunti/060_RequestDispacher.md}
 */
@WebServlet("/studenti")
public class StudentiCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		response.getWriter().append("Served at: ").append(request.getContextPath());

		ArrayList<Studente> studenti = Registro.getStudenti();
		
//		StringBuilder sb = new StringBuilder();
//		
//		sb.append("<ul>");
//		for (Studente studente : studenti) {
//			sb.append("<li>");
//			sb.append(studente.getNome() + " " + studente.getCognome() + " - ");
//			sb.append("<li>");
//		}
//		sb.append("<ul>");
//		
//		response.setContentType("text/html");
//		response.getWriter().append(sb);
		
		request.setAttribute("paolo", "dimmi pure");
		request.getRequestDispatcher("studenti.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
