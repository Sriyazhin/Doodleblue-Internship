package com.employee.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity


public class Employee {
	@Id
	@Column(name="empid")
	private int empid;
	//@Column(name="name")
	private String name;
	//@Column(name="mail")
	private String mail;
	
	 @ManyToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name="fk_deptid") 
	  private Department department;
	  
	  @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name="employeeDetails") 
	  private EmployeeDetails employeeDetails;
	  
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	 
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}
	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}
	 
	
	
}
