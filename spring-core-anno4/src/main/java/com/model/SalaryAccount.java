package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class SalaryAccount implements InterestCalculator {

	@Value(value="9")
	private int duration;
	@Value(value="9")
	private double roi;
	
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