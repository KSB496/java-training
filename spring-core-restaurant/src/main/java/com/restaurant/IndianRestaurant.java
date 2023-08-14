package com.restaurant;

public class IndianRestaurant implements Restaurant {

	@Override
	public void prepareFood(String dishname) {
		// TODO Auto-generated method stub
		System.out.println("Preparing " + dishname + " with indian herbs and spices");
	}

}
