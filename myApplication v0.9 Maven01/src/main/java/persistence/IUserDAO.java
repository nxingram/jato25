package persistence;

import java.util.ArrayList;

import model.User;

public interface IUserDAO {

	ArrayList<User> retrieveUsers();

}