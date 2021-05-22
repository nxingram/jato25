package persistence;

import java.util.ArrayList;

import model.User;

public class UserDAO implements IUserDAO {

	

	@Override
	public ArrayList<User> retrieveUsers() {

		//qui ci sarà la chiamata reale al database
		return new ArrayList<User>();
	}

}
