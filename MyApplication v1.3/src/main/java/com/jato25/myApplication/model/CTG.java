package com.jato25.myApplication.model;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@javax.persistence.Entity
@Table(name = "tbl_ctg", 
uniqueConstraints = { @UniqueConstraint(columnNames = "id") })
public class CTG extends ABSEntity<CTG>{
	
	@Column(name="name")
	private String name;
	
	public CTG() {
		super();
	}
	
	public CTG(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
