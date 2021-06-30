package com.tvm.main.service;

import java.util.List;

import com.tvm.main.model.Employee;

public interface EmployeeService {
	public List<Employee> getAll();
	public List<Employee> getByLocation(String location);
	public Employee getById(int id);

}
