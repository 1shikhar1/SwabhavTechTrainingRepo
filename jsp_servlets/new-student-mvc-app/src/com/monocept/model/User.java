package com.monocept.model;

public class User {
	private String name;
	private String email;
	private int loginId;
	private String password;
	private boolean isActive;
	
	public User(String name, String email, int loginId, String password, boolean isActive) {
		this.name = name;
		this.email = email;
		this.loginId = loginId;
		this.password = password;
		this.isActive = isActive;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
}
