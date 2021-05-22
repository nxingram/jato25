package controller;

import java.util.ArrayList;

import model.Libro;
import model.Scaffale;

public class ScaffaleCtrl {
	private Scaffale scaffale;

	public ScaffaleCtrl(Scaffale scaffale) {
		this.scaffale = scaffale;
	}

//	public void addLibro(Libro libro, int posizione) {
//	this.scaffale.getLibri()[posizione] = libro;
//}
	public void addLibro(Libro libro) {
	this.scaffale.getLibri().add(libro) ;
}

	public Libro getLibro(int posizione) {
//		return this.scaffale.getLibri()[posizione];
		return this.scaffale.getLibri().get(posizione);
		
	}

	public Libro findLibro(String titolo) {
		for (Libro libro : this.scaffale.getLibri()) {
			if (libro != null && libro.getTitolo().equalsIgnoreCase(titolo))
					return libro;
		}
		return null;
	}
	
	public Libro findLibro(Libro libro) {
		if(libro== null) return null;
		ArrayList<Libro> libri = this.scaffale.getLibri();
		if(this.scaffale.getLibri().contains(libro)) {
			int index = libri.indexOf(libro);
			return libri.get(index);
		}
		return null;
		
	}

	public boolean removeLibro(Libro libro) {
		Libro tmpL = this.findLibro(libro);
		if(tmpL!=null) {
			ArrayList<Libro> libri = this.scaffale.getLibri();
			libri.remove(libri.indexOf(libro));
		}
		return false;
	}
	
	public ArrayList<Libro> getAll(){
		return this.scaffale.getLibri();	}
}
