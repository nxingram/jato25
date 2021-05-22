package com.jato25.dao;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.jato25.myApplication.model.USR;

public interface USRDao extends ABSDao<USR, Long>, UserDetailsService {

	USR findByName(String username);
	

}