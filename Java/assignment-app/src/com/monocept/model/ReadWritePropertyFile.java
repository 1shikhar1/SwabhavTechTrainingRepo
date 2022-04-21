package com.monocept.model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertyFile {
	
	public void writeProperty(String name, String gender, String location) {
		Properties p=new Properties();  
		p.setProperty("name",name);  
		p.setProperty("gender",gender);
		p.setProperty("location",location);
		  
		try {
			p.store(new FileWriter("data\\info.properties"),"Customer details");
			System.out.println("Properties written successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String readPropertyFile() throws IOException {
		FileReader reader=new FileReader("data\\info.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	    
	    String data ="Name: " + p.getProperty("name") + "\nGender: " + p.getProperty("gender") + "\nLocation: " + p.getProperty("location");
	    
	    return data;  
	}
}
