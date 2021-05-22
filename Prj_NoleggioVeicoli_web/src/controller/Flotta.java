package controller;

import java.util.ArrayList;

import model.Veicolo;

public class Flotta {

	private ArrayList<Veicolo> veicoli;

	public Flotta() {
		veicoli = new ArrayList<Veicolo>();
		init();
	}

	private void init() {
		veicoli.add(new Veicolo("alfa", 10.00));		
		veicoli.add(new Veicolo("bmw", 30.00));		
		veicoli.add(new Veicolo("ferrari", 100.00));
	}

	public ArrayList<Veicolo> getVeicoli() {
		return veicoli;
	}
	
	
}
