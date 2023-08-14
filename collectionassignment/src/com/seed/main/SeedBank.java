package com.seed.main;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.seed.DB.CustomerDB;
import com.seed.customer.Customer;
import com.seed.login.Login;

public class SeedBank {

	private static final CustomerDB customerDB = new CustomerDB();
	
	private static final Login login = new Login();
	
	public static void main(String[] args) {
		
		Customer cust1 = new Customer(1001,"Tan",false);
		CustomerDB.saveCustomer(cust1);
		
		Customer cust2 = new Customer(1002,"John",true);
		CustomerDB.saveCustomer(cust2);
		
		Customer cust3 = new Customer(1003,"Sam",true);
		CustomerDB.saveCustomer(cust3);
		
		Customer cust4 = new Customer(1004,"Raj",false);
		CustomerDB.saveCustomer(cust4);
		
		login.addLogin(1004, "Facebook.com896");
		
		List<Customer> customerList = customerDB.getAllCustomers();
		
		if(customerList.isEmpty()) {
			System.out.println("No Customers in he Bank");
		}
		else {
			printCustomerList(customerList);
		}
		
		Set<Integer> loanAvailedCustomers = customerDB.getLoanAvailedCustomers();
		System.out.println("\nCustomers who have Availed the loan");
		System.out.println("-------------------------------------");
		for(int custId:loanAvailedCustomers) {
			System.out.println(custId);
		}
	}
	public static void printCustomerList(List<Customer> customerList) {
		Iterator<Customer> custIterator = customerList.iterator();
		System.out.println("              Customer Details");
		System.out.println("-------------------------------------------");
		System.out.println("customer Id\tcustomer Name\tLoan"+"Availed");
		while(custIterator.hasNext()) {
			Customer customer = custIterator.next();
			System.out.print(customer.getCustomerId()+"\t\t");
			System.out.print(customer.getCustomerName()+"\t\t");
			String displayString="NO";
			if(customer.isLoanAvailed()) {
				displayString="YES";
			}
			System.out.println(displayString);
		}
	}
}
