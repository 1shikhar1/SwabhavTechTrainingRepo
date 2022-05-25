package com.monocept.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import com.monocept.repository.ImageRepository;

public class ImageService {
	ImageRepository repo = new ImageRepository();
	
	public void uploadImage(int id, InputStream img) {
		try {
			repo.uploadImage(id, img);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public byte[] getImage(int id) {
		try {
			return repo.retriveImage(id);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
