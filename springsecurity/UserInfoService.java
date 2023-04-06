package com.bank.bank;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bank.bank.security.Securityentity;
import com.bank.bank.security.Securityrepository;
import com.bank.bank.security.Userinformation;

@Service
public class UserInfoDetailsService implements UserDetailsService {
	
	@Autowired
	private Securityrepository securityrepository;
	
	@Autowired
	private PasswordEncoder passwordencoder;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Securityentity> securityentity = securityrepository.findByUsername(username);
		
		return securityentity.map(Userinformation::new).
				orElseThrow(()->new UsernameNotFoundException("User "+username+" not found!"));	
		
	}
	public String addUser(Securityentity securityentity) {
		securityentity.setPassword(passwordencoder.encode(securityentity.getPassword()));
		securityrepository.save(securityentity);
		return "User added!";
	}

}
