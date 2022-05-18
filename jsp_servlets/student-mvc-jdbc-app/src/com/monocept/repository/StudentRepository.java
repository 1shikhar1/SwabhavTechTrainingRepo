package com.monocept.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.monocept.model.Student;

public class StudentRepository {
	private static StudentRepository instance = null;

	private StudentRepository() {
		
	}
	
	public static StudentRepository getInstance() {
		if(instance==null) {
			instance = new StudentRepository();
		}
		return instance;
	}
	
	public Connection connectDB() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/student_mvc?" + "user=root&password=root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		return conn;
	}
	
	public List<Student> getStudents() throws SQLException {
		List<Student> students = new ArrayList<>();
		
	    Connection conn = null;
	    conn = connectDB();
	    
	    String sql = "select * from students";
	    PreparedStatement p = conn.prepareStatement(sql);
	    ResultSet rs = p.executeQuery();
         
        while (rs.next()) {

            int rollNum = rs.getInt("rollno");
            String fname = rs.getString("fname");
            String lname = rs.getString("lname");
            double cgpa = rs.getDouble("cgpa");
            
            String sql2 = "select t.name as course_name from (select * from courses INNER JOIN map ON courses.id=map.cid) t where t.sid="+rollNum;

    	    PreparedStatement p2 = conn.prepareStatement(sql2);
    	    ResultSet rs2 = p2.executeQuery();
    	    
    	    List<String> courses = new ArrayList<String>();
    	    
    	    while (rs2.next())
    	    	courses.add(rs2.getString("course_name"));
            
    	    students.add(new Student(rollNum,fname,lname,cgpa,courses));
            
            
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
	    
	    String query = "DELETE FROM students where rollno="+rollNo;
//	    System.out.println(query);
	    
	    statement.executeUpdate(query);
	 
		conn.close();
	}
	
	public Student getStudent(String rollNo) throws SQLException {
	    Connection conn = null;
	    conn = connectDB();
	    Student student = null;
	    
	    String sql = "SELECT * FROM students where rollno="+rollNo;

	    PreparedStatement p = conn.prepareStatement(sql);
	    ResultSet rs = p.executeQuery();
         
        while (rs.next()) {

            int rollNum = rs.getInt("rollno");
            String fname = rs.getString("fname");
            String lname = rs.getString("lname");
            double cgpa = rs.getDouble("cgpa");
            
            String sql2 = "select t.name as course_name from (select * from courses INNER JOIN map ON courses.id=map.cid) t where t.sid="+rollNo;

    	    PreparedStatement p2 = conn.prepareStatement(sql2);
    	    ResultSet rs2 = p2.executeQuery();
    	    
    	    List<String> courses = new ArrayList<String>();
    	    
    	    while (rs2.next())
    	    	courses.add(rs2.getString("course_name"));
            
            student = new Student(rollNum,fname,lname,cgpa,courses);
        }
		conn.close();
		
		return student;
	}
	
	public HashMap<String,Integer> getCoursesDetails() throws SQLException {
	    Connection conn = null;
	    conn = connectDB();
	    Student student = null;
	    
	    String sql = "select t.name as course_name, count(t.name) as students from (select * from courses INNER JOIN map ON courses.id=map.cid) t group by t.name";

	    PreparedStatement p = conn.prepareStatement(sql);
	    ResultSet rs = p.executeQuery();
         
	    HashMap<String,Integer> courseDetails = new HashMap<String,Integer>(); 
        while (rs.next()) {
        	
        	courseDetails.put(rs.getString("course_name"), rs.getInt("students"));
        }
		conn.close();
		
		return courseDetails;
	}
}
