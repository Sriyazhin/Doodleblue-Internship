package com.exchange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.exchange.entity.Phones;
import com.exchange.repository.Phonesrepo;

import jakarta.persistence.EntityManager;

@Service
public class Phoneservice {
	@Autowired
	private Phonesrepo phonesRepo;

	@Autowired
	private EntityManager em;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@SuppressWarnings("unchecked")
	public List<Phones> quantitycheck() {
		return em.createNamedStoredProcedureQuery("QuantitySort").getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Phones> brandcheck(String name) {
		return em.createNamedStoredProcedureQuery("BrandSort").setParameter("brandname", name).getResultList();
	}

	public int fetchCount(String name) {
		return phonesRepo.fetchCount(name);
	}

	public String Jsonvalues(String names) {

		return phonesRepo.jsonextract(names);
	}
}
