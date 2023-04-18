package com.microservices.branch.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BranchConfig {
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
}
