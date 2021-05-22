package model;

import java.util.Date;

public class User {

	
	private String username;
	private Date expireDate;
	private boolean isPremium;
	
	public User(String username, Date expireDate, boolean isPremium) {
		this.username = username;
		this.expireDate = expireDate;
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
	public boolean isPremium() {
		return isPremium;
	}
	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}
	
	
	
	
}
