package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionApp {

	public static Connection appConn() {
		Connection conn = null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kajaldb?serverTimezone=UTC","root","root123");
		//System.out.println("Connected...");
		
		}catch(Exception e) {}
		return conn;
	}
	
}
