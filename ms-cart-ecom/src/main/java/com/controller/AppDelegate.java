package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class AppDelegate {

	@Autowired
	RestTemplate template;
	
	@Bean
	@LoadBalanced
	public RestTemplate template() {
		return new RestTemplate();
	}
	@HystrixCommand(fallbackMethod = "callOnFail")
	public String loadProductsFromApp() {
		String response = template.exchange("http://app-product/products/loadallproducts", 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<String>() {
				}).getBody();
		return response;
	}
	public String callOnFail() {
		return "Something went wrong....try after sometime";
	}
	
}
