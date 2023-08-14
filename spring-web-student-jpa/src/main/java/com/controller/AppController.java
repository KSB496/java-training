package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;

@RestController
@RequestMapping("/mainapp")
//@CrossOrigin(origins="http://localhost:64775")
@CrossOrigin(origins="http://localhost:3000")
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
	public Student registerStudent(@RequestBody Student student) {
		return service.addStudent(student);
		//return "Welcome to Register..";
	}
	
	@GetMapping("/getallstudents")
	//public List<Student> getAllStudents(@RequestHeader(name="X-COM-PERSIST",required=true)String headerData,
			//@RequestHeader(name="X-COM-LOCATION",defaultValue = "ASIA")String location){
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@GetMapping("/getstudent/{sid}")
	public String getStudent(@PathVariable int sid) {
		if(service.getStudent(sid)) {
			return sid + " Found";
		}
		return "Student Not Found";
	}
	@DeleteMapping("/deletestudent/{sid}")
	public String deleteStudent(@PathVariable int sid) {
		if(service.deleteStudent(sid)) {
			return sid + " Deleted";
		}
		return "Student Not Found";
	}
	
	@PutMapping("/updatestudent/{sid}")
	public String updateStudent(@PathVariable int sid,@RequestBody Student student) {
		if(service.updateStudent(student, sid)) {
		return "Student Updated";
		}
		else {
			return "Student Not Found";
		}
	}
}
