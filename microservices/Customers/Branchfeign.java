package com.microservices.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.branch.response.BranchResponse;
import com.microservices.response.Branchresponse;

@FeignClient(name="branch",url="http://localhost:8080/customers-app/api")
public interface Branchfeign {
	@GetMapping("branches/{ifsc}")
	ResponseEntity<Branchresponse> findByIfsc(@PathVariable("ifsc") String ifsc) ;
}
