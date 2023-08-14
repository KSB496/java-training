package com.service;

import com.restaurant.Restaurant;

public class RestaurantService {
	private Restaurant restaurant;
	
	
	
	public Restaurant getRestaurant() {
		return restaurant;
	}



	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}



	public void takeOrder(String order) {
		restaurant.prepareFood(order);
	}
}
