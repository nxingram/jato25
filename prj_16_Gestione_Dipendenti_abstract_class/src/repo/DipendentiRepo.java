package repo;

import java.util.ArrayList;
import java.util.Arrays;

import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class DipendentiRepo {

	
	public ArrayList<Dipendente> allDipendenti() {
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
}
