package com.employee.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.employee.dto.Employeedto;
import com.employee.entity.Department;
import com.employee.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	
	
	@Query(value ="SELECT e.name,e.mail,ed.address,ed.no_of_years FROM employee e join department d on e.fk_deptid=d.deptid join employee_details ed on e.empid=ed.empid where d.deptid=:id", nativeQuery = true)
	List<Employee> findBydeptid(@Param("id") int id);

	
	  
	 

}
