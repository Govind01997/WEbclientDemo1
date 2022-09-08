package com.webClient.demoWebclient.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webClient.demoWebclient.entity.EmployeeEntity;
import com.webClient.demoWebclient.serviceImpl.ServiceImpl;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmployeeController {
	
	 @Autowired
	 ServiceImpl subjectService;

	    // @GetMapping("/subject/{id}")
	    // public Mono<EmployeeEntity> getSubject(@PathVariable String id) {
	    //     return subjectService.getSubjectById(id);
	    // }

	    @GetMapping("/org")
	    public Flux<EmployeeEntity> getSubjects() {
	        return subjectService.getSubject();
	    }
		@PostMapping("/orgcreate")
	    public Mono<EmployeeEntity> addEmployee(@RequestBody EmployeeEntity empl) {
			System.out.println("insideController-------------");
	        return subjectService.create(empl);
	    }
}
