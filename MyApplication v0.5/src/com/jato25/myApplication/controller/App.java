package com.jato25.myApplication.controller;

import java.io.FileNotFoundException;

import com.jato25.myApplication.core.util.FileReader;
import com.jato25.myApplication.model.Conf;
import com.jato25.myApplication.persistence.UserDAO;

public class App {

	private String componentName = this.getClass().getSimpleName();
	private Conf conf;
	private String configFilePath = "res/config.properties";

	public App() {
		super();
		init();
	}
	

	private void init() {

		readConfigurationFile();
		System.out.println("#" + componentName + conf.toString());
		checkAuthUsers();

	}
	
	private void readConfigurationFile() {

		FileReader fileReader = new FileReader();
		try {
			
			this.conf = fileReader.readProperties(configFilePath);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	private void checkAuthUsers()
	{
		UserDAO dao = new UserDAO();
		dao.retrieveUsers();
	}
	
	
	

	@Override
	public String toString() {
		return componentName + " env:" + conf.getEnv();

	}

}
