package com.employee.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.dto.Employeedto;
import com.employee.entity.Depart;
import com.employee.entity.Employe;
import com.employee.entity.EmployeeDet;
import com.employee.repository.DepartmentRepo;
import com.employee.repository.EmployeeDetailsRepo;
import com.employee.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private DepartmentRepo deptRepo;

	@Autowired
	private EmployeeDetailsRepo employeeDetailsRepo;

	public List<Employe> addAllEmployee(List<Employe> employee) {
		return employeeRepo.saveAll(employee);
	}

	public Employe addEmployee(Employe employee) {


		return employeeRepo.save(employee);
	}

	public List<Employe> FindAllEmployee() {
		return employeeRepo.findAll();
	}
	 

	
	  public List<Employeedto> GetByDeptid(int deptid){
		  //List<Employe> empd = GetByDeptid(deptid);
		  List<Employe> employees = employeeRepo.findBydeptid(deptid); 
		  List<Employeedto> employeeDtos = new ArrayList<>();
		  //List<Employe> employe = employees.toArray(null);
		 
		 // List<EmployeeDet> employdet = employeeDetailsRepo.findAllById(empdet.getEmpid());
		  
		  
		  for (Employe employee : employees) {
				
			  
			  Employeedto empdto = new Employeedto();
			  //Optional<EmployeeDet> empdet = employeeDetailsRepo.findById(employee.getEmpid());
			  empdto.setName(employee.getName());
			  empdto.setMail(employee.getMail());
				empdto.setAddress(employee.getEmployeeDetails().getAddress());
				empdto.setSalary(employee.getEmployeeDetails().getSalary());
				employeeDtos.add(empdto);
		  }
		  return employeeDtos;
	  }
	  
	 
	 

}
