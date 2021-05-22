package service;

import java.util.ArrayList;

import model.Dipendente;
import repo.DipendentiRepo;

public class LibroMatricola {
	
	private ArrayList<Dipendente> dipendenti;
	private DipendentiRepo dipendentiRepo;
	
	
	public LibroMatricola(ArrayList<Dipendente> dipendenti) {
		this.dipendentiRepo = new DipendentiRepo();
		this.dipendenti = this.dipendentiRepo.allDipendenti();
	}

	public LibroMatricola() {
		this.dipendenti = new ArrayList<Dipendente>();
	}

	public void addDipendente(Dipendente d) {
		this.dipendenti.add(d);
	}
	
	public ArrayList<Dipendente> getDipendenti() {
		return dipendenti;
	}
	
	
	

}
