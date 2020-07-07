package com.example.demo.service;

import java.util.List;

import com.example.demo.model.employee;
import com.example.demo.response.apiResponse;

public interface employeeService {

	public apiResponse creteEmplyee(employee emp);
	
	public apiResponse updateEmployee(employee emp);
	
	public List<employee> getAllEmployees();
	
	public employee getOneEmployee(long id);
	
	public apiResponse deleteEmployee(long id);
}
