package com.seed.employee;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Employee extends EmployeeSalary {

	protected int empId;
	private String empName;
	protected double empSalary;
	private String empGrade;
	private GregorianCalendar empDate;
	protected int eId;
	private String date1;

	public Employee(String empFirstName, String empLastName, String empGrade, GregorianCalendar empDate) {
		super();
		this.empName = empFirstName + empLastName;
		this.empGrade = empGrade;
		date1 = new SimpleDateFormat("dd-MM-yyyy").format(empDate.getTime());	
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
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
	public String getEmpGrade() {
		return empGrade;
	}
	public void setEmpGrade(String empGrade) {
		this.empGrade = empGrade;
	}
	public String getEmpDate() {
		return date1;
	}
	public void setEmpDate(GregorianCalendar empDate) {
		this.empDate = empDate;
	}
	
	public double mediclaim() {
		return  empSalary;
	}

	@Override
	public String toString() {

		return "Employee [ empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empGrade=" + empGrade + ", empDate="
				+ date1 + "]";
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return empSalary;
	}

}
