package com.model;

public class FixedAccount implements InterestCalculator {

	private int duration;
	private double roi;
	
	/*public FixedAccount() {
		//super();
		// TODO Auto-generated constructor stub
		System.out.println("Fixed Account");
	}*/
	
	public FixedAccount(int duration, double roi) {
		super();
		this.duration = duration;
		this.roi = roi;
	}
	/*public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getRoi() {
		return roi;
	}
	
	public void setRoi(double roi) {
		this.roi = roi;
	}*/
	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount*roi/duration;
	}
	
	
}
