package com.seed.employee.contract;

import java.time.LocalDate;
import java.util.GregorianCalendar;

import com.seed.employee.Employee;

public class ContractBasedEmployee extends Employee {
	
	protected String contractorName;
	protected double ratePerHour;
	protected double noOfHours;
	private static int cempId;
	private int ceId;

	public ContractBasedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContractBasedEmployee(String empFirstName, String empLastName, String empGrade,
			GregorianCalendar empDate, String contractorName, double ratePerHour, double noOfHours) {
		super(empFirstName, empLastName, empGrade, empDate);
		this.contractorName = contractorName;
		this.ratePerHour = ratePerHour;
		this.noOfHours = noOfHours;
		cempId++;
		setCeId(cempId);
	}
	
	public String getContractorName() {
		return contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	public double getRatePerHour() {
		return ratePerHour;
	}
	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	public double getNoOfHours() {
		return noOfHours;
	}
	public void setNoOfHours(double noOfHours) {
		this.noOfHours = noOfHours;
	}
	public static int getCempId() {
		return cempId;
	}
	public static void setCempId(int cempId) {
		ContractBasedEmployee.cempId = cempId;
	}
	public int getCeId() {
		return ceId;
	}
	public void setCeId(int ceId) {
		this.ceId = ceId;
	}
	
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return ratePerHour * noOfHours;
	}
	
	@Override
	public String toString() {
		return "ContractBasedEmployee [ceId=" + getCeId() + ", EmpName="
				+ getEmpName() + ", EmpGrade=" + getEmpGrade() + ", EmpDate=" + getEmpDate() + ", contractorName=" + contractorName + ", ratePerHour=" + ratePerHour
						+ ", noOfHours=" + noOfHours + ", empSalary=" + calculateSalary() + "]";
	}
	
}
