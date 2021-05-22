package com.jato25.myApplication.core.constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import com.jato25.myApplication.model.USR;

public class Const {
	
	//ERROR CODE
	public static String ERR01_USER_NOT_AUTH = "L'utente non è autorizzato"; 
	public static String ERR02_USER_AUTH = "L'utente è autorizzato";
	
	public static int meseMillis = 1000*60*60*24*30;
	
	
	public static Date today = new Date();
	public static Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));
	public static Date yesterday = new Date(today.getTime() - (1000 * 60 * 60 * 24));
	public static Date sixDaysAgo = new Date(today.getTime() - (1000 * 60 * 60 * 24)*6);
	
	//MOCK OBJECT
	public static USR MOCK01_USER_NULL = new USR("USER_NULL", null, false);
	public static USR MOCK02_ACTIVE_PREMIUM_USER = new USR("PREMIUM_USER_Active", tomorrow, true);
	public static USR MOCK03_EXPIRED_PREMIUM_USER = new USR("PREMIUM_USER_Expired", sixDaysAgo, true);
	
	//MOCK OBJECT
	public static USR MOCK04_USER_NULL = new USR("USER_NULL", null, false);
	public static USR MOCK05_ACTIVE_STANDARD_USER = new USR("PREMIUM_USER_Active", tomorrow, false);
	public static USR MOCK06_EXPIRED_STANDARD_USER = new USR("PREMIUM_USER_Expired", sixDaysAgo, false);
	
	
	
	public static ArrayList<USR> MOCK03_PREMIUM_USERS =  new ArrayList<USR>(
		    Arrays.asList(MOCK01_USER_NULL, MOCK02_ACTIVE_PREMIUM_USER, MOCK03_EXPIRED_PREMIUM_USER));
	
	
	public static ArrayList<USR> MOCK07_STARDARD_USERS =  new ArrayList<USR>(
		    Arrays.asList( MOCK05_ACTIVE_STANDARD_USER, MOCK06_EXPIRED_STANDARD_USER));
	
	public static ArrayList<USR> MOCK08_ALL_USERS = new ArrayList<USR>(
			Arrays.asList(MOCK03_EXPIRED_PREMIUM_USER, MOCK02_ACTIVE_PREMIUM_USER, MOCK05_ACTIVE_STANDARD_USER, MOCK06_EXPIRED_STANDARD_USER));
}
