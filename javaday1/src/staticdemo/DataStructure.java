package staticdemo;

public class DataStructure {

	private final static int SIZE = 20;
	private int[] arrayofdata = new int[SIZE];
	
	public DataStructure() {
		for (int i=0; i<SIZE; i++)
		{
			arrayofdata[i] = i;
		}
	}
	
	public void printEven() {
		InnerApp app = new InnerApp();
		while(app.hasNext()) {
			System.out.println(app.getNext() + " ");
		}
	}
		
	public void printOdd() {
		InnerApp app = new InnerApp();
		while(app.hasNext()) {
			System.out.println(app.getOdd() + " ");
		}
	}
	
	//inner class
	private class InnerApp {
		private int next = 0;
		public boolean hasNext() {
			return(next <= SIZE - 1);
		}
		public int getNext() {
			int retValue = arrayofdata[next];
			next +=2;
			return retValue;
		}
		public int getOdd() {
			int oddValue = arrayofdata[next];
			if(next%2!=0)
				next++;
			return oddValue;
		}
	}
}
