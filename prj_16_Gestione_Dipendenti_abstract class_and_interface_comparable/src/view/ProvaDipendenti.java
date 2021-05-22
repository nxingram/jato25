package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;
import service.LibroMatricola;

public class ProvaDipendenti {

	public static void main(String[] args) {

		ArrayList<Dipendente> dipendenti = genDipendenti();
		LibroMatricola lm = new LibroMatricola();
		loadDipendenti(lm, dipendenti);
		
		// sort ->> usa IComparable di dipendente
		Collections.sort(dipendenti);
		
		double varStipendio = 0;
		int giorni = 22;
		int consegne = 300;
		
		for (Dipendente dipendente : lm.getDipendenti()) {
			double stip = 0;
			if(dipendente instanceof Fattorino) {
				((Fattorino)dipendente).setConsegne(consegne);
			}		
			stip = dipendente.calcolastipendio(giorni);
			varStipendio += stip;
			System.out.println(dipendente);
			System.out.println("stipendio: " + stip);
			
		}
		
		System.out.println("tot stipendi: " + varStipendio);
		
		
	}

	private static  ArrayList<Dipendente> genDipendenti() {
		Dipendente[] dip = {
				new Dirigente("nomeD", "cognomeD"),
				new Impiegato("nomeI", "cognomeI"),
				new Impiegato("nomeI2", "cognomeI2"),
				new Impiegato("nomeI3", "cognomeI3"),
				new Fattorino("nomeF", "cognomeF"),
				new Fattorino("nomeF2", "cognomeF2"),
				new Fattorino("nomeF3", "cognomeF3")
		};
		
		return new ArrayList<Dipendente>(Arrays.asList(dip));
	}
	
	private static void loadDipendenti(LibroMatricola lm, ArrayList<Dipendente> dipendenti) {
		for (Dipendente dipendente : dipendenti) {
			lm.addDipendente(dipendente);
		}
	}
}
