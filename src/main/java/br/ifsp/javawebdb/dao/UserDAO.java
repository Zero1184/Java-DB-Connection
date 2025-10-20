package br.ifsp.javawebdb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.ifsp.javawebdb.model.User;

public class UserDAO {

	public boolean login(User user) {
	    String sqlLogin = "SELECT * FROM users WHERE user_email = ? AND user_password = ?";
	    
	    try (Connection conn = Connect.getConnection(); PreparedStatement stmt = conn.prepareStatement(sqlLogin)) {

	        stmt.setString(1, user.getEmail());
	        stmt.setString(2, user.getPassword());

	        try (ResultSet rs = stmt.executeQuery()) {
	            return rs.next(); //Verify if the consult returned a row
	        }

	    } catch (Exception e) {
	        System.err.println("Error: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean register(User user) {
		
		if(this.emailValidation(user)) { //Validate if already have  a user with this data
			return false;
		} else {
			String sqlRegister = "INSERT INTO users(user_name, user_email, user_password) VALUES (?, ?, ?)";
			
			try(Connection conn = Connect.getConnection(); PreparedStatement stmt = conn.prepareStatement(sqlRegister)){
				
				stmt.setString(1, user.getName());
				stmt.setString(2, user.getEmail());
				stmt.setString(3, user.getPassword());
				stmt.executeUpdate(); //Execute the sqlRegister
				return true;
			} catch(Exception e) {
				System.err.println("Error: " + e.getMessage());
				return false;
		}
		}
	}
	
	public boolean emailValidation(User user) {
		String sqlEmailValidation = "SELECT * FROM users WHERE user_email = ?";
		try(Connection conn = Connect.getConnection(); PreparedStatement stmt = conn.prepareStatement(sqlEmailValidation)){
			
			stmt.setString(1,user.getEmail());
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				return true;
			}
			return false;
			
		} catch(Exception e) {
			return true;
		}
	}
}
	