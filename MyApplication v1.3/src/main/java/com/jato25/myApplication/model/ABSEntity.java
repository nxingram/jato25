package com.jato25.myApplication.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

@JsonIgnoreProperties(ignoreUnknown = true)
@MappedSuperclass
public class ABSEntity<T> {

	@Id
	@JsonProperty("id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;

	@JsonIgnore
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "insert_time")
	protected Date insertTime;

	@JsonIgnore
	@UpdateTimestamp
	@Column(name = "last_update")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date lastEditedTime;

	@JsonIgnore
	@Column(nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	protected boolean active = true;
	
	
	public ABSEntity() {
		super();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public Date getLastEditedTime() {
		return lastEditedTime;
	}

	public void setLastEditedTime(Date lastEditedTime) {
		this.lastEditedTime = lastEditedTime;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	
	
	
	
}