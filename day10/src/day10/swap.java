package day10;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1 : ");
		double x = sc.nextDouble();		
		System.out.println("Enter the number2 : ");
		double y = sc.nextDouble();
		
		y = x/y;
		x = x/y;		
		y = x*y;
		
		System.out.println("swapped numbers : " + x + " " + y);
	}

}
