package model;

public class Automobile {

	public String marca, modello, targa;
	public boolean privato;
	public double kw;

	public Automobile(String marca, String modello, String targa, boolean privato, double kw) {
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.privato = privato;
		this.kw = kw;
	}

	public double calcolaBollo() {
		
		double valoreBollo = this.kw * 3.70;

		if (this.privato == false ) {
			valoreBollo = valoreBollo - ( valoreBollo * 0.25 );
		}
		
		return valoreBollo;
		
	}
	
	public String libreto() {
		String s = "Marca: "+this.marca + " Modello: " + this.modello + " €" + this.calcolaBollo();
		return s;
	}

	@Override
	public String toString() {
		return "Automobile [marca=" + marca + ", modello=" + modello + ", targa=" + targa + ", calcolaBollo()="
				+ calcolaBollo() + "]";
	}
	
	
	
}
