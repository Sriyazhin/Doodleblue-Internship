package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;
import com.employee.entity.EmployeeDetails;

@Repository
public interface EmployeeDetailsRepo extends JpaRepository<EmployeeDetails, Integer> {

	

}
