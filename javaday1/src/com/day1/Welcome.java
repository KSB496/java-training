package com.day1;

public class Welcome {
	//Main method
	public static void main(String args[])
	{
		//System.out.println("Welcome to Java");
		//System.out.println("Welcome " + args[0] + " to " + args[1]);
		
		//Wrapper Class (java.lang)
		int firstValue = Integer.parseInt(args[0]);
		int secondValue = Integer.parseInt(args[1]);
		
		int result = firstValue + secondValue;
		System.out.println("Result is : " +result);
	}
}
