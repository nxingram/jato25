package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import core.util.CheckUser;
import core.util.DateUtil;
import model.User;

public class CheckUserTest {
	private static CheckUser _checkUser;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		_checkUser = new CheckUser();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Date now = new Date();
		User userNoDate = new User("user1", null, false);
		User userNoAuth = new User("user1", DateUtil.subDays(now, 1), false);
		User userAuth = new User("user2", DateUtil.addDays(now, 1), false);
		User userPremium = new User("user3", DateUtil.subDays(now, 4), true); // premium user -> 5 extra days before being disabled
				
		
		assertFalse("User is NOT enabled, invalid expire date" ,_checkUser.isAuth(userNoDate));	
		assertFalse("User is NOT enabled, expired" ,_checkUser.isAuth(userNoAuth));	
		assertTrue("User is Enabled", _checkUser.isAuth(userAuth)); 
		assertTrue("Premium user is Enabled", _checkUser.isAuth(userPremium)); 	
		
		
		Exception e = new Exception("messaggio eccezione");
		assertTrue("messaggio eccezione".equals(e.getMessage()));
		
//		assertThrows(Exception.class, this.carrello.removeItem(prodotto));
		
		
	}

}
