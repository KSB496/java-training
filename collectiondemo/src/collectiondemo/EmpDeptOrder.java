package collectiondemo;

import java.util.Comparator;

public class EmpDeptOrder implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpDept().compareTo(o2.getEmpDept());
	}

}
