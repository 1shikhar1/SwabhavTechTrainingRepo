package com.monocept.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.monocept.model.Student;

public class StudentDatabaseService {

	
	public Connection connectDB() {
		Connection conn = null;
		try {
		       conn = DriverManager.getConnection("jdbc:mysql://localhost/student_mvc?" + "user=root&password=root");
		   
		} catch (SQLException ex) {
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		
		return conn;
	}
	
	public List<Student> getStudents() throws SQLException {
		List<Student> students = new ArrayList<>();
		
	    Connection conn = null;
	    PreparedStatement p = null;
	    ResultSet rs = null;
		
	    conn = connectDB();
	    
	    String sql = "select * from students";
	    p = conn.prepareStatement(sql);
        rs = p.executeQuery();
        
        
        while (rs.next()) {

            int rollNo = rs.getInt("rollno");
            String fname = rs.getString("fname");
            String lname = rs.getString("fname");
            double cgpa = rs.getDouble("cgpa");
            
            students.add(new Student(rollNo,fname,lname,cgpa));
        }
		conn.close();
		
		return students;
	}
	
	
	public void addStudent(Student student) throws SQLException {
	    Connection conn = null;
	    conn = connectDB();
	    
	    Statement statement = conn.createStatement();
	    
	    String quary = "INSERT INTO students values("+student.getRollNo()+",\""+student.getFirstName()+"\",\""+student.getLastName()+"\","+student.getCgpa()+");";
	    
	    
	    System.out.println(quary);
	    statement.executeUpdate(quary);
	 
		conn.close();
	}
	
	
	public void removeStudent(String rollNo) throws SQLException {
	    Connection conn = null;
	    conn = connectDB();
	    
	    Statement statement = conn.createStatement();
	    
	    String quary = "DELETE FROM students where rollno="+rollNo;
//	    System.out.println(quary);
	    
	    statement.executeUpdate(quary);
	 
		conn.close();
	}
}
