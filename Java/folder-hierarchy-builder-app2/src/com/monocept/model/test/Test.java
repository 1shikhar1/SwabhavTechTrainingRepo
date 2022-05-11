package com.monocept.model.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.monocept.model.FolderHeirarchyBuilder;

public class Test {
	public static void main(String[] args) throws NumberFormatException, IOException {
		FolderHeirarchyBuilder h = new FolderHeirarchyBuilder("folder_hierarchy.txt");
		h.getRootFolder().display();
	}
}