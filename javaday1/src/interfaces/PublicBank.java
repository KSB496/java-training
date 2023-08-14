package interfaces;

public class PublicBank implements Banking, Insurance, Stocks {

	@Override
	public void purchaseInsurance() {
		// TODO Auto-generated method stub
		System.out.println("public bank purchase insurance");
	}

	@Override
	public void sellInsurance() {
		// TODO Auto-generated method stub
		System.out.println("public bank sell insurance");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("public bank check balance");
	}

	@Override
	public void maintainBalance() {
		// TODO Auto-generated method stub
		System.out.println("public bank maintain balance");
	}

	@Override
	public void purchaseStocks() {
		// TODO Auto-generated method stub
		System.out.println("public bank purchase stocks");
	}

	@Override
	public void sellStocks() {
		// TODO Auto-generated method stub
		System.out.println("public bank sell stocks");
	}

	

}
