package workers;

public interface Worker1 {

	public void welcome();
	public default void show() {
		System.out.println("show method of worker1");
	}
}
