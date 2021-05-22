package com.example.alimenti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.alimenti.entities.Alimento;
import com.example.alimenti.repos.IAlimentiDAO;


@Service
public class AlimentiService implements IAlimentiService {

	@Autowired
	private IAlimentiDAO repo;
	
	@Override
	public Alimento addAlimenti(Alimento al) {
		return repo.save(al);
	}

	@Override
	public List<Alimento> getAlimenti() {
		return repo.findAll();
	}

	@Override
	public Alimento getAlimenti(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Alimento updateAlimenti(Alimento al) {
		return repo.save(al);
	}

	@Override
	public void deleteAlimenti(int id) {
		repo.deleteById(id);		
	}

}
