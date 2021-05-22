package model;

public class Libro {

	private String autore;
	private String titolo;
	private int pagine;

	public Libro() {
		this.titolo = "";
		this.autore = "";
		this.pagine = 0;
	}
	
	/**
	 * Costruttore 2 param
	 * @param autore - stringa autore
	 * @param titolo - stringa titolo
	 */
	public Libro(String autore, String titolo) {
		this.titolo = titolo;
		this.autore = autore;
		this.pagine = 0;	
	}

	/**
	 * @return the pagine
	 */
	public int getPagine() {
		return pagine;
	}

	/**
	 * @param pagine the pagine to set
	 */
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	/**
	 * @return the titolo
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * @param titolo the titolo to set
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	/**
	 * @return the autore
	 */
	public String getAutore() {
		return autore;
	}

	/**
	 * @param autore the autore to set
	 */
	public void setAutore(String autore) {
		this.autore = autore;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", pagine=" + pagine + "]";
	}

	
	
	


	
	

}
