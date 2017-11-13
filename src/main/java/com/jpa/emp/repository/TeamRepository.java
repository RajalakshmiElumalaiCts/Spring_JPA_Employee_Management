package com.jpa.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.emp.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {

}
