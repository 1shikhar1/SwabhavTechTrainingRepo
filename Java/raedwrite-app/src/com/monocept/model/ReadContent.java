package com.monocept.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadContent {
	
	public String readFile(String fileName) throws FileNotFoundException {
		
		File file = new File(fileName);
		Scanner sc = new Scanner(file);
		
		String fileContent = "";
		
		while(sc.hasNextLine()) {
			fileContent = fileContent.concat(sc.nextLine()+"\n");
		}
		
		return fileContent;
		
	}
}
