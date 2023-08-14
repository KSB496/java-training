package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
@RequestMapping("/mainapp")
@CrossOrigin(origins="http://localhost:3000")
public class AppController {
	
	@Autowired
	private UserService service;
	//static ArrayList<User> al = new ArrayList<User>();

	/*@RequestMapping(value = "/welcome",method = RequestMethod.GET)
	@ResponseBody
	public String sayWelcome() {
		return "Welcome to Spring MVC..";
	}*/
	
	//@RequestMapping(value = "/login",method = RequestMethod.POST)
	//@ResponseBody	
	//public String loginvalid(@RequestParam String uname,@RequestParam String pass) {
		
		/*if(uname.equals("admin") && pass.equals("manager")) {
			return "Login Success";
		}
		return "Login Failed";*/
	
	@PostMapping("/login")
	public String loginvalid(@RequestBody User user) {
		if(service.userValid(user)) {
			return "Login Success";
		}
		return "Login Failed";
	}
	
	//@RequestMapping(value = "/register",method = RequestMethod.POST)
	//@ResponseBody
	//public String registerUser(@RequestParam String uname,@RequestParam String pass,@RequestParam String email,@RequestParam String city) {
	/*al.add(new User(uname,pass,email,city));
		System.out.println(al);
		return "Welcome to Register..";*/
	
	@PostMapping("/register")
	public String registerUser(@RequestBody User user) {
		service.userRegistered(user);
		return "Welcome to Register..";
	}
	
	@GetMapping("/loadall")
	//public List<User> loadAllUsers(@RequestHeader(name="X-COM-PERSIST",required=true)String headerData,
			//@RequestHeader(name="X-COM-LOCATION",defaultValue = "ASIA")String location){
	public List<User> loadAllUsers(){
		return service.loadAll();
	}
	
	@GetMapping("/finduser/{uid}")
	public String findUser(@PathVariable int uid) {
		if(service.findUser(uid)) {
			return uid + " Found";
		}
		return "User Not Found";
	}
	@DeleteMapping("/deleteuser/{uid}")
	public String deleteUser(@PathVariable int uid) {
		if(service.deleteUser(uid)) {
			return uid + " Deleted";
		}
		return "User Not Found";
	}
	
	@PutMapping("/updateuser/{uid}")
	public String updateUser(@RequestBody User user, @PathVariable int uid) {
		service.updateUser(user, uid);
		return "User Updated";
	}
}
