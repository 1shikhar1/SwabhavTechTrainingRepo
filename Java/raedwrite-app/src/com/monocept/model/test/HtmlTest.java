package com.monocept.model.test;

import java.io.IOException;

import com.monocept.model.WriteContent;

public class HtmlTest {
	public static void main(String args[]) throws IOException{
		String content = "Name: Sachin, Address: New Delhi, India";
		
		WriteContent write = new WriteContent();
		
		write.writeContent(content,"D:\\SwabhavTechTrainingRepo\\Java\\raedwrite-app\\src\\com\\monocept\\model\\test\\newHtml.html"); 
	}
}
