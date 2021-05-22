package com.jato25.myApplication.api.helper;


import org.junit.Test;

public class RestCallHelperImplTest {
		
	//TODO e2e Test
	
	@Test
	public void testGet() {
		RestCallHelperImpl helperImpl =  new RestCallHelperImpl();
		String url = "http://localhost:8080/MyApplication/rest/user/profile/v1";
		String payload ="";
		helperImpl.get(payload, url);
		
	}
}
