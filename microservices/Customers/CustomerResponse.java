package com.microservices.response;


public class CustomerResponse {

	private int id;
	private String name;
	private String contact;
	private String accounType;
	private String ifsc;
	private Branchresponse branches;
	
	
	
	
	public Branchresponse getBranchresponse() {
		return branches;
	}
	public void setBranchresponse(Branchresponse branches) {
		this.branches = branches;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAccounType() {
		return accounType;
	}
	public void setAccounType(String accounType) {
		this.accounType = accounType;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
	
	
	
}
