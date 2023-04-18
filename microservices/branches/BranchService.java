package com.microservices.branch.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.branch.entity.Branches;
import com.microservices.branch.repository.BranchRepository;
import com.microservices.branch.response.BranchResponse;

@Service
public class BranchService {
	
	@Autowired
	private BranchRepository branchRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	
	public BranchResponse getByIfsc(String ifsc) {
		
		
		Branches branches = branchRepository.findById(ifsc).get();
		BranchResponse branchResponse = modelMapper.map(branches, BranchResponse.class);
		return branchResponse;
	}
	

}
