package com.dphone.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DphoneConnection {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String connectionString = "jdbc:mysql://localhost:3306/CASE_STUDY5_REFERRAL";
			connection = DriverManager.getConnection(connectionString, "root" , "V!$#@l@@!!1234");
			System.out.println("Connected");
		} catch(Exception e) {
			System.out.println(e);
		}
		return connection;
	}
}
