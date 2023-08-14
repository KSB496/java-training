package interfaces;

public class PrivateBank implements Banking, Insurance, Stocks {

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("private bank check balance");
	}

	@Override
	public void maintainBalance() {
		// TODO Auto-generated method stub
		System.out.println("private bank maintain balance");
	}

	@Override
	public void purchaseInsurance() {
		// TODO Auto-generated method stub
		System.out.println("private bank purchase insurance");
	}

	@Override
	public void sellInsurance() {
		// TODO Auto-generated method stub
		System.out.println("private bank sell insurance");
	}

	@Override
	public void purchaseStocks() {
		// TODO Auto-generated method stub
		System.out.println("private bank purchase stocks");
	}

	@Override
	public void sellStocks() {
		// TODO Auto-generated method stub
		System.out.println("private bank sell stocks");
	}
	
	

}
