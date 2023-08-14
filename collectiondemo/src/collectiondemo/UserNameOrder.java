package collectiondemo;

import java.util.Comparator;

import com.app.Users;

public class UserNameOrder implements Comparator<Users>{

	@Override
	public int compare(Users o1, Users o2) {
		// TODO Auto-generated method stub
		return o1.getUserName().compareTo(o2.getUserName());

	}

	

}
