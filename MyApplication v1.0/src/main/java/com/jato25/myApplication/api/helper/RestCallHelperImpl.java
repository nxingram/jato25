package com.jato25.myApplication.api.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class RestCallHelperImpl implements RestCallHelper {
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public String send(String payload, String url) {
		
		HttpResponse<String> response;
		try {
			response = Unirest.post(url).header("content-type", "application/json").body(payload).asString();
			try {
				String responseB = response.getBody();
				logger.info("response:{}", responseB);
				return responseB;
				// org.codehaus.jackson.map.ObjectMapper mapper = new
				// org.codehaus.jackson.map.ObjectMapper();
				// TokenTransfer ret = mapper.readValue(response.getBody(),
				// TokenTransfer.class);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (UnirestException e) {
			e.printStackTrace();
		}
		
		return null;
		
		
	}
	
	
	
	@Override
	public String get(String queryString, String url) {
		
		
		String urlQuery = url.concat(queryString);
		
		logger.info("calling url: {}", urlQuery);
		
		HttpResponse<String> response;
		try {
			response = Unirest.get(urlQuery).header("content-type", "application/x-www-form-urlencoded").asString();
			try {
				String responseB = response.getBody();
				logger.info("{}", responseB);
				return responseB;				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (UnirestException e) {
			e.printStackTrace();
		}
		
		return null;
		
		
	}
	
	
	@Override
	public String post(String payload, String url) {
		
		HttpResponse<String> response;
		try {
			response = Unirest.post(url).header("content-type", "application/x-www-form-urlencoded").body(payload).asString();
			try {
				String responseB = response.getBody();
				logger.info("{}", responseB);
				return responseB;
				// org.codehaus.jackson.map.ObjectMapper mapper = new
				// org.codehaus.jackson.map.ObjectMapper();
				// TokenTransfer ret = mapper.readValue(response.getBody(),
				// TokenTransfer.class);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (UnirestException e) {
			e.printStackTrace();
		}
		
		return null;
		
		
	}

}
