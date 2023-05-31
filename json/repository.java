package com.exchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.exchange.entity.Phones;

@Repository
public interface Phonesrepo extends JpaRepository<Phones, Integer> {

	Phones findByName(String name);

	@Procedure(value = "jsoninout")
	public int fetchCount(String name);

	@Procedure
	public String jsonextract(String name);

}
