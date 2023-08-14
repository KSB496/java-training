package com.seed.employee.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seed.employee.Employee;
import com.seed.employee.dao.EmployeeRepository;
import com.seed.employee.exception.EmployeeNotFoundException;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;
	
	public Optional<Employee> getEmployeeById(int id){
		Optional<Employee> employeeOptional = (Optional<Employee>)repository.findById(id);
		if(employeeOptional.isPresent()) {
			return employeeOptional;
		}
		throw new EmployeeNotFoundException("Employee not found for given id ") ;
	}
}
