package com.service;

import com.restaurant.Restaurant;

public class RestaurantService {
	private Restaurant restaurant;
	
	public RestaurantService(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}
	
	public void takeOrder(String order) {
		restaurant.prepareFood(order);
	}
}
