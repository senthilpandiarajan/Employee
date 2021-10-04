package com.example.demo.domain;

public class EmployeeMapper {
	
	public EmployeePOJO EntitytoPOJO(EmployeeEntity emp) {
		EmployeePOJO emplPojo = new EmployeePOJO();
		
		emplPojo.setAge(emp.getAge());
		emplPojo.setDesignation(emp.getDesignation());
		emplPojo.setId(emp.getId());
		emplPojo.setName(emp.getName());
		
		return emplPojo;
	}

	public EmployeeEntity POJOtoEntity(EmployeePOJO emp) {
		EmployeeEntity emplPojo = new EmployeeEntity();
		
		emplPojo.setAge(emp.getAge());
		emplPojo.setDesignation(emp.getDesignation());
		emplPojo.setId(emp.getId());
		emplPojo.setName(emp.getName());
		
		return emplPojo;
	}

}
