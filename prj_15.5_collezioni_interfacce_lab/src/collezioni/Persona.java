package collezioni;

import java.util.Comparator;


public class Persona implements Comparable<Persona> {

	private String nome;
	private String cognome;

	public Persona(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}

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

	@Override
	public int compareTo(Persona o) {
//		return 0;
//		return this.nome.compareTo(o.nome); // compare strings
//		return this.cognome.compareTo(o.cognome); 

		Comparator<Persona> comparing1 = Comparator.comparing(Persona::getNome);
		Comparator<Persona> comparing2 = Comparator.comparing(Persona::getCognome);
		Comparator<Persona> thenComparing = comparing2.thenComparing(comparing1);
		return thenComparing.compare(this, o);
	}

}
