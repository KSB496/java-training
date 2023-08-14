package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.ConnectionApp;

public class LoadData {

public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//Class.forName("com.mysql.jdbc.Driver");
		//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kajaldb?serverTimezone=UTC","root","root123");
		//System.out.println("Connected...");
		
		Connection conn = ConnectionApp.appConn();
		
		PreparedStatement pst = conn.prepareStatement("select * from employee");
		ResultSet rs = pst.executeQuery();
		ArrayList<Employee> ae = new ArrayList<Employee>();
		while(rs.next()) {
			//Integer id = rs.getInt(1);
			//String name = rs.getString(2);
			//String city = rs.getString(3);
			ae.add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3)));
			//System.out.println(ae);

			}

		for (Employee em : ae) {
			System.out.println(em);
		
		
		
		}
	}

}
