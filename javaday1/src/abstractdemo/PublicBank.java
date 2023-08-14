package abstractdemo;

public class PublicBank extends Banking {

	@Override
	public void checkBalance() {
		
		System.out.println("Public Bank Check balance");
	}

	@Override
	public void maintainBalance() {
		
		System.out.println("public Bank maintain balance");
	}

}
