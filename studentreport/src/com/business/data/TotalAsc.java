package com.business.data;

import java.util.Comparator;

public class TotalAsc implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int t1 = o1.getMaths()+o1.getChem()+o1.getPhysics()+o1.getCs();
		int t2 = o2.getMaths()+o2.getChem()+o2.getPhysics()+o2.getCs();
		
		if(t1 == t2) {
			return 0;
		}
		else if(t1>t2) {
			return 1;
		}
		else 
			return -1;
	}

}
