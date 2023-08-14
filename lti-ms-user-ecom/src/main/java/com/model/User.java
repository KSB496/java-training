package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

	@Id
	@GeneratedValue
	private int uid;
	private String uname;
	private String pass;
	private String email;
	private String city;
		
	public User(String uname, String pass, String email, String city) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.email = email;
		this.city = city;
	}
	
	public User(String uname, String pass) {
		super();
		this.uname = uname;
		this.pass = pass;
	}
	
}
