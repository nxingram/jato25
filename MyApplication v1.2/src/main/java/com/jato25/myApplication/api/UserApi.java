package com.jato25.myApplication.api;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jato25.dao.USRDao;
import com.jato25.myApplication.model.USR;

@Component
@Path("user")
public class UserApi {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	USRDao userDao;
	@PersistenceContext
	EntityManager entityManager;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("profile/{id}/{version}")
	public USR profile(@PathParam(value = "id") Long id, @PathParam(value = "version") String version) {
		logger.info("called profile version:{} with id:{}", version, id);
		return new USR("Mock", new Date(), false);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("users/{version}")
	public List<USR> users(@PathParam(value = "version") String version) {
		logger.info("called profile version:{}", version);
		return userDao.findAll();
	}

	
}
