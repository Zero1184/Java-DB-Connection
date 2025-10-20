package br.ifsp.javawebdb.dao;
import java.sql.DriverManager;
import java.sql.Connection;


public class Connect {

	public static Connection getConnection() {
		String database = "test";
		String pass = "pedro";
		String user = "root";
		String url = "jdbc:mysql://localhost:3306/" + database;
		
		try {
			// Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Get Connection
			return DriverManager.getConnection(url, user, pass);
	
		} catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
			
		}
		return null;
	}
	
	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch(Exception e){
			System.err.println("Error: " + e.getMessage());
		}
	}
}
