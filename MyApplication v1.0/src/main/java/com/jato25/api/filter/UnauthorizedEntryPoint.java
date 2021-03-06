package com.jato25.api.filter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;


/**
 * {@link AuthenticationEntryPoint} that rejects all requests with an unauthorized error message.
 * 
 * 
 */
public class UnauthorizedEntryPoint implements AuthenticationEntryPoint
{

     
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
			throws IOException, ServletException
	{
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write("Unauthorized: Authentication token was either missing or invalid");
	    		
	}

}