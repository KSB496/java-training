package abstractdemo;

public class BankingMain {
	
	public static void main(String[] args) {
		Banking bank = new PrivateBank();
		
		bank.checkBalance();
		bank.maintainBalance();
		
		Banking bank2 = new PublicBank();
		
		bank2.checkBalance();
		bank2.maintainBalance();
	}

}
