package com.employee.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.employee.dto.Employeedto;
import com.employee.entity.Depart;
import com.employee.entity.Employe;
import com.employee.entity.EmployeeDet;

@Repository
public interface EmployeeRepo extends JpaRepository<Employe, Integer>{
	
	@Query(" FROM Employe e join Depart d on e.department=d.deptid join EmployeeDet ed on e.empid=ed.id where d.deptid=:deptid ")
	List<Employe> findBydeptid(@Param("deptid") int deptid);

	@Query(" FROM Employe e join Depart d on e.department=d.deptid join EmployeeDet ed on e.empid=ed.id where ed.noOfYears>:noOfYears ")
	List<Employe> findByNoOfYears(@Param("noOfYears") int noOfYears);
	
	  
	 

}
