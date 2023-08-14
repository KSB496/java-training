package day2assignment1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Travel travel = new Travel();
		travel.setModeOfTravel('F');
		travel.setNoOfTickets(3);
		if(travel.getModeOfTravel()=='F') {
			travel.setAmount(500);
		}
		else if(travel.getModeOfTravel()=='T'){
			travel.setAmount(100);
		}
		else if(travel.getModeOfTravel()=='B') {
			travel.setAmount(50);
		}
		double TotalServiceCharge = travel.getAmount() * travel.getNoOfTickets(); 
		System.out.println(TotalServiceCharge);
	}

}
