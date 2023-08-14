package day1assignment;

public class MinAccountBalValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setAccAmount(5000);
		if(account.getAccAmount()<500) {
			System.out.println("The balance is below minimum value");
		}else {
			System.out.println("Existing Balance : " +account.getAccAmount());
		}
			
	}

}
