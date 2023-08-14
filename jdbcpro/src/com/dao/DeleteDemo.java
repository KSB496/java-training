package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDemo {
	
public static void main(String[] args) throws SQLException, ClassNotFoundException {
		

		Connection conn = ConnectionApp.appConn();
		
		Scanner sc = new Scanner(System.in);
		
		String deleteData = "delete from employee where empid=?";		
		PreparedStatement pst = conn.prepareStatement(deleteData);
		pst.setInt(1, sc.nextInt());
		pst.executeUpdate();
		System.out.println("user deleted..!");
		
	}


}
