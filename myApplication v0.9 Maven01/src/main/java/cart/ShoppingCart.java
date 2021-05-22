package cart;

import java.util.ArrayList;

import model.Product;

public class ShoppingCart {
	
	private ArrayList<Product> items;
	
	
	public ShoppingCart() {
		super();
		this.items = new ArrayList<Product>();
	}

	public void addItem(Product product) {
		if (product.getName() != null && product.getPrice() > 0) {
			this.items.add(product);
		} //se � falso non aggiunge nulla alla lista
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
	
}
