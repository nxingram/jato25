package view;

import java.sql.SQLException;
import java.util.ArrayList;

import db.LibroDAO;
import model.Libro;

public class LibroDAOProva {

	public static void main(String[] args) {
		LibroDAO ld = new LibroDAO();
//		Libro l = ld.getLibro(1);
//		System.out.println(l.getTitolo());

		// add
		Libro l2 = ld.getLibro(3);
		try {
			ld.addLibro(l2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// update
		l2.setPrezzo(1000);
		try {
			ld.updateLibro(l2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		

		printLibri(ld.getLibri());
		
	}
	
	private static void printLibri(ArrayList<Libro> libri) {
		for (Libro libro : libri) {
			System.out.println(libro);
		}	
	}

}
