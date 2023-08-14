package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.User;

@Service
public class UserService {

	ArrayList<User> al = new ArrayList<User>();
	public boolean userValid(User user) {
		for(User us : al) {
		if(user.getUname().equals(us.getUname()) && user.getPass().equals(us.getPass())) {
			return true;
		}
		}
		return false;
	}
	
	public void userRegistered(User user) {
		al.add(user);
		System.out.println(al);
	}
	
	public List<User> loadAll(){
		return al;
	}
	
	public boolean findUser(String uname) {
		for(User u : al) {
			if(u.getUname().equals(uname)) {
				return true;
			}
		}
		return false;
	}
	public boolean deleteUser(String uname) {
		for(User u : al) {
			if(u.getUname().equals(uname)) {
				al.remove(u);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateUser(String name,User user) {
		for(User us : al) {
			if(us.getUname().equals(name)) {
				us.setUname(user.getUname());
				us.setPass(user.getPass());
				us.setEmail(user.getEmail());
				us.setCity(user.getCity());
				return true;
			}
		}
		return false;
	}
	
}
