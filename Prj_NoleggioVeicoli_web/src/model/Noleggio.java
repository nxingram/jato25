package model;

import java.time.LocalDate;

public class Noleggio {

	private Veicolo veicolo;
	private int giorni;
	private LocalDate data;
	private String persona;
	
	public Noleggio(Veicolo veicolo, int giorni, String persona) {
		this.veicolo = veicolo;
		this.giorni = giorni;
		this.data = LocalDate.now();
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Noleggio [veicolo=" + veicolo.getNome() 
		+ ", giorni=" + giorni 
		+ ", data=" + data + "]";
	}

	
	
	
}
