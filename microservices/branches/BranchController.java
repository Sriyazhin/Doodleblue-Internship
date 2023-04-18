package com.microservices.branch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.branch.response.BranchResponse;
import com.microservices.branch.service.BranchService;

@RestController
public class BranchController {
	@Autowired
	private BranchService branchService;
	
	@GetMapping("branches/{ifsc}")
	ResponseEntity<BranchResponse> findByIfsc(@PathVariable("ifsc") String ifsc) {
		BranchResponse branchResponse = branchService.getByIfsc(ifsc);
		return ResponseEntity.status(HttpStatus.OK).body(branchResponse);
	}

}
