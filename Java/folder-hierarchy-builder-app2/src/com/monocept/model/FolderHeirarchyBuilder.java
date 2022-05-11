package com.monocept.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FolderHeirarchyBuilder {
	private File file;

	public FolderHeirarchyBuilder(String path) throws FileNotFoundException {
		file = new File(path);
	}

	public Folder getRootFolder() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));

		Folder[] foldersObj = new Folder[10];
		IItem[] filesObj = new com.monocept.model.File[11];

		String tmpString;
		String[] data = null;

		while ((tmpString = br.readLine()) != null) {

			data = tmpString.split("\\s+");

			if (!data[0].contains("id")) {
				IItem storage;

				int id = Integer.parseInt(data[0]);
				int pId = Integer.parseInt(data[2]);
				if (!data[3].contains("FL")) {
					foldersObj[id] = new Folder(data[1]);
					storage = foldersObj[id];
				} else {
					filesObj[id] = new com.monocept.model.File(data[1]);
					storage = filesObj[id];
				}
				if (pId != 0) {
					foldersObj[pId].addData(storage);
				}
			}
		}
		return foldersObj[1];

	}

}