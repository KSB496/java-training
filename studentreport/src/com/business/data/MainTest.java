package com.business.data;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
		StudentDAO sd = new StudentDAO();
		List<Student> studentList = sd.fetchdata();
		/*for(Student sdt : studentList) {
			System.out.println(sdt);
		}*/
		Student student = new Student(125,"SJB","M",80,100,90,50);
		sd.addStudent(student);
		for(Student sdt : studentList) {
			System.out.println(sdt);
		}
	}

}
