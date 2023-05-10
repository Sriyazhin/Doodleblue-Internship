package com.employee.dto;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.employee.entity.Depart;
import com.employee.entity.Employe;
import com.employee.entity.EmployeeDet;

import lombok.Data;
import lombok.ToString;

public class Employeedto {
	private String name;
	private String mail;
	private String address;
	private double salary;
	
	
	
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double d) {
		this.salary = d;
	}
	
	
	

	
}
