package com.jato25.myApplication.core.constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import com.jato25.myApplication.cart.ShoppingCart;
import com.jato25.myApplication.model.User;

public class Const {
	public static ShoppingCart shoppingCart;
	
	//ERROR CODE
	public static String ERR01_USER_NOT_AUTH = "L'utente non è autorizzato"; 
	public static String ERR02_USER_AUTH = "L'utente è autorizzato";
	
	public static int meseMillis = 1000*60*60*24*30;
	
	
	public static Date today = new Date();
	public static Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));
	public static Date yesterday = new Date(today.getTime() - (1000 * 60 * 60 * 24));
	public static Date sixDaysAgo = new Date(today.getTime() - (1000 * 60 * 60 * 24)*6);
	
	//MOCK OBJECT
	public static User MOCK01_USER_NULL = new User("USER_NULL", null, false, shoppingCart);
	public static User MOCK02_ACTIVE_PREMIUM_USER = new User("PREMIUM_USER_Active", tomorrow, true, shoppingCart);
	public static User MOCK03_EXPIRED_PREMIUM_USER = new User("PREMIUM_USER_Expired", sixDaysAgo, true, shoppingCart);
	
	//MOCK OBJECT
	public static User MOCK04_USER_NULL = new User("USER_NULL", null, false, shoppingCart);
	public static User MOCK05_ACTIVE_STANDARD_USER = new User("PREMIUM_USER_Active", tomorrow, false, shoppingCart);
	public static User MOCK06_EXPIRED_STANDARD_USER = new User("PREMIUM_USER_Expired", sixDaysAgo, false, shoppingCart);
	
		
	
	
	public static ArrayList<User> MOCK03_PREMIUM_USERS =  new ArrayList<User>(
		    Arrays.asList(MOCK01_USER_NULL, MOCK02_ACTIVE_PREMIUM_USER, MOCK03_EXPIRED_PREMIUM_USER));
	
	
	public static ArrayList<User> MOCK07_STARDARD_USERS =  new ArrayList<User>(
		    Arrays.asList( MOCK05_ACTIVE_STANDARD_USER, MOCK06_EXPIRED_STANDARD_USER));
	
	public static ArrayList<User> MOCK08_ALL_USERS = new ArrayList<User>(
			Arrays.asList(MOCK03_EXPIRED_PREMIUM_USER, MOCK02_ACTIVE_PREMIUM_USER, MOCK05_ACTIVE_STANDARD_USER, MOCK06_EXPIRED_STANDARD_USER));
}
