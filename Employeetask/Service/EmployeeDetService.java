package com.employee.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dto.EmployeeDetdto;
import com.employee.entity.Employe;
import com.employee.entity.EmployeeDet;
import com.employee.repository.EmployeeDetailsRepo;
import com.employee.repository.EmployeeRepo;

@Service
public class EmployeeDetService {

	@Autowired
	private EmployeeRepo employerepo;

	
	  public List<EmployeeDetdto> FindByExperience(int noOfYears) { 
		  List<Employe> employeeDetails = employerepo.findByNoOfYears(noOfYears);
		  List<EmployeeDetdto> employeeDetDto = new ArrayList<>();
		  for(Employe employe : employeeDetails) {
			  EmployeeDetdto edd = new EmployeeDetdto();
			  edd.setName(employe.getName());
			  edd.setMail(employe.getMail());
			  edd.setDeptname(employe.getDepartment().getDeptName());
			  edd.setAddress(employe.getEmployeeDetails().getAddress());
			  edd.setSalary(employe.getEmployeeDetails().getSalary());
			  employeeDetDto.add(edd);
		  }
		  return employeeDetDto;
	  
	 }
	 
}
