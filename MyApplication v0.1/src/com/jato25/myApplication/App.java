package com.jato25.myApplication;

public class App {

	//proprietà
	private String componentName = "App";
	private String env;

	// costruttore
	public App() {
		super();
		this.init();
	}
	
	//metodo
	private void init() {
		Conf conf = new Conf();
		this.env = conf.getEnv();
		
		System.out.println("#" + componentName + " - Started with env: " + env +
		", dbHost: "+ conf.getDbHost() + ", dbName:" + conf.getDbName());
	}

	// metodo overridden
	@Override
	public String toString() {
		return componentName;
//				+ " env: " + env;
	}
	
	
	
}
