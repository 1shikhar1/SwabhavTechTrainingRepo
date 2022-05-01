package com.monocept.model;

import java.sql.*;
import java.util.*;

public class MovieStore {
	
	public Connection connectDB() {
		Connection conn = null;
		try {
		       conn = DriverManager.getConnection("jdbc:mysql://localhost/moviedb?" + "user=root&password=root");
		   
		} catch (SQLException ex) {
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		
		return conn;
	}
	
	@SuppressWarnings("null")
	public String getMovies() throws SQLException {
	    Connection conn = null;
	    PreparedStatement p = null;
	    ResultSet rs = null;
	    conn = connectDB();
	    
	    String sql = "select * from movielist";
	    p = conn.prepareStatement(sql);
        rs = p.executeQuery();

        String res="";
        
        while (rs.next()) {
        	 res += rs.getString("name")+"   ";
        	 res += rs.getString("genre")+"   ";
        	 res += rs.getString("year")+" , ";
        }
        
		conn.close();
		
		return res;
	}
	
	public void addMovie(String name,String genre, String year) throws SQLException {
	    Connection conn = null;
	    conn = connectDB();
	    Statement statement = conn.createStatement();
	    
	    String quary = "INSERT INTO movielist values(\""+name+"\",\""+genre+"\",\""+year+"\");";
	    statement.executeUpdate(quary);
	 
		conn.close();
	}
	
	public void clearAllMovies() throws SQLException {
	    Connection conn = null;
	    conn = connectDB();
	    Statement statement = conn.createStatement();
	    
	    String quary = "DELETE FROM movielist;";
	    statement.executeUpdate(quary);
	 
		conn.close();
	}
}
