package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Scaffale {

	private String identificativo;
//	private Libro[] libri;
	private ArrayList<Libro> libri;
	
//	public Scaffale(String identificativo, int numeroLibri) {
//		this.identificativo = identificativo;
//		this.libri = new Libro[numeroLibri];
//	}
	
	public Scaffale(String identificativo) {
		this.identificativo = identificativo;
		this.libri = new ArrayList<>();
	}
	
//	public Scaffale(String identificativo, Libro[] libri) {
//		this.identificativo = identificativo;
//		this.libri = libri;
//	}
	public Scaffale(String identificativo, ArrayList<Libro> libri) {
		this.identificativo = identificativo;
		this.libri = libri;
	}

	public String getIdentificativo() {
		return identificativo;
	}

	public void setIdentificativo(String identificativo) {
		this.identificativo = identificativo;
	}

//	public Libro[] getLibri() {
//		return libri;
//	}
	public ArrayList<Libro> getLibri() {
		return libri;
	}

	@Override
	public String toString() {
		return "Scaffale [identificativo=" + identificativo + ", libri=" + libri + "]";
	}

//	@Override
//	public String toString() {
//		return "Scaffale [identificativo=" + identificativo + ", libri=" + Arrays.toString(libri) + "]";
//	}
	
	




	
	
	
}
