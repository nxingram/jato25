package service;

import java.util.ArrayList;

import model.Dipendente;
import repo.DipendentiRepo;

public class LibroMatricolaSrv {
	
	private ArrayList<Dipendente> dipendenti;
	private DipendentiRepo dipendentiRepo;
	
	
	public LibroMatricolaSrv() {
		this.dipendentiRepo = new DipendentiRepo();
		this.dipendenti = this.dipendentiRepo.allDipendenti();
	}

	public void addDipendente(Dipendente d) {
		this.dipendenti.add(d);
	}
	
	public ArrayList<Dipendente> getDipendenti() {
		return dipendenti;
	}
	
	
	

}
