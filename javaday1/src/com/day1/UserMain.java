package com.day1;

public class UserMain {
	public static void main(String[] args) {
		
		// Creating a object for the user class
		User user = new User();
		User user2 = new User();
		user.setEmpId(101);
		user.setEmpName("Kajal");
		user.setEmpCity("NJ");
		
		user2 = user;
		
		System.out.println(user.getEmpName() + " " + user.getEmpCity());
		
		System.out.println(user.hashCode());
		System.out.println(user2.hashCode());
	}
}
