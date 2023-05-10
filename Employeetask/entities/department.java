package com.employee.entity;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name="department")

public class Depart {
	@Id
	@GeneratedValue
	@Column(name="deptid")
	private int deptid;
	@Column(name="deptName")
	private String deptName;
	@Column(name="deptMail")
	private String deptMail;
	
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
	
	private List<Employe> employee;
	
	
	public List<Employe> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employe> employee) {
		this.employee = employee;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
		
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptMail() {
		return deptMail;
	}
	public void setDeptMail(String deptMail) {
		this.deptMail = deptMail;
	}
	
	
	
	 
	
	

	
}
