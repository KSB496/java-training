package lambdademo;

public class WorkerImpl {

	public static void execute(WorkerApp app) {
		app.doSomeWork();
	}
	
	public static void main(String[] args) {
		
		execute(new WorkerApp(){

			@Override
			public void doSomeWork() {
				// TODO Auto-generated method stub
				
				System.out.println("Doing some work using anonymous class");
				
			}
			
		});
		//using lambda
		execute(()->System.out.println("called using lambda"));
	}
}
