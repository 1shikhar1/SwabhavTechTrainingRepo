package com.monocept.repository;

import java.sql.*;

public class UserRepo {
	private Connection conn = null;
	
	public boolean authenticate(int id, String password) throws SQLException {
		
		conn = connectDB();
		String savedPassword = getUsersPassword(id);
		conn.close();

		if(password.equals(savedPassword)) {
			return true;
		}
		return false;
	}
	
	private Connection connectDB() {
		Connection conn = null;
		try {
		       conn = DriverManager.getConnection("jdbc:mysql://localhost/users_repo?" + "user=root&password=root");
		   
		} catch (SQLException ex) {
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		
		return conn;
	}
	
	private String getUsersPassword(int id) throws SQLException {

	    String sql = "select password from users where id = "+id;
	    Statement p = conn.createStatement();
	    ResultSet rs = p.executeQuery(sql);
	    
//	    System.out.println(rs.getStatement());
        
	    String result = "";
        String password=null;
        while (rs.next()) {
            password = rs.getString("password");
            
            result += "Password: " + password+"\n";
        }
        
//        System.out.println(result);
        
		return password;
	}

}
