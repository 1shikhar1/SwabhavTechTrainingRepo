package com.swabhav;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HowdyService {
	@Value("${message.howdy}")
	private String message;
	
	public HowdyService() {
		System.out.println("Inside Howdy service");
	}
	
	public String getMessage() {
		return message;
	}
}
