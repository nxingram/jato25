package model;

public abstract class Dipendente {

	private static int counterMat;
	protected String nome;
	protected String cognome;
	protected int nMatricola;
	protected double pagaBase;

	public Dipendente(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.nMatricola = counterMat++;
	}

	public abstract double calcolastipendio(int giorni);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getnMatricola() {
		return nMatricola;
	}

	public void setnMatricola(int nMatricola) {
		this.nMatricola = nMatricola;
	}

	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", cognome=" + cognome + ", nMatricola=" + nMatricola + ", pagaBase="
				+ pagaBase + "]";
	}


	
	

}
