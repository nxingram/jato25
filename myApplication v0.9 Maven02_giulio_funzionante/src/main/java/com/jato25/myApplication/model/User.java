package com.jato25.myApplication.model;

import java.util.Date;

import com.jato25.myApplication.cart.ShoppingCart;

public class User {

	
	
	private String username;
	private Date expireDate;
	private boolean isPremium;
	private ShoppingCart shoppingCart;
	
	
	public User() {}
	
	public User(String username, Date expireDate, boolean isPremium, ShoppingCart shoppingCart) {
		super();
		this.username = username;
		this.expireDate = expireDate;
		this.isPremium = isPremium;
		this.shoppingCart = shoppingCart;
		
	}
	
	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	
	
}
