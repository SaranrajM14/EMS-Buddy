package com.tvm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tvm.main.model.Employee;
import com.tvm.main.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/buddy")
	public List<Employee> buddy(){
		return this.employeeService.getAll();
	}
	@GetMapping("/buddy/{location}")
	public List<Employee> buddyByLocation(@PathVariable String location){
		return this.employeeService.getByLocation(location);
	}
	@GetMapping("/buddy/{id}")
	public Employee employeeById(@PathVariable int id) {
		return this.employeeService.getById(id);
	}
	

}
