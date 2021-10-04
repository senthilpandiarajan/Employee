package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.EmployeePOJO;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService emp;
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	EmployeePOJO getEmployee(@PathVariable Integer id) {
		return emp.getEmployee(id);
	}
	
	@RequestMapping(value = "/addemployee", method = RequestMethod.POST)
	public void addEmployee (@RequestBody EmployeePOJO employee) {
		emp.addEmployee(employee);
	}

}
