package com.jato25.dao;

import java.util.List;

public interface ABSDao<T, I> {
	List<T> findAll() throws DAOException;

	T find(I id) throws DAOException;

	T save(T entry, String username) throws DAOException;

	void delete(I id, String username) throws DAOException;
}