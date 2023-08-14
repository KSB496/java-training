package com.java.employees.controllers;


import java.util.Arrays;
import java.util.List;


import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.java.employees.model.Employee;
import com.java.employees.services.EmployeeService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(EmployeeController.class)
public class EmpControllerTest {

	@MockBean
	EmployeeService service;
	@Autowired
	MockMvc mvc;
	@Test
	public void testUserFind() throws Exception {
		Employee emp = new Employee("jane", "xyz");
		List<Employee> employees = Arrays.asList(emp);
		Mockito.when(service.findAll()).thenReturn(employees);
		mvc.perform(MockMvcRequestBuilders.get("/employee"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(1)))
		.andExpect(MockMvcResultMatchers.jsonPath("$[0].firstName", Matchers.is("jane")));
	}
}
