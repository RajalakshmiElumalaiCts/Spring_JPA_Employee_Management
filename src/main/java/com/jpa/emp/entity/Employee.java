package com.jpa.emp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Entity(name="employee")
public class Employee {
	
	public Employee(String name, int salary, String city, Team team) {
		this.name = name;
		this.salary = salary;
		this.city = city;
		this.team = team;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column
	private long salary;
	
	@Column
	private String city;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private Team team;

}
