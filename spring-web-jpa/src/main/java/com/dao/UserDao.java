package com.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer>{
	@Transactional
	@Modifying
	@Query("update User set uname=:uname, email=:email, pass=:pass, city=:city where uid=:id")
	public Integer updateUser(String uname, String email, String pass, String city, int id);

}
