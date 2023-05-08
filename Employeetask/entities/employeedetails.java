package com.employee.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Table(name="employeeDetails")
public class EmployeeDetails {
	@Id
	@Column(name="empid")
	private int empid;
	//@Column(name="address")
	private String address;
	//@Column(name="salary")
	private double salary;
	//@Column(name="noOfYears")
	private int noOfYears;
	
	
	
	/*
	 * @OneToOne private Employee employee;
	 * 
	 * 
	 * public Employee getEmployee() { return employee; } public void
	 * setEmployee(Employee employee) { this.employee = employee; }
	 */
	 
	 
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getNoOfYears() {
		return noOfYears;
	}
	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}
	
	
	
	
}
