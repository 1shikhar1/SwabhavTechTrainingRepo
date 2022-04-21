package com.monocept.model;

import java.io.FileWriter;
import java.io.IOException;

public class WriteContent {
	public void writeContent(String content, String destFileName) throws IOException {

		FileWriter writer = new FileWriter(destFileName);
		writer.append(content);
		writer.close();
	}
}
