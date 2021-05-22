package controller;

import java.util.ArrayList;

import model.Noleggio;
import model.Veicolo;

public class NoleggioController {

	private ArrayList<Noleggio> noleggi;
	
	public NoleggioController() {
		noleggi = new ArrayList<Noleggio>();
	}
	
	public void addNoleggio(Veicolo veicolo, int giorni, String persona ) {
		Noleggio n = new Noleggio(veicolo, giorni, persona);
		this.noleggi.add(n);
	}

	public ArrayList<Noleggio> getNoleggi() {
		return noleggi;
	}
	
	
}
