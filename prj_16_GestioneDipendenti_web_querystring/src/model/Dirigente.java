package model;

public class Dirigente extends Dipendente {

	public Dirigente(String nome, String cognome) {
		super(nome, cognome);
		this.pagaBase = ParametriCosto.TARIFFA_DIRIGENTE;
	}

	@Override
	public double calcolastipendio(int giorni) {
		return (this.pagaBase * giorni);
	}

}
