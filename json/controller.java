package com.exchange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exchange.entity.Phones;
import com.exchange.service.Phoneservice;

@RestController
public class Phonescontroller {

	@Autowired
	private Phoneservice ps;

	@GetMapping("/quantity")
	public List<Phones> getQuantity() {
		return ps.quantitycheck();
	}

	@GetMapping("/brand/{name}")
	public List<Phones> getBrand(@PathVariable String name) {
		return ps.brandcheck(name);
	}

	@GetMapping("/count/{name}")
	public int findCount(@PathVariable String name) {
		return ps.fetchCount(name);
	}

	@GetMapping("/prop/{names}")
	public String Jsonvalues(@PathVariable String names) {
		return ps.Jsonvalues(names);
	}

}
