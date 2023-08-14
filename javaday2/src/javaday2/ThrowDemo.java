package javaday2;

public class ThrowDemo {
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to enter...");
		}
		else {
			System.out.println("welcome");
		}
	}

	public static void main(String[] args) {

	validate(19);

	}

}
