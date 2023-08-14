package com.seed.DB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.seed.customer.Customer;

public class CustomerDB {

	private static List<Customer> customerList = new ArrayList<Customer>();
	
	public static boolean saveCustomer(Customer customer) {
		boolean status = false;
		status = customerList.add(customer);
		return status;
	}
	
	public List<Customer> getAllCustomers(){
		return customerList;
	}
	
	public Set<Integer> getLoanAvailedCustomers(){
		Set<Integer> loanAvailedCustomers = new TreeSet<Integer>();
		Iterator<Customer> customerIterator = customerList.iterator();
		while(customerIterator.hasNext()) {
			Customer customer = customerIterator.next();
			if(customer.isLoanAvailed()) {
				loanAvailedCustomers.add(customer.getCustomerId());
			}
		}
		return loanAvailedCustomers;
	}
}
