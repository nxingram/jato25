package controller;

import java.util.ArrayList;

import model.Nota;

public class BloccoNote {

	private ArrayList<Nota> lista;

	public BloccoNote() {
		this.lista = new ArrayList<Nota>();
	}

	public void addNota(String testo) {

		Nota n = new Nota(testo);
		lista.add(n);

	}// fine metodo

	public ArrayList<Nota> getLista() {
		return lista;
	}

	public void completaNota(int pos) {
		lista.get(pos).setCompleta(true);
	}

}
