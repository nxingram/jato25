package model;

public class Conf {

	private String env = "TEST";
	private String dbHost = "127.0.0.1";
	private String dbName = "TESTDB";
	
	private int premiumDayBonus = 0;

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	public String getDbHost() {
		return dbHost;
	}

	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public int getPremiumDayBonus() {
		return premiumDayBonus;
	}

	public void setPremiumDayBonus(int premiumDayBonus) {
		this.premiumDayBonus = premiumDayBonus;
	}

	
}
