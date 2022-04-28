package com.monocept.model.test;

import java.io.IOException;
import com.monocept.model.*;

public class Test {
	public static void main(String args[]) throws IOException {
		DataAnalyzer analyze = new DataAnalyzer();
		
		System.out.println(analyze.getCeo());
		System.out.println(analyze.getJobWiseEmployeeCount());
	}
}
