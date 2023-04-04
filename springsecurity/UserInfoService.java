package com.bank.bank;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserInfoDetailsService implements UserDetailsService {
	
	@Autowired
	private Securityrepository securityrepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Securityentity> securityentity = securityrepository.findByUsername(username);
		
		return securityentity.map(Userinformation::new).
				orElseThrow(()->new UsernameNotFoundException("User "+username+" not found!"));
	
		
	}

}
