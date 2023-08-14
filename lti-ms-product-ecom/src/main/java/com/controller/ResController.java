package com.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/products")
@Component
public class ResController {

	@GetMapping("/clothes")
	public String sayClothes() {
		return "clothes";
	}
	
	@GetMapping("/electronics")
	public String sayElectronics() {
		return "electronics";
	}
	
	@GetMapping("/shoes")
	public String sayShoes() {
		return "shoes";
	}
}
