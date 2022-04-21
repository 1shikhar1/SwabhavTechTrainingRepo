package com.monocept.model.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.monocept.model.*;

public class ReadWriteTest {
	public static void main(String args[]) throws IOException {
		ReadContent read =new ReadContent();
		WriteContent write =new WriteContent();
		
		String content;
		content = read.readFile("D:\\SwabhavTechTrainingRepo\\Java\\raedwrite-app\\src\\com\\monocept\\model\\test\\Untitled.txt");
		
		System.out.println(content);
		
		write.writeContent(content,"D:\\SwabhavTechTrainingRepo\\Java\\raedwrite-app\\src\\com\\monocept\\model\\test\\new.txt");
		
	}
}
