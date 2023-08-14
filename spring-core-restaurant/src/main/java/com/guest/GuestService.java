package com.guest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.restaurant.AmericanRestaurant;
import com.restaurant.IndianRestaurant;
import com.service.RestaurantService;

public class GuestService {
	
	public static void main(String[] args) {
		
		//RestaurantService rs = new RestaurantService(RestaurantFactory.create("Japanese"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		RestaurantService rs = (RestaurantService)context.getBean("service");
		rs.takeOrder("Pasta");
		
	}
}
