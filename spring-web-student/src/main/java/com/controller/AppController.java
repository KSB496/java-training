package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;

@RestController
@RequestMapping("/mainapp")
public class AppController {
	
	@Autowired
	private StudentService service;

	@PostMapping("/login")
		public String loginvalid(@ModelAttribute Student student) {
		if(service.studentValid(student)) {
			return "Login Success";
		}
		return "Login Failed";
	}
	
	@PostMapping("/register")
	public String registerStudent(@ModelAttribute Student student) {
		service.addStudent(student);
		return "Welcome to Register..";
	}
	
	@GetMapping("/getallstudents")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@GetMapping("/getstudent/{rollno}")
	public String getStudent(@PathVariable int rollno) {
		if(service.getStudent(rollno)) {
			return rollno + " Found";
		}
		return "Student Not Found";
	}
	@DeleteMapping("/deletestudent/{rollno}")
	public String deleteStudent(@PathVariable int rollno) {
		if(service.deleteStudent(rollno)) {
			return rollno + " Deleted";
		}
		return "Student Not Found";
	}
	
	@PutMapping("/updatestudent/{rollno}")
	public String updateStudent(@PathVariable int rollno,@RequestBody Student student) {
		if(service.updateStudent(rollno, student)) {
		return "Student Updated";
		}
		else {
			return "Student Not Found";
		}
	}
}
