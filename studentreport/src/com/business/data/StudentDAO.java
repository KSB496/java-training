/**
 * 
 */
package com.business.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author 10725270
 *
 */
public class StudentDAO {

	private Connection conn;
	private Statement stmt;
	private static final String uname="root";
	private static final String password="root123";
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String dbUrl = "jdbc:mysql://localhost:3306/ltikajaldb?serverTimezone=UTC";
	
	public StudentDAO() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(dbUrl, uname, password);
			stmt = conn.createStatement();
		}catch(Exception e) {
			
		}
	}
	public ArrayList<Student> fetchdata(){
		ResultSet rs = null;
		ArrayList<Student> list = null;
		try {
			
			rs = stmt.executeQuery("select * from student_master");
			
			list = new ArrayList<>();
			while(rs.next()) {
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7)));
			}
		}catch(Exception e) {
			
		}
		return list;
	}
	private PreparedStatement pst;
	public void addStudent(Student student) throws SQLException {
		
		String insertData = "insert into student_master values(?,?,?,?,?,?,?)";		
		pst = conn.prepareStatement(insertData);
		pst.setInt(1, student.getRollNo());
		pst.setString(2, student.getName());
		pst.setString(3, student.getGender());
		pst.setInt(4, student.getMaths());
		pst.setInt(5, student.getPhysics());
		pst.setInt(6, student.getChem());
		pst.setInt(7, student.getCs());
		pst.executeUpdate();
		
	
	}
	
	
}
