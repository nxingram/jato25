package controller;

import java.util.ArrayList;

import model.Libro;

public class LibroCtrl {

	private ArrayList<Libro> libri;

	public LibroCtrl() {
		this.libri = new ArrayList<Libro>();
	}
	
	public ArrayList<Libro> getLibri() {
		return new ArrayList<Libro>(this.libri);
	}
	
	public void addLibro(Libro libro) {
		this.libri.add(libro);
	}
	
	public void addLibro(String titolo, String codice, double prezzo) {
		this.libri.add(new Libro(titolo, codice, prezzo));
	}
	
	
	

}
