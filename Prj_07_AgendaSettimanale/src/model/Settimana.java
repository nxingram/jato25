package model;

public class Settimana {

	private Giorno[] giorni;
	private String nome;
	
	public Settimana(String nome) {
		this.nome = nome;
		this.giorni = new Giorno[] {
				new Giorno("Luned�", "01"),
				new Giorno("Marted�", "02"),
				new Giorno("Mercoled�", "03"),
				new Giorno("Gioved�", "04"),
				new Giorno("Venerd�", "05"),
				new Giorno("Sabato", "06"),
				new Giorno("Domenica", "07"),
		};
		
		
	}

	public Giorno[] getGiorni() {
		return giorni;
	}

	public String getNome() {
		return nome;
	}
	
	
	
	
}
