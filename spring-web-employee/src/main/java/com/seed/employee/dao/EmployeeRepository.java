package com.seed.employee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seed.employee.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
