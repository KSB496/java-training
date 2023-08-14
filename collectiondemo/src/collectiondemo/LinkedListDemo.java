package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Employee> a1 = new LinkedList<Employee>();

		a1.add(new Employee(101, "kajal", "CS"));
		a1.add(new Employee(102, "kishu", "HR"));
		a1.add(new Employee(103, "dax", "Business"));
		a1.addFirst(new Employee(104, "parth", "Management"));
		a1.addLast(new Employee(105, "John", "Payroll"));
		//a1.remove(2);
		//Collections.sort(a1, new EmpNameOrder());
		//Collections.sort(a1, new EmpDeptOrder());
		
		for (Employee em : a1) {
			System.out.println(em);
			
		//System.out.println(a1.get(2));
			
		}

	}
}
