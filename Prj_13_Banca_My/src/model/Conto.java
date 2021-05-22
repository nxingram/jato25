package model;

public class Conto {


	private static int contatore =1;
	private int numero;
	private Cliente cliente;

	
	public Conto(Cliente c) {
		this.cliente = c;
		this.numero = contatore++;
	}


	@Override
	public String toString() {
		return "Conto [numero=" + numero + ", cliente=" + cliente.getNome() + "]";
	}



	
	
}
