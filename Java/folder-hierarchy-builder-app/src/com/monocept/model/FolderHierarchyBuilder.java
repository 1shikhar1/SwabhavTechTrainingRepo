package com.monocept.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FolderHierarchyBuilder {
	Folder root = null;
	
	public FolderHierarchyBuilder(String fileLocation) throws IOException {
		
		
		Path filepath = Paths.get(fileLocation);
		
		ArrayList<Item> empList = (ArrayList<Item>) Files.lines(filepath).map(data -> data.split("\\s+")).map(data -> {
			return (new Item(data[0], data[1], data[2], data[3]));
		}).collect(Collectors.toList());
		
		
		for(Item itm:empList) {
			if(itm.getParentId()=="0" && itm.getType()=="F")
			{
				root = new Folder(itm.getName());
			}
		}
		
		
//		for(int i=1;i<10;i++) {
//			String pId = Integer.toString(i);
//
//			}
		
		
		Folder root = new Folder("Movies");
		
		Folder hindi = new Folder("Hindi");
		root.addChild(hindi);
		
		Folder action = new Folder("Action");
		hindi.addChild(action);
		
		
		Folder english = new Folder("English");

		
		Folder comady = new Folder("Comady");
		
		english.addChild(comady);
		
		root.addChild(english);
		
	}
	
	public Folder getRootFolder() {
		return root;
	}
}
