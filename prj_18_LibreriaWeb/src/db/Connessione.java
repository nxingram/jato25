package db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * MySql Connector/J 5.1.49 https://dev.mysql.com/downloads/connector/j/5.1.html
 * 
 * maboglia
 * https://github.com/maboglia/CorsoJava/blob/master/appunti/050_Java_Database.md
 * https://github.com/maboglia/CorsoJava/blob/master/appunti/051_Java_Database.md
 * https://github.com/maboglia/CorsoJava/blob/master/appunti/052_Java_Database.md
 * 
 * singleton pattern
 * https://github.com/maboglia/CorsoJava/blob/master/appunti/033_singleton_pattern.md
 *
 */
public class Connessione {
	Connection con; // java.sql.Connection

	private final String URL = "jdbc:mysql://localhost:3306/generation";
	private final String USR = "allen";
	private final String PSW = "allen";

	public Connection connetti() {
		try {
			try {
				// opzionale ->> a volte funziona anche senza
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			this.con = DriverManager.getConnection(URL, USR, PSW);
			System.out.println("Connessione");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return this.con;
	}

	public void disconnetti() {
		if (this.con != null) {
			try {
				this.con.close();
				System.out.println("Disconnessione");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Connessione c = new Connessione();
		c.connetti();
		c.disconnetti();
	}

}
