package com.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {
	
	@Transactional
	@Modifying
	@Query("update Student set rollno=:rollno, schoolname=:schoolname, subject=:subject, totalmarks=:totalmarks where sid=:id")
	public Integer updateStudent(int rollno, String schoolname, String subject, double totalmarks, int id);
	
}
