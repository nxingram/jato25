package enumerazioni;

public class Libro {

	String titolo;
	Genere genere;
	public Libro(String titolo, Genere genere) {
		super();
		this.titolo = titolo;
		this.genere = genere;
	}
	
	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", genere=" + genere + "]";
	}
	
	
}

