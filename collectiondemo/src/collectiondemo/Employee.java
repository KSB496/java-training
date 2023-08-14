package collectiondemo;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	
	private int empId;
	@Override
	public int hashCode() {
		return Objects.hash(empDept, empId, empName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empDept, other.empDept) && empId == other.empId && Objects.equals(empName, other.empName);
	}
	private String empName;
	private String empDept;
	public Employee(int empId, String empName, String empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + "]";
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return o.getEmpName().compareTo(this.getEmpName());
	}
	

}
