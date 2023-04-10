package com.employee.management.securityconfiguration;

	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.security.core.userdetails.UserDetails;
	import org.springframework.security.core.userdetails.UserDetailsService;
	import org.springframework.security.core.userdetails.UsernameNotFoundException;
	import org.springframework.stereotype.Component;

import com.employee.management.entity.Userentity;
import com.employee.management.repository.UserRepository;


	@Component
	public class UserInfoUserDetailsService implements UserDetailsService{
		
		@Autowired
		private UserRepository userRepository;
		
		

		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			Optional<Userentity> userinfo = userRepository.findByUsername(username);
			return userinfo.map(UserInfoUserDetails:: new).orElseThrow(()-> new UsernameNotFoundException("User not found"));
			
		}
		
		



	}
