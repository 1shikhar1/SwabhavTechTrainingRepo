package com.monocept.model.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

import com.monocept.rohan.sahu.model.searchLogMessage;

class LogAnalyzerUnitTest {

	@Test
	void logTest() throws FileNotFoundException {
		searchLogMessage analyzer = new searchLogMessage();
		String result = analyzer.analyze("src/data.log", "WARNIN");
		
		assertEquals(result,"Not working ");
	}

}
