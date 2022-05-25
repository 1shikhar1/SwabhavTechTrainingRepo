package com.monocept.repository;

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

public class ImageRepository {
	
	
	public  void uploadImage(int id, InputStream in) throws SQLException, FileNotFoundException {
		Connection conn = connectDB();
		PreparedStatement pstmt = conn.prepareStatement("INSERT INTO img_strg VALUES(?, ?)");
		
		pstmt.setInt(1,id);
		pstmt.setBlob(2, in);
		pstmt.execute();
		
		System.out.println("Record inserted");
	}
	
	public byte[] retriveImage(int id) throws SQLException, IOException {
		Connection conn = connectDB();
		PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM img_strg where id="+id);
		ResultSet rs = pstmt.executeQuery();
		
		Blob blob = null;
		byte byteArray[] = null;
		
		while(rs.next()) {
			   int name= rs.getInt("id");
//			   byteArray = rs.getBytes("image");
			   blob = rs.getBlob("image");
			}
		byteArray = blob.getBytes(1,(int)blob.length());
		
		System.out.println("Image retrived successfully.");
		
		return byteArray;
	}
	
	
	
	public Connection connectDB() {
		Connection conn = null;
		
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
		       conn = DriverManager.getConnection("jdbc:mysql://localhost/imagedb?" + "user=root&password=root");
		   
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
		return conn;
	}
}
