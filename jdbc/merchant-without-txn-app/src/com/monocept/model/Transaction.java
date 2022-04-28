package com.monocept.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {
	
	private Connection conn = null;
	
	public void doTransaction(String mId, String cId, int amount) throws SQLException {
		
		conn = connectDB();
		conn.setAutoCommit(false);
		
		int customerCurrentBalance = getCustomerBalance(cId);
		int merchantCurrentBalance = getMerchantBalance(mId);

		try {
			int customerRowAffected = updateCustomerBalance(cId,customerCurrentBalance-amount);
			int merchantRowAffected = updateMerchantBalance(mId,merchantCurrentBalance+amount);
			
			if(customerRowAffected!=merchantRowAffected)
				throw new Exception();
			
			commit();
			
		} catch(Exception ex) {
			rollback();
		}
		
		conn.close();
	}
	
	private Connection connectDB() {
		Connection conn = null;
		try {
		       conn = DriverManager.getConnection("jdbc:mysql://localhost/retail?" + "user=root&password=root");
		   
		} catch (SQLException ex) {
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		
		return conn;
	}
	
	private int updateMerchantBalance(String mId, int amount) throws SQLException {
	    Statement statement = conn.createStatement();
	    String quary = "UPDATE merchant SET balance="+amount+" where "+"id = \""+mId+"\"";
	    return statement.executeUpdate(quary);
	}
	
	private int updateCustomerBalance(String cId, int amount) throws SQLException {
	    Statement statement = conn.createStatement();
	    String quary = "UPDATE customer SET balance="+amount+" where "+"id = \""+cId+"\"";
	    return statement.executeUpdate(quary);
	}
	
	private int getMerchantBalance(String mId) throws SQLException {
	    PreparedStatement p = null;
	    ResultSet rs = null;
	    String query = "select balance from merchant where id = \""+mId+"\"";
	    p = conn.prepareStatement(query);
        rs = p.executeQuery();
        
        int balance=0;
        while (rs.next()) {
            balance = rs.getInt("balance");
        }
		
		return balance;
	}
	
	private int getCustomerBalance(String cId) throws SQLException {
	    PreparedStatement p = null;
	    ResultSet rs = null;
	    String query = "select balance from customer where id = \""+cId+"\"";
	    p = conn.prepareStatement(query);
        rs = p.executeQuery();
        
        int balance=0;
        while (rs.next()) {
            balance = rs.getInt("balance");
        }

		return balance;
	}
	
	public String getCustomerDetails(String id) throws SQLException {
		conn = connectDB();
	    PreparedStatement p = null;
	    ResultSet rs = null;
	    String sql = "select * from customer where id = \""+id+"\"";
	    p = conn.prepareStatement(sql);
        rs = p.executeQuery();
		
	    String result = "";
        while (rs.next()) {
            result += rs.getString("id")+"\t";
            result += rs.getString("name")+"\t";
            result += rs.getInt("balance");
        }
	    
	    conn.close();
	    return result;
	}
	
	public String getMerchantDetails(String id) throws SQLException {
		conn = connectDB();
	    PreparedStatement p = null;
	    ResultSet rs = null;
	    String sql = "select * from merchant where id = \""+id+"\"";
	    p = conn.prepareStatement(sql);
        rs = p.executeQuery();
		
		
	    String result = "";
        while (rs.next()) {
            result += rs.getString("id")+"\t";
            result += rs.getString("name")+"\t";
            result += rs.getInt("balance");
        }
	    
	    conn.close();
	    return result;
	}
	
	private void commit() throws SQLException {
	    Statement statement = conn.createStatement();
	    String quary = "commit";
	    statement.executeUpdate(quary);
	}
	
	private void rollback() throws SQLException {
	    Statement statement = conn.createStatement();
	    String quary = "rollback";
	    statement.executeUpdate(quary);
	}
}
