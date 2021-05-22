package com.jato25.myApplication.cart;

import java.util.ArrayList;
import java.util.Iterator;

import com.jato25.myApplication.model.Categoria;
import com.jato25.myApplication.model.Product;
import com.jato25.myApplication.model.User;
import com.jato25.myApplication.persistence.CategoriaDAO;

public class ShoppingCart {
	
	private ArrayList<Product> items;
	private final String BONUS = "Bonus";
	CategoriaDAO catDb;
	
	
	public ShoppingCart() {
		super();
		this.items = new ArrayList<Product>();
	}

	public void addItem(Product product) {
		if (product.getName() != null && product.getPrice() > 0) {
			this.items.add(product);
			
		} //se è falso non aggiunge nulla alla lista
		
	}

	public int getItemCount() {
		return this.items.size();
	}
	
	public void removeItem(Product product) throws Exception {
		if (!this.items.remove(product)) {
			throw new Exception("Prodotto non trovato");
		}
		
		
	}
	
	public void empty() {
		this.items.clear();
	}
	
	public int getBalance() {
		int balance = 0;
		for (Product p : this.items) {
			balance += p.getPrice();
		}
		return balance;
	}
	
	public ArrayList<Product> getItems(Categoria c) {
		if(c == null) {
			return items;
		}
		ArrayList<Product> filterItems = new ArrayList<>();
		for (Product product : items) {
			if ( product.getCategoria().equals(c)) {
				filterItems.add(product);
			}
		}
		return filterItems;
	}
	
	public void bonusProduct(Product p, User u) {
		int contatore = 0;
		if(u.isPremium() && getBalance() >= 10) {
			for (Product product : items) {
				contatore++;
				if(product.getCategoria().getNome().equals(BONUS)) {
					contatore--;
				}			
			} if(contatore == items.size()) {
				this.items.add(p);		
			}
		}
		
	}
	
	public void removeBonusProduct(User u) {
		if(u.isPremium() && getBalance() < 10) {
			Iterator<Product> iter = items.iterator();

			while (iter.hasNext()) {
			    Product p = iter.next();

			    if (p.getCategoria().getNome().equals(BONUS)) {
			    	iter.remove();			    	
			    }
			}
//			for (Product product : items) {
//				if(product.getCategoria().equals(catDb.getCategoriaBonus())) {
//					removeItem(product);	
//				}				
//			}
		}
	}
	
	
}
