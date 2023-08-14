package studentdemo;

import java.util.Comparator;

public class StudSubjectOrder implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getStuSubject().compareTo(o2.getStuSubject());
	}

}
