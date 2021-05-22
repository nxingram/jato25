package com.jato25.dao;


public class DAOException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public DAOException(String message) {
		super(message);
	}
	public DAOException() {
		super();
	}
}