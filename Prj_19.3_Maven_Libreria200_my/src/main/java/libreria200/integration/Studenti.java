package libreria200.integration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import libreria200.model.Studente;

/**
 * Servlet implementation class Studenti
 * return JSON
 */
@WebServlet("/rest/studenti")
public class Studenti extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Studenti() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * @return JSON
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("application/json");
		
		
//		String json = "{\"nome\":\"mauro\"}";
		Studente s =  new Studente("nome", "cognome");
		JSONObject json = new JSONObject();
		
		json.put("nome",s.getNome());
		json.put("cognome",s.getCognome());
		
		JSONArray array = new JSONArray();
		array.put(json);
		
		
		
//		response.getWriter().append(json.toString());
		response.getWriter().append(array.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
