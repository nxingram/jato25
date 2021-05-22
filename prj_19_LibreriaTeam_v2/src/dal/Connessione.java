package dal;


import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connessione {
private Connection con =null ;

private final String URL = "jdbc:mysql://localhost:3306/generation";
private final String USER = "allen";
private final String PASS = "allen";

public Connection connetti() {
	try {
		if(this.con==null) {
			this.con= DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Siamo connessi!");	
		}

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

	}

	return this.con;
}
 public static void main(String[] args) {
	Connessione c = new Connessione();
	c.connetti();
	c.disconnetti();
}
 public void disconnetti() {
	 if(this.con!=null) {
		 try {
			this.con.close();
			System.out.println("Connessione chiusa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
 }
}
