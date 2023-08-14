package com.guest;

import com.factory.RestaurantFactory;
import com.restaurant.AmericanRestaurant;
import com.restaurant.IndianRestaurant;
import com.service.RestaurantService;

public class GuestService {
	
	public static void main(String[] args) {
		
		RestaurantService rs = new RestaurantService(RestaurantFactory.create("Japanese"));
		
		rs.takeOrder("Sushi");
	}
}
