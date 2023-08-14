package com.client;

import org.springframework.stereotype.Component;

@Component("welcome")
public class WelcomeImpl implements Welcome{

	@Override
	public String sayWelcome(String name) {
		// TODO Auto-generated method stub
		return "Welcome "+ name;
	}

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("Hello and say Hi ");
	}
}
