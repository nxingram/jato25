package model;

public class Conf {

	private String env;
	private String dbHost;
	private String dbName;
	private int premiumBonusDay;

	public Conf(String env, String dbHost, String dbName, int premiumBonusDay) {
		super();
		this.env = env;
		this.dbHost = dbHost;
		this.dbName = dbName;
		this.premiumBonusDay = premiumBonusDay;
	}

	public int getPremiumBonusDay() {
		return premiumBonusDay;
	}

	public void setPremiumBonusDay(int premiumBonusDay) {
		this.premiumBonusDay = premiumBonusDay;
	}

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

	@Override
	public String toString() {
		return "env:" + this.env + " db host:" + this.dbHost + " dbname:" + this.dbName + " premiumBonusDay:"+this.premiumBonusDay;
	}

}
