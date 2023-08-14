package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.model.InterestCalculator;

@Service("service")
@Lazy
public class BankingService {

	@Autowired
	@Qualifier("sa")
	private InterestCalculator ic;	
	
	
	public InterestCalculator getIc() {
		return ic;
	}

	public void setIc(InterestCalculator ic) {
		this.ic = ic;
	}

	public double service(double amount) {
		return ic.calculate(amount);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("inside init..");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("inside destroy..");
	}
	
}
