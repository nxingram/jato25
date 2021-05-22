package controller;

import core.util.FileReader;
import model.Conf;

public class App {

	private String componentName = this.getClass().getSimpleName();
	private Conf conf;

	public App() {
		super();
		init();
	}

	private void init() {

		FileReader reader = new FileReader();
		conf = reader.readProperties();
		
		System.out.println("#" 	+ componentName 
								+ " - Started with env:" + conf.getEnv() 
								+ " db host:" + conf.getDbHost()
								+ " dbname:" + conf.getDbName());

	}

	@Override
	public String toString() {
		return componentName + " env:" + conf.getEnv();

	}

}
