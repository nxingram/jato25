package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		// TODO collegare alla vista di login in jsp
//		response.sendRedirect("login.html");
		request.getRequestDispatcher("login.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO leggere i parametri inviati dall0utente e confrontare con uname e psw
//		doGet(request, response);

		String _uname = "admin";
		String _psw = "12345";

		String uname = request.getParameter("uname");
		String psw = request.getParameter("psw");

		if (_uname.equals(uname) && _psw.equals(psw)) {
			response.getWriter().append("sei loggato");
			
			request.getSession().setAttribute("logged", _uname);	

			request.getRequestDispatcher("riservata.jsp").forward(request, response);
			
			System.out.println("utente loggato");
		} else {
			System.out.println("utente non loggato");
		}

	}

}
