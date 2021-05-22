package persistence.mock;

import static core.constant.Const.*;

import java.util.ArrayList;

import model.User;
import persistence.IUserDAO;

public class UserDAOMock  implements IUserDAO{

	@Override
	public ArrayList<User> retrieveUsers() {
		return MOCK08_ALL_USERS;
	}

}
