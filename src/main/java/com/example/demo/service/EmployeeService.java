package com.example.demo.service;

import com.example.demo.domain.EmployeePOJO;

public interface EmployeeService {

	EmployeePOJO getEmployee(Integer id);
	
	public void addEmployee (EmployeePOJO e);
	
	
}
