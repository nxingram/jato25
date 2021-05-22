package controller;

import database.DBStudenti;
import model.Studente;

public class Registro {
	
	//contenitore in cui riversati gli studenti del db
	private Studente[] studenti;
	
	//è l'oggetto db
	private DBStudenti db;

	public Registro() {
		db = new DBStudenti();
		this.studenti = db.getStudenti();
	}
	
	public void faiAppello() {
		//per ogni posizione io trovo un oggetto Studente
		for (Studente studente : studenti) {
			System.out.println(studente);
		}
	}
	
}
