package ass1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddCustomer {

	public void printCustomers(List<String> arrayList) {
		
		//Create the iterator to iterate over the List 
		Iterator<String> iterator = arrayList.iterator();
		System.out.println("Customers are : ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {
		
	List<String> list = new ArrayList<String>();
	list.add("Jack");
	list.add("Harry");
	list.add("Tabrez");
	list.add("Leezu");
	
	//Create reference of List and object of ArrayList
	AddCustomer addCustomer = new AddCustomer();
	
	//Call printCustomers()to print the contents of list 
	addCustomer.printCustomers(list);
	}

}
