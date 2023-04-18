package com.microservices.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.branch.response.BranchResponse;
import com.microservices.entity.Customers;
import com.microservices.repository.CustomersRepository;
import com.microservices.response.Branchresponse;
import com.microservices.response.CustomerResponse;

@Service
public class CustomerService {
	
	@Autowired
	private CustomersRepository customerRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	
	
	  @Autowired private RestTemplate restTemplate;
	  
	  public CustomerResponse getByName(String name) { 
		  
	  Customers customers = customerRepository.findByName(name); 
	  CustomerResponse customerResponse = modelMapper.map(customers, CustomerResponse.class);
	  String ifsc = customers.getIfsc(); 
	  Branchresponse branchresponse = restTemplate.getForObject("http://localhost:8081/branches/{ifsc}",Branchresponse.class,ifsc);
	  
	  customerResponse.setBranchresponse(branchresponse); 
	  return customerResponse;
	  }
	 

	
	
	

}
