package com.monocept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SqlInjectionSolutionTest {
	
public static void main(String args[]) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Emp No: ");
		String empNo = sc.nextLine();
		
		Connection conn = connectDB();
		
	    String sql = "select * from emp where empno =?";
	    PreparedStatement p=conn.prepareStatement(sql);
	    p.setString(1, empNo);
	    ResultSet rs = p.executeQuery();
		
        
        System.out.println(rs.getStatement());
		
		
	    String result = "";
        while (rs.next()) {
            result += "Emp No: " + rs.getInt("empno")+"\n";
            result += "Name: " + rs.getString("ename")+"\n";
            result += "Job: " + rs.getString("job")+"\n";
            result += "Manager: " + rs.getInt("mgr")+"\n";
            result += "Hire date: " + rs.getString("hiredate")+"\n";
            result += "Salary: " + rs.getInt("sal")+"\n";
            result += "Comm: " + rs.getInt("comm")+"\n";
            result += "Dept No: " + rs.getInt("deptno");
        }
        
        System.out.println(result);
        
        conn.close();
	}
	
	private static Connection connectDB() {
		Connection conn = null;
		try {
		       conn = DriverManager.getConnection("jdbc:mysql://localhost/swabhav_tech?" + "user=root&password=root");
		   
		} catch (SQLException ex) {
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		
		return conn;
	}
}
