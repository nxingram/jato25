package com.jato25.myApplication.persistence;

import java.util.ArrayList;

import com.jato25.myApplication.model.User;

public interface IUserDAO {

	ArrayList<User> retrieveUsers();

}