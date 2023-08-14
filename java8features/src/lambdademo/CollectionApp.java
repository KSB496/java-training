package lambdademo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionApp {
	
	public static void main(String[] args) {

		ArrayList<Employee> a1 = new ArrayList<Employee>();
		
		a1.add(new Employee(101, "kajal", "CS"));
		a1.add(new Employee(102, "kishu", "HR"));
		a1.add(new Employee(103, "dax", "Business"));
		a1.add(new Employee(104, "Jack", "management"));
		a1.add(1, new Employee(107,"xyz","HS"));
		
		for (Employee em : a1) {
			System.out.println(em);
		}
		
		System.out.println("After Sorting");
		/* without lambda
		 * Collections.sort(a1,new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				return e1.getEmpName().compareTo(e2.getEmpName());
			}
		});*/
		
		//with lambda
		Collections.sort(a1,(Employee e1, Employee e2) -> e1.getEmpName().compareTo(e2.getEmpName()));
		for (Employee em : a1) {
			System.out.println(em);
		}
	}
}
