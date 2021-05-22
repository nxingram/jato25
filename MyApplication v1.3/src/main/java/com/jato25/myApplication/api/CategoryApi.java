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

import com.jato25.dao.ABSDao;
import com.jato25.myApplication.model.CTG;

@Component
@Path("category")
public class CategoryApi {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	protected ABSDao<CTG, Long> ctgDao;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	//category/1/v1
	@Path("{id}/{version}")
	public CTG profile(@PathParam(value = "id") Long id, @PathParam(value = "version") String version) {
		logger.info("called get product version:{} with id:{}", version, id);
		return ctgDao.find(id);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("list/{version}")
	public List<CTG> list(@PathParam(value = "version") String version) {
		logger.info("called list version:{}", version);
		return ctgDao.findAll();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("create/{version}")
	public CTG create (@RequestBody() String payload, @PathParam(value = "version") String version)
	{
		
		logger.info("called create version:{}", version);
		CTG category = null;
		
		try {

			ObjectMapper mapper = new ObjectMapper();
			category = mapper.readValue(payload, CTG.class);
			category = ctgDao.save(category, "webapp");

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getLocalizedMessage());
			
		}
		
		
		
		return category;
	}
	
	
	
	
}
