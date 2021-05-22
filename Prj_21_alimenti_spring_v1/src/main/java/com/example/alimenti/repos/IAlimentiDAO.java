package com.example.alimenti.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.alimenti.entities.Alimento;

public interface IAlimentiDAO extends JpaRepository<Alimento, Integer>{

}
