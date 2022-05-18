package com.monocept.service;

import java.util.HashMap;

import com.monocept.model.User;
import com.monocept.model.dto.UserDto;

public class LoginService {
	private static LoginService instance=null;
	private HashMap<Integer,User> userData;
	
	private LoginService() {
		userData = new HashMap<>();
		userData.put(101, new User("Shikhar","1shikhar1@gmail.com",101,"shikhar123",true));
		userData.put(102, new User("Rohan","rohan22@gmail.com",102,"rohan123",true));
		userData.put(103, new User("Vineet","vineet145@gmail.com",103,"vineet123",true));
		
	}
	
	public static LoginService getInstance() {
		if(instance==null) {
			instance = new LoginService();
		}
		return instance;
	}
	
	public UserDto getUser(int loginId, String password) {
		if(userData.containsKey(loginId) && userData.get(loginId).getPassword().equals(password)) {
			User user = userData.get(loginId);
			UserDto userDto = new UserDto(user.getName(),user.getEmail());
			return userDto;
		}
		return null;
	}
}
