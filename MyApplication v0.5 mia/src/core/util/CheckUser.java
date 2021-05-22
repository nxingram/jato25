package core.util;

import java.util.Date;

import model.User;

public class CheckUser {

	// controllare che 1 utente sia autorizzato
	// ad accedere al servizio

	public CheckUser() {
	}

	public boolean isAuth(User user) {
		Date now = new Date();
		
		if(user.getExpireDate() == null ) return false;
		
		// premium user has extra day bonus
		if (user.isPremium() && user.getExpireDate().after(DateUtil.subDays(now, FileReader.readProperties().getPremiumDayBonus()))) {
			return true;
		} else if (user.getExpireDate().after(now)) { // normal user case
			return true;
		}

		return false;

	}

}
