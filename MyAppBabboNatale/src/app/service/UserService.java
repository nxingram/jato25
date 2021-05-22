package app.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.ServletContext;

import app.models.User;
import app.utils.AreaType;
import app.utils.PropertiesUtil;
import app.utils.UserType;


public class UserService {

	private String _componentName = this.getClass().getSimpleName();
	private ArrayList<User> _userList;
		
	public UserService() {
		_userList = new ArrayList<User>();  
		_readProperties();
	}

	private void _readProperties() {

		try {			
			Properties properties = PropertiesUtil.getProperties("config.properties");

			User admin = loadAdmin(properties);			
			_userList.add(admin);

			User user1 = loadUser(properties, 1);	
			user1.setAreaType(new ArrayList<AreaType>(Arrays.asList(AreaType.centro)));
			_userList.add(user1);			
			
		}catch(Exception e) {
			e.printStackTrace();
		}


	}

	private User loadUser(Properties properties, int id) {
		User user = new User();
		String base =  "conf.user" + id + ".";
		user.setUname(properties.getProperty(base + "uname"));
		user.setPsw(properties.getProperty(base + "psw"));
		user.setFirstName(properties.getProperty(base + "firstname"));
		user.setLastName(properties.getProperty(base + "lastname"));
		user.setTransport(properties.getProperty(base + "transport"));
		user.setUserType(UserType.babbo);
		return user;
	}

	private User loadAdmin(Properties properties) {
		User admin = new User();			
		String base =  "conf.admin.";
		admin.setUname(properties.getProperty(base + "uname"));
		admin.setPsw(properties.getProperty(base + "psw"));
		admin.setFirstName(properties.getProperty(base + "firstname"));
		admin.setLastName(properties.getProperty(base + "lastname"));
		admin.setTransport(properties.getProperty(base + "transport"));
		admin.setUserType(UserType.admin);
		return admin;
	}
	
	public ArrayList<User> getUserList(){
		return _userList;
	}
	
	public User getUser(String uname, String psw) {
		ArrayList<User> res = (ArrayList<User>) _userList.stream()
				.filter( u -> u.getUname().equals(uname) && u.getPsw().equals(psw))
				.collect(Collectors.toList());
		
		return res != null && !res.isEmpty()? res.get(0) : null;
	}
	


}
