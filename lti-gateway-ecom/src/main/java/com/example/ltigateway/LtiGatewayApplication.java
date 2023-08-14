package com.example.ltigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LtiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LtiGatewayApplication.class, args);
	}

	@Bean
	RouteLocator gatewayRoute(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("ps", rs->rs.path("/products/**")
				.uri("lb://app-product"))
				.build();
	}
	
	/*@Bean
	RouteLocator gatewayRoute(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("sc", rs->rs.path("/shoppingcart/**")
				.uri("lb://app-cart"))
				.build();
	}*/
	@Bean
	RouteLocator gatewayUserRoute(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("us", rs->rs.path("/users/**")
				.uri("lb://app-user"))
				.build();
	}
}
