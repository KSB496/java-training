package com.service;

import com.model.InterestCalculator;

public class BankingService {

	private InterestCalculator ic;	
	
	public BankingService(InterestCalculator ic) {
		super();
		this.ic = ic;
	}
	
	public double service(double amount) {
		return ic.calculate(amount);
	}
	
	public void init() {
		System.out.println("inside init..");
	}
	
	public void destroy() {
		System.out.println("inside destroy..");
	}
	
}
