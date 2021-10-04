package com.example.demo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.EmployeeEntity;
import com.example.demo.domain.EmployeeMapper;
import com.example.demo.domain.EmployeePOJO;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	EmployeeMapper empMap = new EmployeeMapper();
	
	
	
	@Override
	public EmployeePOJO getEmployee(Integer id) {
		// TODO Auto-generated method stub
		EmployeeEntity temp = employeeRepository.findById(id).orElse(null);
		return empMap.EntitytoPOJO(temp);
	}

	@Override
	public void addEmployee(EmployeePOJO e) {
		// TODO Auto-generated method stub

		employeeRepository.save(empMap.POJOtoEntity(e));
	}

}
