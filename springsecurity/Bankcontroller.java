package com.bank.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
	
	
	 @GetMapping("/getBankdetails") 
	 @PreAuthorize("hasAuthority('ROLE_MANAGER1')")
	 public List<Bank> findAllBankdet(){ return
	 bankservice.getAllBankdet(); }
	 
	
	@GetMapping("/getBankdetbyid/{accno}")
	@PreAuthorize("hasAuthority('ROLE_MANAGER2')")
	public Bank findTeamsbyid(@PathVariable int accno){
		return bankservice.getBankbyId(accno);
	}
	
	@GetMapping("/getBankdetbyname/{name}")
	public Bank findBankbyname(@PathVariable String name){
		return bankservice.getBankbyName(name);
	}
	
	  @GetMapping("/getnamebyorder/{name}") 
	  @PreAuthorize("hasAuthority('ROLE_ADMIN')")
	  public List<Bank> findnamebyorder(@PathVariable String name){
	  return bankservice.getBynameorder(name); 
	  }
	  
	  @GetMapping("/getifscbyorder/{ifsc}") 

		
	  public List<Bank> findByifsc(@PathVariable String ifsc){
	  return bankservice.getByifscorder(ifsc); 
	  }
	 
	
	@PutMapping("/updateBankdet")
	
	public Bank updateTeam(@RequestBody Bank bankdet) {
		return bankservice.saveBankdet(bankdet);
	}
	
	@DeleteMapping("/delete/{accno}") 
	
	public String deleteTeams(@PathVariable int accno){
		return bankservice.deleteBankdet(accno);
	}

}
