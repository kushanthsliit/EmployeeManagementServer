package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.employee;

@Repository
public interface employeeRepository extends JpaRepository<employee, Long> {
	
	employee findByName(String name);
}
