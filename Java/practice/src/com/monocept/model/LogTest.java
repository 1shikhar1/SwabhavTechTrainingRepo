package com.monocept.model;

import java.io.FileNotFoundException;

import com.monocept.rohan.sahu.model.searchLogMessage;

public class LogTest {
	public static void main(String args[]) throws FileNotFoundException {
		searchLogMessage analyzer = new searchLogMessage();
		String result = analyzer.analyze("src/data.log", "WARNIN");
		System.out.println(result);
	}
}