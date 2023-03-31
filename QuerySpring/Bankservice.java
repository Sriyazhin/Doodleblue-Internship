package com.bank.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class Bankservice {

	@Autowired
	private Bankrepository bankrepository;
	
	public List<Bank> saveAllBankdet(List<Bank> bank){
		return bankrepository.saveAll(bank);
	}
	public Bank saveBankdet(Bank bank){
		return bankrepository.save(bank);
	}
	public List<Bank> getAllBankdet(){
		return bankrepository.findAll();
	}
	public Bank getBankbyId(int id){
		return bankrepository.findById(id).orElse(null);
	}
	public Bank getBankbyName(String name){
		return bankrepository.findByName(name).orElse(null);
	}
	
	
   public List<Bank> getBynameorder(String name){ 
	   return bankrepository.findnameordered(name);
	  }
   public List<Bank> getByifscorder(String ifsc){ 
	   return bankrepository.findByifsc(ifsc);
	  }
	 
	public String deleteBankdet(int id) {
		bankrepository.deleteById(id);
		return "Bank details of "+id+" removed!!";
	}
	public Bank updateBankdet(Bank bank) {
		Bank current= bankrepository.findById(bank.getAccno()).orElse(null);
		bankrepository.findByName(bank.getName());
		bankrepository.findById(bank.getBalance());
		bankrepository.findByName(bank.getIfsc());
		return bankrepository.save(current);
		
	}
}
