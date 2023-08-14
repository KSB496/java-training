package application;

import java.io.FileNotFoundException;

public class Client {

	public static void main(String[] args) throws FileNotFoundException {
		
		EmpDao1 dao = new EmployeeDaoImpl();
		
		Employee em = new Employee("sam", "NY");
		
		try {
			dao.addEmp(em);
		} catch (genericException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("User Added...!");

	}

}
