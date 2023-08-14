package com.restaurant;

public class AmericanRestaurant implements Restaurant {

	@Override
	public void prepareFood(String dishname) {
		// TODO Auto-generated method stub
		System.out.println("Preparing " + dishname + " with american herbs and spices");
	}

}
