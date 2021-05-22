package com.jato25.myApplication.persistence.mock;

import static com.jato25.myApplication.core.constant.Const.*;

import java.util.ArrayList;

import com.jato25.myApplication.model.User;
import com.jato25.myApplication.persistence.IUserDAO;

public class UserDAOMock  implements IUserDAO{

	@Override
	public ArrayList<User> retrieveUsers() {
		return MOCK08_ALL_USERS;
	}

}
