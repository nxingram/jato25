package com.example.alimenti.services;

import java.util.List;

import com.example.alimenti.entities.Alimento;


public interface IAlimentiService {

	Alimento addAlimenti(Alimento al);//C
	List<Alimento> getAlimenti();//R
	Alimento getAlimenti(int id);
	Alimento updateAlimenti(Alimento al);//U	
	void deleteAlimenti(int id);//D
}
