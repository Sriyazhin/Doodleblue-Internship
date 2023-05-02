package com.employee.management.controller;

	import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.entity.Authreq;
import com.employee.management.entity.EmployeeEntity;
import com.employee.management.entity.Userentity;
import com.employee.management.service.EmployeeService;
import com.employee.management.service.Jwtservice;


	
	@RestController
	@EnableCaching
	public class EmployeeController{
		
		Logger logger = LoggerFactory.getLogger(EmployeeController.class);
		@Autowired
		private EmployeeService employeeservice;
		
		@Autowired
	    private Jwtservice jwtService;
		
		@Autowired
	    private AuthenticationManager authenticationManager;
		
		@PostMapping("/AddAllEmployee")
		public List<EmployeeEntity> addAllEmployee(@RequestBody List<EmployeeEntity> employeeEntity){
			logger.info("Add Employee details now!!");
			return employeeservice.saveAllEmployeeDetails(employeeEntity);		
		}
		@PostMapping("/AddEmployee")
		public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employeeEntity){
			return employeeservice.saveEmployeeDetails(employeeEntity);
		}
		@PostMapping("/AddUser")
		public String addNewUser(@RequestBody Userentity userentity){   
			return employeeservice.addUser(userentity);		
		}
		@GetMapping("/GetEmployee")
		@Cacheable(value="employees")
		public List<EmployeeEntity> findAllEmployee(){
			logger.info("Fetching Employee details!!");
			return employeeservice.getAllEmployeeDetails();
		}
		@GetMapping("/GetEmployeeId/{empid}")
		@PreAuthorize("hasAuthority('ROLE_ADMIN')")
		public EmployeeEntity findEmployeeById(@PathVariable int empid){
			return employeeservice.getDetailsById(empid);		
		}
		@GetMapping("/GetEmployeebyName/{name}")
		@PreAuthorize("hasAuthority('ROLE_MANAGER')")
		public EmployeeEntity findEmployeeByName(@PathVariable String name){
			return employeeservice.getDetailsByName(name);		
		}
		@DeleteMapping("/DeleteEmployee/{id}")
		@CacheEvict(value="employees", key="#id")
		@PreAuthorize("hasAuthority('ROLE_ADMIN')")
		public String deleteEmployeeById(@PathVariable int id) {
			return employeeservice.deleteEmployee(id);
		}
		@PutMapping("/UpdateEmployee")
		public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity){
			return employeeservice.saveEmployeeDetails(employeeEntity);
		}
		@PostMapping("/Authenticate")
		public String authenticateandGetToken(@RequestBody Authreq authreq){
			Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authreq.getUsername(),authreq.getPassword()));
			if(authenticate.isAuthenticated()) {
				logger.info("User authenticated!!");
				return jwtService.generateToken(authreq.getUsername());
			}else {
				
				throw new UsernameNotFoundException("User not found");
			}			
		}
	}
