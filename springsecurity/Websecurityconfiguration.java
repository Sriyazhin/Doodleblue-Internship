package com.bank.bank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class Websecurityconfiguration {
	
	@Bean
	  public UserDetailsService userDetailsService(PasswordEncoder encoder) {
		UserDetails manager1 = User.withUsername("Ram")
				.password(encoder.encode("pwd789"))
				.roles("MANAGER1")
				.build();
		UserDetails manager2 = User.withUsername("Yazhini")
				.password(encoder.encode("pwd567"))
				.roles("MANAGER2")
				.build();
		UserDetails admin = User.withUsername("Varsha")
				.password(encoder.encode("pwd345"))
				.roles("ADMIN")
				.build();
		UserDetails abc = User.withUsername("Swathy")
				.password(encoder.encode("pwd123"))
				.roles("USER")
				.build();
		
		return new InMemoryUserDetailsManager(manager1,manager2,admin,abc);
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.csrf().disable()
				.authorizeHttpRequests().requestMatchers("/getnamebyorder/{name}").permitAll()
				.and()
				.authorizeHttpRequests().requestMatchers("/**")
				.authenticated().and().formLogin().and().build();
		
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

}
