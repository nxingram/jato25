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
				new Dirigente("nomeDirigente", "cognomeDirigente"),
				new Impiegato("nomeImpiegato", "cognomeImpiegato"),
				new Impiegato("nomeImpiegato2", "cognomeImpiegato2"),
				new Impiegato("nomeImpiegato3", "cognomeImpiegato3"),
				new Fattorino("nomeFattorino", "cognomeFattorino"),
				new Fattorino("nomeFattorino2", "cognomeFattorino2"),
				new Fattorino("nomeFattorino3", "cognomeFattorino3")
		};
		
		return new ArrayList<Dipendente>(Arrays.asList(dip));
	}
}
