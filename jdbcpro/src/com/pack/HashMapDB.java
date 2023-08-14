package com.pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.dao.ConnectionApp;

public class HashMapDB {
	
	public static void main(String[] args) throws SQLException {

	HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
	Connection conn = ConnectionApp.appConn();
	
	PreparedStatement pst = conn.prepareStatement("select * from employee");
	ResultSet rs = pst.executeQuery();
	
	while(rs.next()) {	
		hm.put(rs.getInt(1), new Employee(rs.getInt(1),rs.getString(1),rs.getString(2)));

		}

	System.out.println(hm.get(1));
	//for (Employee em : hm) {
		//System.out.println(em);
	
	
	
	//}
	
	}
}
