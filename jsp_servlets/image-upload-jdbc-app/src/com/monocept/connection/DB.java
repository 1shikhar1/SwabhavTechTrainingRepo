package com.monocept.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	static String url = "localhost:3306/imagedb";
	static String userName = "root";
	static String password = "root";

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://" + url, userName, password);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return conn;

	}

}