package javaday2;

public class ExceptionApp1 {

	public static void main(String[] args) {
		int data = Integer.parseInt(args[0]);
		try {	
			//int data = Integer.parseInt(args[0]);
			int a = 20/data;
			System.out.println(a);
		} catch(ArithmeticException e) {
			System.out.println("divide by Zero");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please provide value");
		}
		finally {
			//resources here released
			System.out.println("It will be called no matter what");
		}
	}

}
