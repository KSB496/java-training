package com.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.domain.UserAccount;

@Configuration
@ComponentScan("com")
public class AppConfig {

	@Bean
	public UserAccount ua() {
		return new UserAccount();
	}
	
}
