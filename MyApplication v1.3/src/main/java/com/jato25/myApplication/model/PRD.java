package com.jato25.myApplication.model;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@javax.persistence.Entity
@Table(name = "tbl_prd", uniqueConstraints = { @UniqueConstraint(columnNames = "id") })
public class PRD extends ABSEntity<PRD> {
	public PRD(String name, Long price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Column(name = "name")
	private String name;
	@Column(name = "price")
	private Long price;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "related_ctg_id")
	private CTG relatedCTG;

	public PRD() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}
}
