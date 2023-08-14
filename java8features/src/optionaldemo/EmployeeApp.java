package optionaldemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeApp {

	public static void main(String[] args) {
		
		List<Employee> empList = createEmployee();
		Optional<Employee> emp = findEmployee(empList,"adam1");
		if(emp.isPresent()) {
			Employee em = emp.get();
			System.out.println("Employee Name : " +em.getName());
		}
		else {
			System.out.println("Employee Not found");
		}

	}
	
	public static Optional<Employee> findEmployee(List<Employee> empList,String name) {
		for(Employee e : empList) {
			if(e.getName().equalsIgnoreCase(name)) {
				return Optional.of(e);
			}
		}
		return Optional.empty();
	}
	
	public static List<Employee> createEmployee() {
		List<Employee> e1 = new ArrayList<Employee>();
		e1.add(new Employee("Adam",20));
		e1.add(new Employee("Steve",30));
		e1.add(new Employee("Sam",10));
		e1.add(new Employee("Max",50));
		return e1;
	}

}
