package com.employee.management.repository;

	import java.util.Optional;

	import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.management.entity.Userentity;

	public interface UserRepository extends JpaRepository<Userentity,Integer>{

		Optional<Userentity> findByUsername(String username);

		

	}



