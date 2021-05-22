package com.jato25.myApplication.core.util;

import static com.jato25.myApplication.core.constant.Const.ERR01_USER_NOT_AUTH;
import static com.jato25.myApplication.core.constant.Const.ERR02_USER_AUTH;
import static com.jato25.myApplication.core.constant.Const.MOCK01_USER_NULL;
import static com.jato25.myApplication.core.constant.Const.MOCK02_ACTIVE_PREMIUM_USER;
import static com.jato25.myApplication.core.constant.Const.MOCK03_EXPIRED_PREMIUM_USER;
import static com.jato25.myApplication.core.constant.Const.MOCK05_ACTIVE_STANDARD_USER;
import static com.jato25.myApplication.core.constant.Const.MOCK06_EXPIRED_STANDARD_USER;
import static com.jato25.myApplication.core.constant.Const.yesterday;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CheckUserTest {

	private CheckUser checkUser;

	@Before
	public void setUpBeforeMethod() {
		this.checkUser = new CheckUser();

	}

	@Test
	public void testVerifyAuthStandardUser() {

		assertTrue(ERR01_USER_NOT_AUTH, checkUser.verifyAuth(MOCK05_ACTIVE_STANDARD_USER, 0));
		assertTrue(ERR01_USER_NOT_AUTH, checkUser.verifyAuth(MOCK05_ACTIVE_STANDARD_USER, -999));
		assertTrue(ERR01_USER_NOT_AUTH, checkUser.verifyAuth(MOCK05_ACTIVE_STANDARD_USER, 999));

		assertFalse(ERR02_USER_AUTH, checkUser.verifyAuth(MOCK06_EXPIRED_STANDARD_USER, 0));
		assertFalse(ERR02_USER_AUTH, checkUser.verifyAuth(MOCK06_EXPIRED_STANDARD_USER, -999));
		assertFalse(ERR02_USER_AUTH, checkUser.verifyAuth(MOCK06_EXPIRED_STANDARD_USER, 999));

	}

	@Test
	public void testVerifyAuthPremiumUser() {

		assertTrue(ERR01_USER_NOT_AUTH, checkUser.verifyAuth(MOCK02_ACTIVE_PREMIUM_USER, 0));
		assertTrue(ERR01_USER_NOT_AUTH, checkUser.verifyAuth(MOCK02_ACTIVE_PREMIUM_USER, yesterday, -1));
		assertTrue(ERR01_USER_NOT_AUTH, checkUser.verifyAuth(MOCK02_ACTIVE_PREMIUM_USER, 999));

		assertFalse(ERR02_USER_AUTH, checkUser.verifyAuth(MOCK03_EXPIRED_PREMIUM_USER, 0));
		assertFalse(ERR02_USER_AUTH, checkUser.verifyAuth(MOCK03_EXPIRED_PREMIUM_USER, -999));
		assertFalse(ERR02_USER_AUTH, checkUser.verifyAuth(MOCK03_EXPIRED_PREMIUM_USER, 0));

	}

	@Test
	public void testVerifyNullInput() {

		assertFalse(ERR02_USER_AUTH + " anche se è null", checkUser.verifyAuth(null, 0));
		assertFalse(ERR02_USER_AUTH + " anche se ha la data null", checkUser.verifyAuth(MOCK01_USER_NULL, 0));

	}

}
