package com.monocept.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LogAnalyzer {
	
	public String analyze(String fileName, String logType) throws FileNotFoundException {
		String result = "";
		
		File file = new File(fileName);
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			String str = (sc.nextLine()+"\n");
			if(str.contains("- "+logType+" -")) {
				result = result + str + "\n";
			}	
		}
		if(result.length()==0) {
			return "";
		}		
		return result;
	}
}