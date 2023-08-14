package com.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppClient {

	public static void main(String[] args) {
				
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);	
		
		Welcome wc = (Welcome)context.getBean("welcome");
		System.out.println(wc.sayWelcome("Thomas"));
		wc.sayHi();
		
	}

}
