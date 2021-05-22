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
import com.jato25.myApplication.model.PRD;

@Component
@Path("product")
public class ProductApi {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	protected ABSDao<PRD, Long> prdDao;

	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}/{version}")
	public PRD profile(@PathParam(value = "id") Long id, @PathParam(value = "version") String version) {
		logger.info("called get product version:{} with id:{}", version, id);
		return prdDao.find(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("list/{version}")
	public List<PRD> list(@PathParam(value = "version") String version) {
		logger.info("called list version:{}", version);
		return prdDao.findAll();
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("create/{version}")
	public PRD create (@RequestBody() String payload, @PathParam(value = "version") String version)
	{
		
		logger.info("called create version:{}", version);
		PRD product = null;
		
		try {

			ObjectMapper mapper = new ObjectMapper();
			product = mapper.readValue(payload, PRD.class);
			product = prdDao.save(product, "webapp");

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getLocalizedMessage());
			
		}
		
		
		
		return product;
	}
	
}
