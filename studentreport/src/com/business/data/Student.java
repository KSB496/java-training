package com.business.data;

public class Student {

	private int rollNo;
	private String name;
	private String gender;
	private int maths;
	private int physics;
	private int chem;
	private int cs;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChem() {
		return chem;
	}
	public void setChem(int chem) {
		this.chem = chem;
	}
	public int getCs() {
		return cs;
	}
	public void setCs(int cs) {
		this.cs = cs;
	}
	public Student(int rollNo, String name, String gender, int maths, int physics, int chem, int cs) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;
		this.maths = maths;
		this.physics = physics;
		this.chem = chem;
		this.cs = cs;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", gender=" + gender + ", maths=" + maths + ", physics="
				+ physics + ", chem=" + chem + ", cs=" + cs + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
