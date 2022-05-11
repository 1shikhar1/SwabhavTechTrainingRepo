package com.monocept.model.test;


import java.io.IOException;

import com.monocept.model.*;

public class Test {
	public static void main(String args[]) throws IOException  {
//		Path filepath = Paths.get("folder_hierarchy.txt");
		
		FolderHierarchyBuilder h = new FolderHierarchyBuilder("folder_hierarchy.txt");
		
		Folder f = h.getRootFolder();
		f.showHierarchy(1);
	}
}
