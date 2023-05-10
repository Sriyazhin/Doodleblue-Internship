package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.dto.EmployeeDetdto;
import com.employee.entity.Employe;
import com.employee.entity.EmployeeDet;

@Repository
public interface EmployeeDetailsRepo extends JpaRepository<EmployeeDet, Integer> {

	List<EmployeeDet> findAllById(int empid);

	
	

}
