package com.employee.management.repository;

	import java.util.Optional;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.employee.management.entity.EmployeeEntity;

	@Repository
	public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer>{



		Optional<EmployeeEntity> findById(int id);

		Optional<EmployeeEntity> findByName(String name);

	}



