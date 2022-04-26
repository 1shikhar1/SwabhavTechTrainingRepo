package com.monocept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String args[]) throws SQLException {
		Connection conn = null;
		
		try {
		    conn = DriverManager.getConnection("jdbc:mysql://localhost/student?" + "user=root&password=root");

		    // Do something with the Connection
		    System.out.println(conn.getClass());
		   
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		conn.close();
	}
}
