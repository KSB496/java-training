package studentdemo;

import java.util.ArrayList;
import java.util.Collections;



public class ArrayListStud {

	public static void main(String[] args) {
		
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		a1.add(new Student(101, "kajal", "CS"));
		a1.add(new Student(102, "kishu", "HR"));
		a1.add(new Student(103, "dax", "Business"));
		a1.add(1,new Student(104, "parth", "management"));

		//a1.remove(2);
		Collections.sort(a1, new StudNameOrder());
		Collections.sort(a1, new StudSubjectOrder());
		
		for (Student em : a1) {
			System.out.println(em);
	}
	}
	
}
