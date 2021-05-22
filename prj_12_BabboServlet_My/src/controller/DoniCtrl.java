package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dono;
import repository.DoniDAO;

/**
 * Servlet implementation class DoniCtrl
 */
@WebServlet("/doni")
public class DoniCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private DoniDAO _doniDAO;
	
    public DoniCtrl() {
        super();
        _doniDAO = new DoniDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuilder sb = new StringBuilder();
		for (Dono dono : _doniDAO.getDoni()) {
			sb.append(dono.getNome()).append(" - ");
		}		
		
//		response.getWriter().append(sb);
		request.setAttribute("listaDoni", _doniDAO.getDoni());
		
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("lista_prova.jsp").include(request, response);
		request.getRequestDispatcher("footer.jsp").include(request, response);
		
//		request.getRequestDispatcher("lista_doni.jsp").forward(request, response);

	}

}
