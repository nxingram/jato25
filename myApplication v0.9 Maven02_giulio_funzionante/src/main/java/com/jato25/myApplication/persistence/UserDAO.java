package com.jato25.myApplication.persistence;

import java.util.ArrayList;

import com.jato25.myApplication.model.User;

public class UserDAO implements IUserDAO {

	

	@Override
	public ArrayList<User> retrieveUsers() {

		//qui ci sarà la chiamata reale al database
		return new ArrayList<User>();
	}

}
