package com.jato25.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.jato25.myApplication.model.USR;


public class USRDaoImpl extends ABSDaoImpl<USR, Long> implements USRDao {

	

	public USRDaoImpl() {
		super(USR.class);
	}

	

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		USR user = this.findByName(username);
		if (null == user) {
			throw new UsernameNotFoundException("The user with name " + username + " was not found");
		}
		return user;
	}
	
	
	
	

	@Override
	@Transactional(readOnly = true)
	public USR findByName(String name) {
		final CriteriaBuilder builder = this.getEntityManager().getCriteriaBuilder();
		final CriteriaQuery<USR> criteriaQuery = builder.createQuery(this.entityClass);
		Root<USR> root = criteriaQuery.from(this.entityClass);
		Path<String> namePath = root.get("username");
		criteriaQuery.where(builder.equal(namePath, name));
		TypedQuery<USR> typedQuery = this.getEntityManager().createQuery(criteriaQuery);
		List<USR> users = typedQuery.getResultList();
		if (users.isEmpty()) {
			return null;
		}
		return users.iterator().next();
	}
}
