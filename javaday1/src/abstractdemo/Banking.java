package abstractdemo;

public abstract class Banking {
	
	public abstract void checkBalance();
	public abstract void maintainBalance();
	
	public void issueCard()
	{
		System.out.println("optional credit card");
	}
}
