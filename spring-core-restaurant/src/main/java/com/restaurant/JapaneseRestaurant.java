package com.restaurant;

public class JapaneseRestaurant implements Restaurant {

	@Override
	public void prepareFood(String dishname) {
		// TODO Auto-generated method stub
		System.out.println("Preparing " + dishname + " with Japanese herbs and spices");
	}

}
