package com.model;

public class SavingAccount implements InterestCalculator {

	private int duration;
	private double roi;
	
	/*public SavingAccount() {
		//super();
		// TODO Auto-generated constructor stub
		System.out.println("Saving Account");
	}*/
	
	public int getDuration() {
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
	}
	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount*roi/duration;
	}
}
