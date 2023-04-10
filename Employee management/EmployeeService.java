package com.employee.management.service;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.security.crypto.password.PasswordEncoder;
	import org.springframework.stereotype.Service;

import com.employee.management.entity.EmployeeEntity;
import com.employee.management.entity.Userentity;
import com.employee.management.repository.EmployeeRepository;
import com.employee.management.repository.UserRepository;

	@Service
	public class EmployeeService {
		@Autowired
		private EmployeeRepository employeerepository;
		
		@Autowired
		private UserRepository userRepository;
		
		@Autowired
		private PasswordEncoder passwordEncoder;
		
		public List<EmployeeEntity> saveAllEmployeeDetails(List<EmployeeEntity> employee){
			return employeerepository.saveAll(employee);
		}
		public EmployeeEntity saveEmployeeDetails(EmployeeEntity employee){
			return employeerepository.save(employee);
		}
		public List<EmployeeEntity> getAllEmployeeDetails(){
			return employeerepository.findAll();
		}
		public EmployeeEntity getDetailsById(int id){
			return employeerepository.findById(id).orElse(null);
		}
		public EmployeeEntity getDetailsByName(String name){
			return employeerepository.findByName(name).orElse(null);
		}
		public String deleteEmployee(int id){
			employeerepository.deleteById(id);
			return "Employee removed";
		}
		public EmployeeEntity updateEmployee(EmployeeEntity employee){
			EmployeeEntity current=employeerepository.findById(employee.getEmpid()).orElse(null);
			current.setDept(employee.getName());
			current.setDept(employee.getDept());
			current.setSalary(employee.getSalary());
			current.setContact(employee.getContact());
			return employeerepository.save(current);
			
		}
		public String addUser(Userentity userentity) {
			userentity.setPassword(passwordEncoder.encode(userentity.getPassword()));
			userRepository.save(userentity);
			return "User added";
		}
		

	}
