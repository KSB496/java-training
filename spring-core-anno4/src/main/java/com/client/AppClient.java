package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.BankingService;

public class AppClient {

	public static void main(String[] args) {
		
		//Instantiating(creating) the container 
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Invoke a Service
		BankingService service1 = (BankingService)context.getBean("service");
		BankingService service2= (BankingService)context.getBean("service");
		
		System.out.println(service1.hashCode());
		System.out.println(service2.hashCode());
		
		BankingService service = (BankingService)context.getBean("service");
		
		System.out.println(service.service(8856));
	
	}

}
