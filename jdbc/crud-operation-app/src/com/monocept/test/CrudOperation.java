package com.monocept.test;

import java.sql.*;

public class CrudOperation {

	public static void main(String args[]) throws SQLException {
//		insertData(1,"Rohan");
//		insertData(2,"Rahul");
//		insertData(3,"Abhishek");
//		insertData(4,"Vineet");
		
		updateData("Shikhar","where name= \"rahul\"");
		viewData();
		deleteData("where name=\"rohan\"");
		viewData();
	}
	
	public static Connection connectDB() {
		Connection conn = null;
		try {
		       conn = DriverManager.getConnection("jdbc:mysql://localhost/student?" + "user=root&password=root");
		   
		} catch (SQLException ex) {
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		
		return conn;
	}
	
	public static void viewData() throws SQLException {
	    Connection conn = null;
	    PreparedStatement p = null;
	    ResultSet rs = null;
		
	    conn = connectDB();
	    
	    String sql = "select * from students";
	    p = conn.prepareStatement(sql);
        rs = p.executeQuery();
        
        System.out.println("id\t\tname");
        
        while (rs.next()) {

            int id = rs.getInt("id");
            String name = rs.getString("name");
            System.out.println(id + "\t\t" + name);
        }
		conn.close();
	}
	
	public static void insertData(int id,String name) throws SQLException {
	    Connection conn = null;
	    conn = connectDB();
	    
	    Statement statement = conn.createStatement();
	    
	    String quary = "INSERT INTO students values("+id+",\""+name+"\");";
	    
	    statement.executeUpdate(quary);
	 
		conn.close();
	}
	
	public static void updateData(String data, String condition) throws SQLException {
	    Connection conn = null;
	    conn = connectDB();
	    
	    Statement statement = conn.createStatement();
	    
	    String quary = "UPDATE students SET name=\""+data+"\" "+condition;
//	    System.out.println(quary);
	    
	    statement.executeUpdate(quary);
	 
		conn.close();
	}
	
	public static void deleteData(String condition) throws SQLException {
	    Connection conn = null;
	    conn = connectDB();
	    
	    Statement statement = conn.createStatement();
	    
	    String quary = "DELETE FROM students "+condition;
//	    System.out.println(quary);
	    
	    statement.executeUpdate(quary);
	 
		conn.close();
	}
}
