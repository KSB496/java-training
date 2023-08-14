package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao dao;

	ArrayList<User> al = new ArrayList<User>();

	public boolean userValid(User user) {
		for (User us : dao.findAll()) {
			if (user.getUname().equals(us.getUname()) && user.getPass().equals(us.getPass())) {
				return true;
			}
		}
		return false;
	}

	public void userRegistered(User user) {
		// al.add(user);
		dao.save(user);
		System.out.println(dao.save(user));
	}

	public List<User> loadAll() {
		// return al;
		return (ArrayList<User>) dao.findAll();
	}

	/*
	 * public boolean findUser(String uname) {
	 * 
	 * for(User u : al) { if(u.getUname().equals(uname)) { return true; } } return
	 * false;
	 */
	public boolean findUser(int id) {
		Optional<User> data = dao.findById(id);
		if (data.isPresent()) {
			return true;
		}
		return false;
	}

	/*
	 * public boolean deleteUser(String uname) { for(User u : al) {
	 * if(u.getUname().equals(uname)) { al.remove(u); return true; } } return false;
	 */
	public boolean deleteUser(int id) {
		Optional<User> data = dao.findById(id);
		if (data.isPresent()) {
			dao.deleteById(id);
			return true;
		}
		return false;
	}

	/*
	 * public boolean updateUser(String name,User user) { for(User us : al) {
	 * if(us.getUname().equals(name)) { us.setUname(user.getUname());
	 * us.setPass(user.getPass()); us.setEmail(user.getEmail());
	 * us.setCity(user.getCity()); return true; } } return false; }
	 */
	public boolean updateUser(User user, int id) {
		dao.updateUser(user.getUname(), user.getEmail(), user.getPass(), user.getCity(), id);
		return true;
	}

}
