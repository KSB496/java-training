package com.java.employees.dao;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.java.employees.model.Employee;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class EmployeeDaoTest {

	@Autowired
	EmployeeRepository repository;
	@Test
	public void testCreate() {
		Employee employee = new Employee("admin", "manager");
		repository.save(employee);
		Iterable<Employee> emps = repository.findAll();
		Assertions.assertThat(emps).extracting(Employee :: getFirstName).contains("admin");
		repository.deleteAll();
		Assertions.assertThat(repository.findAll()).isEmpty();
	}
	
}
