package com.bank.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bankcontroller {
	
	@Autowired
	private Bankservice bankservice;
	
	@PostMapping("/addAllBankDet")
	public List<Bank> addAllBankdet(@RequestBody List<Bank> bank) {
		return bankservice.saveAllBankdet(bank);
	}
	
	@PostMapping("/addBankDet")
	public Bank addBankdet(@RequestBody Bank bank) {
		return bankservice.saveBankdet(bank);
	}
	
	
	 @GetMapping("/getTeams") 
	 public List<Bank> findAllBankdet(){ return
	 bankservice.getAllBankdet(); }
	 
	
	@GetMapping("/getTeamsbyid/{teamno}")
	public Bank findTeamsbyid(@PathVariable int accno){
		return bankservice.getBankbyId(accno);
	}
	
	@GetMapping("/getTeamsbyname/{name}")
	public Bank findBankbyname(@PathVariable String name){
		return bankservice.getBankbyName(name);
	}
	
	
	  @GetMapping("/getnamebyorder/{name}") 
	  public List<Bank> findnamebyorder(@PathVariable String name){
	  return bankservice.getBynameorder(name); 
	  }
	  
	  @GetMapping("/getifscbyorder/{name}") 
	  public List<Bank> findByifsc(@PathVariable String name){
	  return bankservice.getByifscorder(name); 
	  }
	 
	
	@PutMapping("/updateTeam")
	public Bank updateTeam(@RequestBody Bank bankdet) {
		return bankservice.saveBankdet(bankdet);
	}
	
	@DeleteMapping("/delete/{teamno}")
	public String deleteTeams(@PathVariable int accno){
		return bankservice.deleteBankdet(accno);
	}

}
