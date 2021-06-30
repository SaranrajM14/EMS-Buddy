package com.tvm.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvm.main.model.Employee;
import com.tvm.main.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getAll() {
		
		return this.employeeRepository.findAll();
	}

	@Override
	public List<Employee> getByLocation(String location) {
		
		return this.employeeRepository.findByLocation(location);
	}

	@Override
	public Employee getById(int id) {
		Optional<Employee> optional=this.employeeRepository.findById(id);
		Employee employee=null;
		if(optional.isPresent()) {
			employee=optional.get();
		}
		
		return employee;
	}

}
