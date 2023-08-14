package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mainapp")
public class ResController {
	
	@GetMapping("/login")
	public String sayLogin() {
		return "login";
	}
	
	/*@GetMapping("/register")
	public String sayRegister() {
		return "register";
	}*/
}
