package com.monocept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GoodByeService {
	
	@Value("${message.goodby}")
	private String message;
	
	public GoodByeService() {
		System.out.println("Inside Goodby service");
	}
	
	public String getMessage() {
	
		return message;
	}
}
