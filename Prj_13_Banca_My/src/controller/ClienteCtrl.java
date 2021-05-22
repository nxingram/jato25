package controller;

import java.util.ArrayList;

import model.Cliente;

public class ClienteCtrl {

	private ArrayList<Cliente> anagraficaClienti;
	
	public ClienteCtrl() {
		this.anagraficaClienti = new ArrayList<>();
	}
	
	public ClienteCtrl addClient(String nome) {
		anagraficaClienti.add(new Cliente(nome));
		return this;
	}
	
	public ArrayList<Cliente> getAnagraficaClienti() {
		return anagraficaClienti;
	}
}
