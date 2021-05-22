package model;

public class Fattorino extends Dipendente {

	private int consegne;
	
	public Fattorino(String nome, String cognome) {
		super(nome, cognome);
		this.pagaBase = ParametriCosto.TARIFFA_FATTORINO;
		this.consegne = 0;
	}

	@Override
	public double calcolastipendio(int giorni) {
		return (this.consegne *ParametriCosto.TARIFFA_CONSEGNA) 
				+  (this.pagaBase * ParametriCosto.GIORNATA * giorni);
	}
	
	public void setConsegne(int consegne) {
		this.consegne = consegne;
	}

}
