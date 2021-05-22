package core.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	/**
	 * add days to date in java
	 * 
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date addDays(Date date, int days) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);

		return cal.getTime();
	}
	
	public static Date subDays(Date date, int days) {
		return addDays(date, -days);
	}
}
