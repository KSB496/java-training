package com.java.employees.services;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.java.employees.dao.EmployeeRepository;
import com.java.employees.model.Employee;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {

	@InjectMocks
	EmployeeService service;
	@Mock
	EmployeeRepository repository;
	
	public void init() {
		MockitoAnnotations.openMocks(this);
	}
	@Test
	public void serviceTest() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("alex","alex"));
		list.add(new Employee("paul","John"));
		list.add(new Employee("sameer","reddy"));
		
		Mockito.when(repository.findAll()).thenReturn(list);
		List<Employee> empList = service.findAll();
		assertEquals(3, empList.size());
	
	}
	
	@Test
	public void serviceSaveTest() {
		Employee employee = new Employee("admin", "manager");
		
		service.save(employee);
		Mockito.verify(repository, Mockito.times(1)).save(employee);
	}
	
}
