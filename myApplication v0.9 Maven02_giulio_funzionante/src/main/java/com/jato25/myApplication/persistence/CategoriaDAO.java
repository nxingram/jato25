package com.jato25.myApplication.persistence;

import java.util.ArrayList;

import com.jato25.myApplication.model.Categoria;

public class CategoriaDAO {

	public ArrayList<Categoria> getAnagraficaCategorie() {
		ArrayList<Categoria> categorie = new ArrayList<>();
		categorie.add(new Categoria("Cibo"));
		categorie.add(new Categoria("Bevande"));
		categorie.add(new Categoria("Vestiti"));
		
		return categorie;
	}
	
	public Categoria getCategoriaCibo() {
		return new Categoria("Cibo");
	}
	
	public Categoria getCategoriaBevanda() {
		return new Categoria("Bevanda");
	}
	
	public Categoria getCategoriaBonus() {
		return new Categoria("Bonus");
	}
	
	
	
}
