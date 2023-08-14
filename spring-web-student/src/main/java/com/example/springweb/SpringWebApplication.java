package com.example.springweb;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class SpringWebApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringWebApplication.class, args);
		SpringApplication app = new SpringApplication(SpringWebApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8050"));
		app.run(args);
	}

}
