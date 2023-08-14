package application;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class EmployeeDaoImpl implements EmpDao1 {

	@Override
	public void addEmp(Employee emp) throws genericException {
		
		
			try {
				FileOutputStream fos = new FileOutputStream("c:\\mydata");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				throw new genericException("Something went wrong..",e);
			} 
		
		
	}

}
