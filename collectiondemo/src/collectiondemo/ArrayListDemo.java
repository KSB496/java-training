package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	static ArrayList<Employee> a1 = new ArrayList<Employee>();
	
	public static void main(String[] args) {

		//ArrayList<Employee> a1 = new ArrayList<Employee>();

		a1.add(new Employee(101, "kajal", "CS"));
		a1.add(new Employee(102, "kishu", "HR"));
		a1.add(new Employee(103, "dax", "Business"));
		a1.add(1,new Employee(104, "parth", "management"));

		//a1.remove(2);
		Collections.sort(a1, new EmpNameOrder());
		Collections.sort(a1, new EmpDeptOrder());
		
		for (Employee em : a1) {
			System.out.println(em);
			
		//System.out.println(a1.get(2));
			
		}
		findEmployee("kishu");
	}
		
		public static boolean findEmployee(String name) {
			for(Employee e : a1) {
				if(e.getEmpName().equals(name))
				{
					System.out.println(e.getEmpDept());
					return true;
				}
				
			}
			return false;
		
	}

}
