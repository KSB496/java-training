package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/mainapp")
public class ResController {

	//@RequestMapping(value = "/login",method = RequestMethod.GET)
	@GetMapping("/login")
	public String sayLogin() {
		return "login";
	}
	
	//@RequestMapping(value = "/register",method = RequestMethod.GET)
	@GetMapping("/register")
	public String sayRegister() {
		return "register";
	}
}
