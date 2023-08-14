package com.example.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RequestMapping("/mainapp")
public class AppController {

	@GetMapping("/welcome")
	public String sayWelcome() {
		return "welcome";
	}
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/employee")
	public String employee() {
		return "employee";
	}
	@GetMapping("/manager")
	public String manager() {
		return "manager";
	}
	@GetMapping("/common")
	public String common() {
		return "common";
	}
	@GetMapping("/accessdenied")
	public String accessdenied() {
		return "accessdenied";
	}
	@GetMapping("/qa")
	public String qa() {
		return "qa";
	}
	@GetMapping("/hs")
	public String hs() {
		return "hs";
	}
	
}
