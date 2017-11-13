package com.jpa.emp.repository;

import org.springframework.data.repository.CrudRepository;

import com.jpa.emp.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
