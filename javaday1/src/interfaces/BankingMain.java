package interfaces;


public class BankingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PrivateBank prb = new PrivateBank();
		 PublicBank pb = new PublicBank();
		 
		 prb.checkBalance();
		 prb.maintainBalance();
		 prb.purchaseInsurance();
		 prb.sellInsurance();
		 prb.purchaseStocks();
		 prb.sellStocks();
		 
		 pb.checkBalance();
		 pb.maintainBalance();
		 pb.purchaseInsurance();
		 pb.sellInsurance();
		 pb.purchaseStocks();
		 pb.sellStocks();
		
	}

}
