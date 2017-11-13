package com.jpa.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.emp.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	

	@RequestMapping("/add/{salary}/{team}")
	public void addEmployee(@Param("name") String name, @PathVariable("salary") int salary,
			@RequestParam("city") String city, @PathVariable("team") int team) {
		employeeService.addEmployee(name, salary, city, team);
		
	}
}
