package com.bank.bank;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Securityrepository extends JpaRepository<Securityentity,Integer>{

	Optional<Securityentity> findByUsername(String username);

}
