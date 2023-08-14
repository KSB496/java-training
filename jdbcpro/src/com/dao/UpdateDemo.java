package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDemo {

public static void main(String[] args) throws SQLException, ClassNotFoundException {
		

		Connection conn = ConnectionApp.appConn();
		
		Scanner sc = new Scanner(System.in);
		
		String updateData = "update employee set empname=? where empid=?";		
		PreparedStatement pst = conn.prepareStatement(updateData);
		pst.setString(1, sc.next());
		pst.setInt(2, sc.nextInt());
		
		pst.executeUpdate();
		System.out.println("user updated..!");
		
	}
}
