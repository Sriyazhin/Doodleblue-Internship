package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeDetdto;
import com.employee.entity.EmployeeDet;
import com.employee.service.EmployeeDetService;

@RestController
public class EmployeeDetController {
	
	@Autowired
	private EmployeeDetService employeeDetService;
	
	
	  @GetMapping("/GetByExperience/{noOfYears}") 
	  public List<EmployeeDetdto> GetByExperience(@PathVariable int noOfYears) {
		   
		  return employeeDetService.FindByExperience(noOfYears); 
		  }
	 
	 

}
