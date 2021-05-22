package com.jato25.myApplicatin.api;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.jato25.myApplication.model.User;

@Component
@Path("user")
public class UserApi {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("profile/v1")
	public User profile() {
		logger.info("called profile v1");
		return new User("Mock", new Date(), false);
	}
}
