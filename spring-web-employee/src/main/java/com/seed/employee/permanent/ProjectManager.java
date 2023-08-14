package com.seed.employee.permanent;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import com.seed.employee.Certification;

public class ProjectManager extends PermanentEmployee implements Certification {

	private int yearsExperience;
	private List<String> pmCertificate;
	
	public ProjectManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectManager(String empFirstName, String empLastName, String empGrade,
			GregorianCalendar empDate, int yearsExperience, List<String> pmCertificate) {
		super(empFirstName, empLastName, empGrade, empDate);
		// TODO Auto-generated constructor stub
		this.yearsExperience = yearsExperience;
		this.pmCertificate = pmCertificate;
	}
	
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 10000 * yearsExperience;
	}
	@Override
	public double mediclaim() {
		return  calculateSalary();
	}
	
	@Override
	public String toString() {
		return "PermanentProjectManagerEmployee [peId=" + getPeId() + ", EmpName="
				+ getEmpName() + ", Designation=" + "PM" + ", YearsOfExperience=" + yearsExperience + ", EmpCertiList=" + certiList() + ", EmpDate=" + getEmpDate() + "]";
	}
	@Override
	public List<String> certiList() {
		// TODO Auto-generated method stub
		List<String> a1 = new ArrayList<String>();
		a1.addAll(pmCertificate);
		return a1;
	}
}
