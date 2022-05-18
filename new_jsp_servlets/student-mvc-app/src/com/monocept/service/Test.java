package com.monocept.service;

import java.sql.SQLException;

import com.monocept.model.Student;

public class Test {
	public static void main(String args[]) throws SQLException {
		StudentDatabaseService service = StudentDatabaseService.getInstance();
		for(Student std: service.getStudents()) {
			System.out.println("Roll: "+std.getRollNo()+"\tFirstName: "+std.getFirstName()+"\tLastName: "+std.getLastName()+"\tCGPA: "+std.getCgpa());
		}
	}
}
