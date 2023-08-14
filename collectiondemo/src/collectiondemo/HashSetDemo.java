package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {

		//HashSet<Employee> a1 = new HashSet<Employee>();
		TreeSet<Employee> a1 = new TreeSet<Employee>();

		a1.add(new Employee(101, "kajal", "CS"));
		a1.add(new Employee(102, "kishu", "HR"));
		a1.add(new Employee(103, "dax", "Business"));
		a1.add(new Employee(104, "Deny", "management"));
		a1.add(new Employee(104, "Deny", "management"));

		//a1.remove(2);
		//Collections.sort(a1, new EmpNameOrder());
		//Collections.sort(a1, new EmpDeptOrder());
		
		
		
		for (Employee em : a1) {
			System.out.println(em);
			
		//System.out.println(a1.get(2));
			
		}
		
		

	}
}
