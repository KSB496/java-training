package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao dao;
	
	ArrayList<Student> al = new ArrayList<Student>();
	public boolean studentValid(Student student) {
		for(Student st : al) {
		if(st.getRollno()== student.getRollno()) {
			return true;
		}
		}
		return false;
	}
	
	public Student addStudent(Student student) {
		System.out.println(al);
		return dao.save(student);
		
	}
	
	public List<Student> getAllStudents(){
		return (ArrayList<Student>)dao.findAll();
	}
	
	public boolean getStudent(int id) {
		Optional<Student> data = dao.findById(id);
			if(data.isPresent()) {
				return true;
			}		
		return false;
	}
	
	public boolean deleteStudent(int id) {
		Optional<Student> data = dao.findById(id);
			if(data.isPresent()) {
				dao.deleteById(id);
				return true;
			}
		return false;
	}
	
	public boolean updateStudent(Student student, int id) {
		dao.updateStudent(student.getRollno(), student.getSchoolname(), student.getSubject(), student.getTotalmarks(), id);
		return true;
	}
	
}
