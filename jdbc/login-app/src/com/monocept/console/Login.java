package com.monocept.console;

import java.sql.SQLException;
import java.util.Scanner;

import com.monocept.repository.UserRepo;

public class Login {
	public static void main(String args[]) throws SQLException {
		Scanner sc = new Scanner(System.in);
		int id;
		String password;
		
		System.out.println("Enter user id: ");
		id = sc.nextInt();
		
		System.out.println("Enter password: ");
		sc = new Scanner(System.in);
		password = sc.nextLine();
		
		UserRepo repo = new UserRepo();
		
		boolean success = repo.authenticate(id, password);
		
		if(success==true)
			System.out.println("Login Successful!");
		
		if(success==false)
			System.out.println("Login failed!");
		
	}
}
