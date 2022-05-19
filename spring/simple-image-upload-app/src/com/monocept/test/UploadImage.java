package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UploadImage {
	
	public static void main(String args[]) throws SQLException, IOException {
		retriveImage();
	}
	
	public static void retriveImage() throws SQLException, IOException {
		Connection conn = connectDB();
		PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM img_strg");
		ResultSet rs = pstmt.executeQuery();
		
		Blob blob = null;
		
		while(rs.next()) {
			   String name= rs.getString("name");
			   blob = rs.getBlob("image");
			}
		byte byteArray[] = blob.getBytes(1,(int)blob.length());
		FileOutputStream outPutStream = new FileOutputStream("downloadedImage/img1.jpg");
		outPutStream.write(byteArray);
		System.out.println("Image retrived successfully.");
	}
	
	public static void uploadImage() throws SQLException, FileNotFoundException {
		Connection conn = connectDB();
		PreparedStatement pstmt = conn.prepareStatement("INSERT INTO img_strg VALUES(?, ?)");
		
		pstmt.setString(1, "image1");
		InputStream in = new FileInputStream("images/img1.jpg");
		pstmt.setBlob(2, in);
		pstmt.execute();
		
		System.out.println("Record inserted");
	}
	
	public static Connection connectDB() {
		Connection conn = null;
		try {
		       conn = DriverManager.getConnection("jdbc:mysql://localhost/imagedb?" + "user=root&password=root");
		   
		} catch (SQLException ex) {
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		
		return conn;
	}
}
