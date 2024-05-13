package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreatingConnection {
	private String url="jdbc:mysql://localhost:3306/userLogin";
	private String db_username="root";
	private String db_password="Manasa1@";
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url,db_username,db_password);
		return conn;
	}
}
