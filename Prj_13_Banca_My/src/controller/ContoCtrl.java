package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Conto;

public class ContoCtrl {

	private ArrayList<Conto> conti;
	
	public ContoCtrl() {
		this.conti = new ArrayList<Conto>();
	}
	
	/**
	 * @param c - Cliente
	 */
	public void addConto(Cliente c) {
		this.conti.add(new Conto(c));
	}
	
	/** 
	 * @return ArrayList<Conto> lista conti
	 */
	public ArrayList<Conto> getConti() {
		return conti;
	}
}
