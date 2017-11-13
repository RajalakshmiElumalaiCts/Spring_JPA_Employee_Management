package com.jpa.emp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.jpa.emp.entity.Employee;
import com.jpa.emp.entity.Team;
import com.jpa.emp.repository.EmployeeRepository;
import com.jpa.emp.repository.TeamRepository;
import com.jpa.emp.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private TeamRepository teamRepository;
	@Override
	public void addEmployee(String name, int salary, String city, int teamId) {
		Team team = teamRepository.findOne(teamId);
		Employee employee = new Employee(name, salary, city, team);
		employeeRepository.save(employee);
	}

}
