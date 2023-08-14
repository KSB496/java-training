package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
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
@RequestMapping("/users")
@RefreshScope
public class AppController {

	@Value("${spring.msg}")
	private String message;
	
	@Autowired
	private UserService service;

	/*@PostMapping("/login")
	public String loginvalid(@ModelAttribute User user) {
		if (service.userValid(user)) {
			return "Login Success";
		}
		return "Login Failed";
	}*/

	@PostMapping("/register")
	public String registerUser(@RequestBody User user) {
		service.userRegistered(user);
		return "Welcome to Register..";
	}

	@GetMapping("/loadall")
	public List<User> loadAllUsers() {
		System.out.println(message);
		return service.loadAll();
	}

	@GetMapping("/finduser/{uid}")
	public String findUser(@PathVariable int uid) {
		if (service.findUser(uid)) {
			return uid + " Found";
		}
		return "User Not Found";
	}

	@DeleteMapping("/deleteuser/{uid}")
	public String deleteUser(@PathVariable int uid) {
		if (service.deleteUser(uid)) {
			return uid + " Deleted";
		}
		return "User Not Found";
	}

	@PutMapping("/updateuser/{uid}")
	public String updateUser(@RequestBody User user, @PathVariable int uid) {
		if(service.updateUser(user, uid)) {
			return "User Updated";
		}
		return "User Not Updated";
	}
}
