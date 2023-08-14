package workers;

public interface Worker2 {

	public void welcome();
	public default void show() {
		System.out.println("show method of worker2");
	}
}
