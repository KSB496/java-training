package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Student {

	@Id
	@GeneratedValue
	private int sid;
	private int rollno;
	private String schoolname;
	private String subject;
	private double totalmarks;
	private String uname;
	private String pass;
	private String email;
	private String city;
	
}
