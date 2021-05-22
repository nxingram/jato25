package com.jato25.myApplication.model;

public class Product {

	private String name;
	private int price;
	private Categoria categoria;
	
	public Product(String name, int price, Categoria categoria) {
		super();
		this.name = name;
		this.price = price;
		this.categoria = categoria;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", categoria=" + categoria + "]";
	}
	
	
	
}
