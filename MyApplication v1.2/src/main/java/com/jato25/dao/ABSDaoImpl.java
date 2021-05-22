package com.jato25.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.jato25.myApplication.model.ABSEntity;

public class ABSDaoImpl<T extends ABSEntity<T>, I> implements ABSDao<T, I> {
	
	@PersistenceContext
	private EntityManager entityManager;

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	protected final String DAO_GENERIC_EX = "DAO_GENERIC_EX";

	protected Class<T> entityClass;

	

	public ABSDaoImpl(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	public EntityManager getEntityManager() {
		return this.entityManager;
	}

	
	public void setEntityManager(final EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	


	@Transactional(readOnly = true)
	@Override
	public List<T> findAll() {

		final CriteriaBuilder builder = this.getEntityManager().getCriteriaBuilder();
		final CriteriaQuery<T> criteriaQuery = builder.createQuery(this.entityClass);
		Root<T> root = criteriaQuery.from(this.entityClass);
		Predicate active = builder.equal(root.get("active"), true);

		Predicate predicate = builder.and(active);
		criteriaQuery.where(predicate);
		Order order = builder.desc(root.get("lastEditedTime"));
		criteriaQuery.orderBy(order);
		TypedQuery<T> typedQuery = this.getEntityManager().createQuery(criteriaQuery);
		return typedQuery.getResultList();
	}

	


	@Override
	@Transactional(readOnly = true)
	public T find(I id) {
		return this.getEntityManager().find(this.entityClass, id);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public T findByUser(String userId, I id) {
		Object obj = this.getEntityManager().createQuery("FROM WFL WHERE user_id LIKE :userId and id LIKE :id").setParameter("userId", userId).setParameter("id", id).getSingleResult();
		return (T) obj;
	}

	@Override
	@Transactional(readOnly = false, noRollbackFor = Exception.class)
	public T save(T entity, String username) {

		T ret = null;

		
			this.getEntityManager().persist(entity);
		

		return ret;
	}

	

	

	@Override
	public void delete(I id, String userName) {
			
		
		
		 this.getEntityManager().remove(id);
		 
	}

	

}