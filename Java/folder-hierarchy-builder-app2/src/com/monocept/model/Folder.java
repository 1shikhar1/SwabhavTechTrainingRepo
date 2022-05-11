package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IItem {
	private List<IItem> files = new ArrayList<IItem>();

	private String folderName;

	public Folder(String folderName) {

		this.folderName = folderName;
	}

	public void addData(IItem file) {
		files.add(file);
	}

	@Override
	public void display() {
		System.out.println(folderName);
		for (IItem st : files)
			st.display();
		

	}

}