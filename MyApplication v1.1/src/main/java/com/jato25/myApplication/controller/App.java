package com.jato25.myApplication.controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.jato25.myApplication.core.util.CheckUser;
import com.jato25.myApplication.core.util.FileReader;
import com.jato25.myApplication.model.Conf;
import com.jato25.myApplication.model.User;
import com.jato25.myApplication.persistence.IUserDAO;
import com.jato25.myApplication.persistence.UserDAO;
import com.jato25.myApplication.persistence.mock.UserDAOMock;

public class App {

	private String componentName = this.getClass().getSimpleName()+" ";
	private Conf conf;
	private IUserDAO dao;
	private String configFilePath = "res/config.properties";
	private List<User> authUsers = new ArrayList<User>();
	private List<User> notAuthUsers = new ArrayList<User>();
	public int exitCode;
	

	public App() {
		super();
		init();
	}

	private void init() {
		System.out.println("#" + componentName + " - Initializing");
		readConfigurationFile();		
		checkAuthUsers();
		System.out.println("#" + componentName + " - Founded " + (authUsers.size()+notAuthUsers.size()) + " users total, s"+
											   + notAuthUsers.size() + " have an expired subscription");
		this.exitCode=1;

	}

	private void readConfigurationFile() {

		FileReader fileReader = new FileReader();
		try {

			this.conf = fileReader.readProperties(configFilePath);
			System.out.println("#" + componentName + " - Configured with "+ conf.toString());

		} catch (FileNotFoundException e) {
			this.exitCode = -1;
			e.printStackTrace();

		}

	}

	private void checkAuthUsers() {

		if (this.conf.getEnv().equalsIgnoreCase("SVIL"))
			dao = new UserDAOMock();

		else
			dao = new UserDAO();

		List<User> allUsers = dao.retrieveUsers();

		CheckUser checkUser = new CheckUser();

				
		for (User u : allUsers) {

				if (checkUser.verifyAuth(u,conf.getPremiumBonusDay()))
				
					authUsers.add(u);
				
				else
					notAuthUsers.add(u);
				
			
		}
	}

	@Override
	public String toString() {
		return componentName + " env:" + conf.getEnv();

	}

}
