package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Student;

@Service
public class StudentService {

	ArrayList<Student> al = new ArrayList<Student>();
	public boolean studentValid(Student student) {
		for(Student st : al) {
		if(st.getRollno()== student.getRollno()) {
			return true;
		}
		}
		return false;
	}
	
	public void addStudent(Student student) {
		al.add(student);
		System.out.println(al);
	}
	
	public List<Student> getAllStudents(){
		return al;
	}
	
	public boolean getStudent(int rollno) {
		for(Student st: al) {
			if(st.getRollno()==rollno) {
				return true;
			}
		}
		return false;
	}
	public boolean deleteStudent(int rollno) {
		for(Student st : al) {
			if(st.getRollno()==rollno) {
				al.remove(st);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateStudent(int rollno,Student student) {
		for(Student st : al) {
			if(st.getRollno()==rollno) {
				st.setRollno(student.getRollno());
				st.setSchoolname(student.getSchoolname());
				st.setSubject(student.getSubject());
				st.setTotalmarks(student.getTotalmarks());
				return true;
			}
		}
		return false;
	}
	
}
