package com.bank.bank;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

	@Entity
	@Table(name="banking")
	@NamedQuery(name = "Bank.findByifsc", query = "SELECT b from BANK b WHERE u.ifsc = :ifsc ORDER BY b.name")
	public class Bank {
		@Id
		@GeneratedValue
		private int accno;
		private String name;
		private int balance;
		private String ifsc;
		
		public Bank() {
		}
		
		public Bank(int accno, String name, int balance, String ifsc) {
			this.accno = accno;
			this.name = name;
			this.balance = balance;
			this.ifsc = ifsc;
		}    
		
		public int getAccno() {
			return accno;
		}
		public void setAccno(int accno) {
			this.accno = accno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		public String getIfsc() {
			return ifsc;
		}
		public void setIfsc(String ifsc) {
			this.ifsc = ifsc;
		}
		
		

	}

