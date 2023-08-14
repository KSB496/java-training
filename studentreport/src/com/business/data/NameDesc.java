package com.business.data;

import java.util.Comparator;

public class NameDesc implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
		
	}

}
