package com.employee.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.entity.Depart;
import com.employee.entity.Employe;

@Repository
public interface DepartmentRepo extends JpaRepository<Depart, Integer>{


}
