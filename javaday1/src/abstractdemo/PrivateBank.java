package abstractdemo;

public class PrivateBank extends Banking {

	@Override
	public void checkBalance() {
		
		System.out.println("Private Bank Check balance");
	}

	@Override
	public void maintainBalance() {
		
		System.out.println("Private Bank maintain balance");
	}

}
