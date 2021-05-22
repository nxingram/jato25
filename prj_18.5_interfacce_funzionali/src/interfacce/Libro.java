package interfacce;


public class Libro implements Comparable<Libro>{

	// incapsulamento
	private int pagine;
	private String titolo;
	
	public Libro(Integer pagine, String titolo) {
		super();
		this.pagine = pagine;
		this.titolo = titolo;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	@Override
	public String toString() {
		return "Libro [pagine=" + pagine + ", titolo=" + titolo + "]";
	}

	@Override
	public int compareTo(Libro altroLibro) {
		return this.pagine - altroLibro.pagine;
	}


	
	
}
