package com.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.repo.AccountImpl;
import com.service.TransferServiceImpl;

@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy
public class AppConfig {

	/*@Bean
	public AccountImpl ar() {
		return new AccountImpl();
	}
	@Bean
	public TransferServiceImpl ts() {
		return new TransferServiceImpl(ar());
	}*/
}
