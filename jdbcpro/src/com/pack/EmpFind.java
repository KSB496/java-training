package com.pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.dao.ConnectionApp;

public class EmpFind {
	
	public static void main(String[] args) throws SQLException {

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
	System.out.println("Enter the empId to search : ");
	Scanner sc = new Scanner(System.in);
	int eId = sc.nextInt();
	boolean bool = false;
	for (Employee em : ae) {
		if(eId == em.getEmpId()) {
			System.out.println(em);
			bool = true;
		}
		
	}
	if(!bool) {
		System.out.println("User Not Found");
	}
	}
}
