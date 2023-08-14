package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.domain.UserAccount;

public class AppClient {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserAccount usa = (UserAccount)context.getBean("ua");
		usa.display();
		
	}

}
