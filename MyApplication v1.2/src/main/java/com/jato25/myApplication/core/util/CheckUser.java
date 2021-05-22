package com.jato25.myApplication.core.util;

import java.util.Date;

import com.jato25.myApplication.model.USR;

public class CheckUser {
	

	private int approxMillis = 50;
	
	public boolean verifyAuth(USR user, Date targetDate, int premiumBonusDay) {
		
		return verify(user, targetDate, premiumBonusDay);
		
	}

	public boolean verifyAuth(USR u, int premiumBonusDay) {
		
		return this.verify(u, new Date(), premiumBonusDay);
	}
	
	private boolean verify(USR user, Date targetDate, int premiumBonusDay) {
		
		if (null == user || null == user.getExpireDate() || null == targetDate)
			return false;

		if (!user.isPremium())
			premiumBonusDay = 0;

		return ( user.getExpireDate().getTime() + (1000 * 60 * 60 * 24 * premiumBonusDay) + approxMillis) > targetDate.getTime();

		
	}

}
