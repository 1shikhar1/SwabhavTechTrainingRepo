package com.monocept.repository;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.HashMap;

import com.monocept.model.Student;
import com.monocept.service.StudentService;

public class Test {
	public static void main(String args[]) throws SQLException, NoSuchAlgorithmException, UnsupportedEncodingException {
		
		
//		StudentRepository repo = StudentRepository.getInstance();
		StudentService service = StudentService.getInstance(); 

//		service.removeStudent("106");
		
	}
}
