package com.jato25;

import org.json.JSONObject;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jato25.dao.ABSDao;
import com.jato25.dao.USRDao;
import com.jato25.myApplication.model.PRD;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/abs/abs-test-context.xml")
public abstract class ABSTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Autowired
	protected USRDao usrDao;
	
	@Autowired
	protected ABSDao<PRD, Long> prdDao;

	public final String user = "user";
	
	public final String endPointAut = "/AUT/A";

	public final String endPointProfile = "AUT/profile";

	public final String endPointValidate = "AUT/validate";

	public final String endPointRoot = "http://localhost:8080/odv-api/rest";

	private final String validBodyAut = "{\"password\":\"password\",\"username\":\"" + user + "\"}";

	public final String TKAKey = "TKA";
	

	protected String login() {
		HttpResponse<String> response;
		try {
			response = Unirest.post(endPointRoot.concat(endPointAut))
					.header("content-type", "application/x-www-form-urlencoded").body(validBodyAut).asString();
			// System.out.println("body:" + response.getBody());
			final JSONObject obj = new JSONObject(response.getBody());
			return obj.getString("TKA");
		} catch (UnirestException e) {

			e.printStackTrace();
		}
		return "";
	}
}
