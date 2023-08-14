package com.example.ltimsregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LtiMsRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LtiMsRegistryApplication.class, args);
	}

}
