package com.example.demo.controller;

import com.example.demo.domain.EmployeeEntity;
import com.example.demo.service.EmployeeService;
//import com.example.demo.service.impl.EmployeeServiceImpl;

public abstract class EmpStudy implements EmployeeService{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeEntity employee = new EmployeeEntity();
		employee.setName("Senthil");
		employee.setDesignation("TL");
		employee.setAge(30);

//		EmployeeServiceImpl emp = new EmployeeServiceImpl();
//		emp.addEmployee(employee);
		
	}

}
