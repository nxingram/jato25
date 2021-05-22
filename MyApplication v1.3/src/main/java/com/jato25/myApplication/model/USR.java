package com.jato25.myApplication.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.Type;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@javax.persistence.Entity
@Table(name = "tbl_usr", uniqueConstraints = { @UniqueConstraint(columnNames = "id") })
public class USR  extends ABSEntity<USR> implements UserDetails {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "username", length = 5000)
	private String username;
	
	@JsonIgnore
	@Column(name = "expireDate")
	private Date expireDate;
	
	@Column(name="isPremium", nullable = false )
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isPremium;
	
	@JsonIgnore
	@Column(name="surname")
	private String surname;
	

	public USR() {
		super();
		
	}

	public USR(String username, Date expireDate, boolean isPremium) {
		super();
		this.username = username;
		this.expireDate = expireDate;
		this.isPremium = isPremium;
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

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
