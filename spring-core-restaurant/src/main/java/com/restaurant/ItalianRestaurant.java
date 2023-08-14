package com.restaurant;

public class ItalianRestaurant implements Restaurant{

	@Override
	public void prepareFood(String dishname) {
		// TODO Auto-generated method stub
		System.out.println("Preparing " + dishname + " with italian herbs and olive oil");
	}

}
