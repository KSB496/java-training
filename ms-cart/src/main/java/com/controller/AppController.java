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


@RestController
@RequestMapping("/shoppingcart")
@RefreshScope
public class AppController {
	
	@Value("${spring.msg}")
	private String message;
	
	@Autowired
	private AppDelegate delegate;

	@GetMapping("/loaddata")
	public String loadData() {
		System.out.println(message);
		return delegate.loadProductsFromApp();
	}
	
	@GetMapping("/loaddatauser")
	public String loadDataUser() {
		System.out.println(message);
		return delegate.loadUsersFromApp();
	}
}
