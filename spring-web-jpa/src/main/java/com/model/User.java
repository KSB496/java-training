package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private int uid;
	private String uname;
	private String pass;
	private String email;
	private String city;
	
	public User(int uid, String uname, String pass, String email, String city) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.pass = pass;
		this.email = email;
		this.city = city;
	}
	public int getuId() {
		return uid;
	}
	public void setuId(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public User(String uname, String pass, String email, String city) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.email = email;
		this.city = city;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", pass=" + pass + ", email=" + email + ", city=" + city + "]";
	}
	public User(String uname, String pass) {
		super();
		this.uname = uname;
		this.pass = pass;
	}
	
}
