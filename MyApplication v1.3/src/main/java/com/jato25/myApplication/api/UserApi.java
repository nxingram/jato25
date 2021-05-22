package com.jato25.myApplication.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.jato25.dao.USRDao;
import com.jato25.myApplication.model.USR;

@Component
@Path("user")
public class UserApi {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	USRDao usrDao;
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}/{version}")
	public USR getItem(@PathParam(value = "id") Long id, @PathParam(value = "version") String version) {
		logger.info("called getItem version:{} with id:{}", version, id);
		return usrDao.find(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("list/{version}")
	public List<USR> getList(@PathParam(value = "version") String version) {
		logger.info("called getList version:{}", version);
		return usrDao.findAll();
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("create/{version}")
	public USR create (@RequestBody() String payload, @PathParam(value = "version") String version)
	{
		
		logger.info("called create version:{}", version);
		USR user = null;
		
		try {

			ObjectMapper mapper = new ObjectMapper();
			user = mapper.readValue(payload, USR.class);
			user = usrDao.save(user, "webapp");

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getLocalizedMessage());
			
		}
		
		logger.info("called create version end:{}", user);
		
		return user;
	}
	
}
