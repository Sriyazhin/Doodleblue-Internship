package com.microservices.branch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.branch.entity.Branches;

@Repository
public interface BranchRepository extends JpaRepository<Branches,String>{

}
