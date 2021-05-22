package presentazione;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.LibroDAO;
import model.Libro;

/**
 * Servlet implementation class LibriSrv
 */
@WebServlet("/libri")
public class LibriSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private LibroDAO ld;

    public LibriSrv() {
        super();
        ld = new LibroDAO();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// include header
		request.getRequestDispatcher("header.jsp").include(request, response);

		String id = request.getParameter("id");
		
		if(id!=null) {
			int idInt = Integer.parseInt(id);
			Libro libro = ld.getLibro(idInt);
			response.getWriter().append(libro.getTitolo());
			
		}else {
			 ArrayList<Libro> libri = ld.getLibri();
//			 response.getWriter().append(libri.toString());
			 request.setAttribute("libri", libri);
			 // include libri.jsp
			 request.getRequestDispatcher("libri.jsp").include(request, response);
			 
		}
		

		// include footer
		request.getRequestDispatcher("footer.jsp").include(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
