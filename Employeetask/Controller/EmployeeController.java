package com.employee.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.Employeedto;
import com.employee.entity.Depart;
import com.employee.entity.Employe;
import com.employee.entity.EmployeeDet;
import com.employee.repository.DepartmentRepo;
import com.employee.repository.EmployeeDetailsRepo;
import com.employee.repository.EmployeeRepo;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	  @Autowired private DepartmentRepo departrepo;
	  
	  @Autowired private EmployeeDetailsRepo empdrepo;
	 
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@PostMapping("/AddAllEmployee")
	public List<Employe> SaveAllEmployee(@RequestBody List<Employe> employee) {
		return employeeService.addAllEmployee(employee);
	}

	@PostMapping("/AddEmployee")
	public Employe SaveEmployee(@RequestBody Employe employee) {
		return employeeService.addEmployee(employee);
	}

	@GetMapping("/FindAllEmployee")
	public List<Employe> FindAll() {
		return employeeService.FindAllEmployee();
	}

	@GetMapping("/FindEmployee/{deptid}")

	public List<Employeedto> GetByDeptid(@PathVariable int deptid) {
		 return employeeService.GetByDeptid(deptid);
		

	}

}
