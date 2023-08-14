package com.pack;

import java.sql.Statement;
import java.util.Scanner;

import com.dao.ConnectionApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//Class.forName("com.mysql.jdbc.Driver");
		//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kajaldb?serverTimezone=UTC","root","root123");
		//System.out.println("Connected...");

		Connection conn = ConnectionApp.appConn();
		
		//String insertData = "insert into employee values(102,'kb','NY')";		
		//Statement st = conn.createStatement();
		//st.executeUpdate(insertData);
		
		Scanner sc = new Scanner(System.in);
		
		String insertData = "insert into employee values(?,?,?)";		
		PreparedStatement pst = conn.prepareStatement(insertData);
		pst.setInt(1, sc.nextInt());
		pst.setString(2, sc.next());
		pst.setString(3, sc.next());
		//pst.setInt(1, 22);
		//pst.setString(2, "kk");
		//pst.setString(3, "yy");
		pst.executeUpdate();
		System.out.println("user added..!");
		
	}
	


}
