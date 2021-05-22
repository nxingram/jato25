package app.controllers;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import app.models.User;
import app.service.UserService;

public class UserController {

	private String _componentName = this.getClass().getSimpleName();
	private UserService _userService;

	public UserController() {
		_userService = new UserService();
	}

	public User validateUser(HttpServletRequest request) {
		try {
			String uname = request.getParameter("uname");
			String psw = request.getParameter("psw");

			var user = _userService.getUser(uname, psw);

			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}
