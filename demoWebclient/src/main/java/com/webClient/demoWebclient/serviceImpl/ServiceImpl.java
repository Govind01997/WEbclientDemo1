package com.webClient.demoWebclient.serviceImpl;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.webClient.demoWebclient.entity.EmployeeEntity;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class ServiceImpl  {
	
	
	@Autowired
	WebClient webClient;

	// public Mono<EmployeeEntity> getemp() {
	// 	return webClient.get()
	// 			.uri("employee")
	// 			.retrieve()
	// 			.bodyToMono(EmployeeEntity.class);
	// }
 
	public Flux<EmployeeEntity> getSubject() {
		return webClient.get()
				.uri("/employee")
				.retrieve()
				.bodyToFlux(EmployeeEntity.class);
	}
	 
	public Mono<EmployeeEntity> create(EmployeeEntity empl)
	{
		System.out.println("insideServiceIMPL-------------");
		return webClient.post()
				.uri("/employee/send")
				.body(Mono.just(empl), EmployeeEntity.class)
				.retrieve()
				.bodyToMono(EmployeeEntity.class)
		.timeout(Duration.ofMillis(10_000));
		
		
	}
	
}
