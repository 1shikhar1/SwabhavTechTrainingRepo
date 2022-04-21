package com.monocept.model.test;

import java.io.*;

import com.monocept.model.*;

public class EmployeeTest {
	public static void main(String args[])
	{
		Manager mangr = new Manager(10,"Rohan",400000);
		Developer dvplr = new Developer(20,"Shikhar",200000);
		Accountant actnt = new Accountant(30,"Asha",300000);
		
		try {
			writeContent(mangr.getSalarySlip(),"data\\managerSalarySlip.html");
			System.out.println("Salary slip generated successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeContent(String content, String destFileName) throws IOException {

		FileWriter writer = new FileWriter(destFileName);
		writer.append(content);
		writer.close();
	}
	
}
