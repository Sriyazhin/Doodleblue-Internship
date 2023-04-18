package com.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.entity.Customers;
import com.microservices.repository.CustomersRepository;
import com.microservices.response.CustomerResponse;
import com.microservices.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("customers/{name}")
	ResponseEntity<CustomerResponse> findByName(@PathVariable("name") String name) {
		CustomerResponse customerResponse = customerService.getByName(name);
		return ResponseEntity.status(HttpStatus.OK).body(customerResponse);
	}

}
