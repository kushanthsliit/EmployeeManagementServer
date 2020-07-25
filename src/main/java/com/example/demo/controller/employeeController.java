package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.employee;
import com.example.demo.response.apiResponse;
import com.example.demo.service.employeeService;

@RestController
@RequestMapping("api/employee")
@CrossOrigin(origins = "http://localhost:4200")
public class employeeController {

	@Autowired
	employeeService employeeService;
	
	@PostMapping("/createEmployee")
	public @ResponseBody apiResponse creteEmplyee(@RequestBody employee emp) {
		return employeeService.creteEmplyee(emp);
	}
	
	@PutMapping("/updateEmployee")
	public @ResponseBody apiResponse updateEmplyee(@RequestBody employee emp) {
		return employeeService.updateEmployee(emp);
	}
	
	@GetMapping("/getAllEmployees")
	public @ResponseBody List<employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/getOneEmployee/{id}")
	public @ResponseBody employee getOneEmployee(@PathVariable  long id) {
		return employeeService.getOneEmployee(id);
	}
	
	@DeleteMapping("/deleteEmplyee/{id}")
	public @ResponseBody apiResponse deleteEmployee(@PathVariable long id) {
		return employeeService.deleteEmployee(id);
	}
}
