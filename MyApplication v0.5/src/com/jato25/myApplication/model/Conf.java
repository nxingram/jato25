package com.jato25.myApplication.model;

public class Conf {

	private String env;
	private String dbHost;
	private String dbName;

	
	
	
	public Conf(String env, String dbHost, String dbName) {
		super();
		this.env = env;
		this.dbHost = dbHost;
		this.dbName = dbName;
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
		return "#" + " env:" + this.env
		+ " db host:" + this.dbHost
		+ " dbname:" + this.dbName;
	}
	
	
	
	
	
	
	
	
	

}
