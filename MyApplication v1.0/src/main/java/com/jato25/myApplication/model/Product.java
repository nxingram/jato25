package com.jato25.myApplication.model;

public class Product {
	
	
	private String name;
	private int price;
	private  String categoria;
	
	
	
	
	public Product(String name, int price, String categoria) {
		super();
		this.name = name;
		this.price = price;
		this.categoria = categoria;
	}
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
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
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

}
