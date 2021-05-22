package presentation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.LibroDAO;
import entities.Libro;

/**
 * Servlet implementation class Libri
 */
@WebServlet("/libri")
public class Libri extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LibroDAO ld;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Libri() {
        //inizializzo il librodao
    	ld = new LibroDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("header.jsp").include(request, response);

		if(request.getParameter("id")!=null) {			
			int id = Integer.parseInt(request.getParameter("id"));
			Libro libro=null;
			try {
				libro = ld.getLibro(id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			response.getWriter().append(libro.toString());
			} else {
			Map<Integer, Libro> libri=null;
			try {
				libri = ld.getLibri();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			request.setAttribute("libri", libri);
			request.getRequestDispatcher("libri.jsp").include(request, response);
			//response.getWriter().append(libri.toString());
		}
		
		request.getRequestDispatcher("footer.jsp").include(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
