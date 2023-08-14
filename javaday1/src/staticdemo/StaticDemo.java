package staticdemo;

public class StaticDemo {

	private static int a=10;
	private static int b;
	
	static {
		System.out.println("Inside static block : ");
		b = a*10;
	}
	
	public static void showData()
	{
		System.out.println(b);
	}
}
