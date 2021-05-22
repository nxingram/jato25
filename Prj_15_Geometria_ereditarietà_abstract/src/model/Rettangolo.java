package model;

public class Rettangolo extends Forma {

	protected Segmento base, altezza;

	public Rettangolo(Segmento base, Segmento altezza) {
		this.nomeForma ="rettangolo";
		this.base = base;
		this.altezza = altezza;
	}
	
	public double perimetro() {
		return 2 * (base.lunghezza() + altezza.lunghezza());
	}
	
	public double superficie() {
		return this.base.lunghezza() * this.altezza.lunghezza();
	}
}
