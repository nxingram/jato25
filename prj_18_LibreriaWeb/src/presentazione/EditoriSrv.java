package presentazione;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.EditoreDAO;
import model.Editore;

/**
 * Servlet implementation class LibriSrv
 */
@WebServlet("/editori")
public class EditoriSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private EditoreDAO ed;

    public EditoriSrv() {
        super();
        ed = new EditoreDAO();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// include header
		request.getRequestDispatcher("header.jsp").include(request, response);

		String id = request.getParameter("id");
		
		if(id!=null) {
			int idInt = Integer.parseInt(id);
			Editore e;
			try {
				e = ed.getEditore(idInt);
				response.getWriter().append(e.getNome());
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}else {
			 List<Editore> editori;
			try {
				editori = ed.getEditori();
			 request.setAttribute("editori", editori);
			 // include editori.jsp
			 request.getRequestDispatcher("editori.jsp").include(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			 
		}
		

		// include footer
		request.getRequestDispatcher("footer.jsp").include(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
