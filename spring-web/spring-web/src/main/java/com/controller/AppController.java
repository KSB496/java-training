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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
@RequestMapping("/mainapp")
@CrossOrigin(origins="http://localhost:64775")
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
	@PostMapping("/login")
	//public String loginvalid(@RequestParam String uname,@RequestParam String pass) {
		public String loginvalid(@ModelAttribute User user) {
		/*if(uname.equals("admin") && pass.equals("manager")) {
			return "Login Success";
		}
		return "Login Failed";*/
		if(service.userValid(user)) {
			return "Login Success";
		}
		return "Login Failed";
	}
	
	//@RequestMapping(value = "/register",method = RequestMethod.POST)
	//@ResponseBody
	@PostMapping("/register")
	//public String registerUser(@RequestParam String uname,@RequestParam String pass,@RequestParam String email,@RequestParam String city) {
	public void registerUser(@RequestBody User user) {
	/*al.add(new User(uname,pass,email,city));
		System.out.println(al);
		return "Welcome to Register..";*/
		service.userRegistered(user);
		//return "Welcome to Register..";
	}
	
	@GetMapping("/loadall")
	public List<User> loadAllUsers(){
		return service.loadAll();
	}
	
	@GetMapping("/finduser/{uname}")
	public String findUser(@PathVariable String uname) {
		if(service.findUser(uname)) {
			return uname + " Found";
		}
		return "User Not Found";
	}
	@DeleteMapping("/deleteuser/{uname}")
	public String deleteUser(@PathVariable String uname) {
		if(service.deleteUser(uname)) {
			return uname + " Deleted";
		}
		return "User Not Found";
	}
	
	@PutMapping("/updateuser/{uname}")
	public String updateUser(@PathVariable String uname,@RequestBody User user ) {
		service.updateUser(uname, user);
		return "User Updated";
	}
}
