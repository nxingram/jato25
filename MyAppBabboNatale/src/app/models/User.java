package app.models;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import app.utils.AreaType;
import app.utils.UserType;

public class User {

	private String firstName; 
	private String lastName;
	private String uname;
	private String psw;
	private UserType userType; // Admin or Babbo
	private ArrayList<AreaType> areaType;
	private String Transport;
//	private boolean isAdmin;
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTransport() {
		return Transport;
	}
	public void setTransport(String transport) {
		Transport = transport;
	}
	public ArrayList<AreaType> getAreaType() {
		return areaType;
	}
	public void setAreaType(ArrayList<AreaType> areaType) {
		this.areaType = areaType;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", uname=" + uname + ", psw=" + psw
				+ ", userType=" + userType + ", areaType=" + areaType + ", Transport=" + Transport + "]";
	}

	
	
	
	
	

	
	
	
	

	
	
	
}
