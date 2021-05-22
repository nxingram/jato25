package com.jato25.myApplication.model;

public class Categoria {
	
	private String nome;
	
	
	
	public Categoria(String nome) {
		super();
		this.nome = nome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome;
	}

	@Override
	public boolean equals(Object obj) {
		Categoria toCompare = (Categoria) obj;
		if (this.nome.equalsIgnoreCase(toCompare.getNome())) {
			return true;
		}
		return false;
		
	}

	

	
	
	

}
