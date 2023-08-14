

import java.util.ArrayList;
import java.util.Scanner;

import com.seed.employee.Employee;

public class EmployeeCreate {
	
	private ArrayList<Employee> lst;
	Scanner s1;
	Scanner s;
	
	public EmployeeCreate() {
		lst = new ArrayList<Employee>();
	}

	public void addEmployee(Employee emp) {
		lst.add(emp);
	}
	
	public void displayEmployee() {
		for(Employee e : lst) {
			System.out.println(e);
		}
	}
	
	public int getNoEmployee() {
		return lst.size();
	}

}
