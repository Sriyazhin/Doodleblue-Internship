package com.microservices.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.microservices.entity.Customers;
import com.microservices.response.CustomerResponse;

@Repository
public interface CustomersRepository extends JpaRepository<Customers,Integer>{

	Customers findByName(String name);
	
	@Query(value = "SELECT * FROM customers c INNER JOIN branches b ON c.ifsc = b.ifsc WHERE c.name=:name", nativeQuery = true)
	Customers getEmployeejoin(@Param("name") String name);

	
}
