package com.webClient.demoWebclient.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webClient.demoWebclient.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer> {
	
}