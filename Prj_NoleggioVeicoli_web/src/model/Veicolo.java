package model;

public class Veicolo {

	private String nome;
	private double costoNoleggio;

	public Veicolo() {
		nome = null;
		costoNoleggio = 0.0;
	}

	/**
	 * Costruttore
	 * @param nome - nome veicolo
	 * @param costoNoleggio - costo per noleggiare l'auto
	 */
	public Veicolo(String nome, double costoNoleggio) {
		this.nome = nome;
		this.costoNoleggio = costoNoleggio;
	}

	/** 
	 * @return nome del veicolo
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCostoNoleggio() {
		return costoNoleggio;
	}

	public void setCostoNoleggio(double costoNoleggio) {
		this.costoNoleggio = costoNoleggio;
	}

}
