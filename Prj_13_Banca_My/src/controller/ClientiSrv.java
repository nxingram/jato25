package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/clienti")
public class ClientiSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ClienteCtrl _controller;
       
    public ClientiSrv() {
        super();
        _controller = new ClienteCtrl();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		_controller.addClient("allen").addClient("giuliana").addClient("mauro");
		request.setAttribute("clienti", _controller.getAnagraficaClienti());
		request.getRequestDispatcher("elenco_clienti.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
