package com.factory;

import java.io.FileInputStream;
import java.util.Properties;

import com.restaurant.AmericanRestaurant;
import com.restaurant.IndianRestaurant;
import com.restaurant.ItalianRestaurant;
import com.restaurant.JapaneseRestaurant;
import com.restaurant.Restaurant;

public class RestaurantFactory {
	
	private static Properties pro = new Properties();
	
	static {
		try {
			pro.load(new FileInputStream("fac.properties"));
		}
		catch(Exception e) {
		}
	}

	public static Restaurant create(String type) {
		try {
			Class cls = Class.forName(pro.getProperty(""+type));
			return (Restaurant) cls.newInstance();
			}
		catch(Exception e) {		
		}
		return null;
	}
}
