package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.employee;
import com.example.demo.repository.employeeRepository;
import com.example.demo.response.apiResponse;
import com.example.demo.service.employeeService;

@Service
public class employeeServiceImpl implements employeeService {

	@Autowired
	employeeRepository empRepo;
	
	@Override
	public apiResponse creteEmplyee(employee emp) {
		// TODO Auto-generated method stub
		employee employee = new employee();
		employee.setName(emp.getName());
		employee.setAddress(emp.getAddress());
		employee.setSalary(emp.getSalary());
		employee.setPhone(emp.getPhone());
		
		if(empRepo.findByName(emp.getName()) == null) {
		empRepo.save(employee);
		return new apiResponse(true, "Successfully created...");
		}
		else {
			return new apiResponse(false, "Employee already exist...");
		}
	}

	@Override
	public apiResponse updateEmployee(employee emp) {
		// TODO Auto-generated method stub
		employee em = empRepo.findById(emp.getEmpId()).get();
		em.setName(emp.getName());
		em.setAddress(emp.getAddress());
		em.setSalary(emp.getSalary());
		em.setPhone(emp.getPhone());
		
		if(em != null)
			empRepo.save(em);
			return new apiResponse(true, "Successfully updated....!");
	}

	@Override
	public List<employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public employee getOneEmployee(long id) {
		// TODO Auto-generated method stub
		employee emp = empRepo.findById(id).get();
		return emp;
	}

	@Override
	public apiResponse deleteEmployee(long id) {
		// TODO Auto-generated method stub
		employee emp = empRepo.findById(id).get();
		if(emp != null)
			empRepo.delete(emp);
		return new apiResponse(true, "Employee deleted successfully...!");
	}

}
