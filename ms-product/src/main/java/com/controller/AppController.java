package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.model.Product;
import com.service.ProductService;

@RestController
@RequestMapping("/products")
public class AppController {

	@Autowired
	private ProductService service;
	
	@PostMapping("/addproducts")
	public Product addProducts(@RequestBody Product product) {
		return service.addProduct(product);
	}

	@GetMapping("/loadallproducts")
	public List<Product> loadAllProducts() {
		return service.getProducts();
	}

	@GetMapping("/findproducts/{pid}")
	public List<Product> findProduct(@PathVariable List<Long> pid) {
		return service.getById(pid);
	}
	@DeleteMapping("/deleteproducts/{pid}")
	public String deleteProduct(@PathVariable long pid) {
		if(service.deleteProduct(pid)) {
			return "Product deleted";
		}
		return "product not found";
	}
	
	@PutMapping("/updateproduct/{pid}")
	public String updateProduct(@PathVariable long pid, @RequestBody Product product) {
		if(service.updateProducts(product, pid)) {
			return "Product Updated";
		}
		return "product not found";
	}
}
