package com.exchange.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.Table;

@Entity
@Table

@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name = "QuantitySort", procedureName = "availability"),
		@NamedStoredProcedureQuery(name = "BrandSort", procedureName = "brand", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "brandname", type = String.class) }) })

/*
 * @NamedStoredProcedureQuery(name = "featurenames", procedureName =
 * "jsonextract", parameters = {
 * 
 * @StoredProcedureParameter(mode = ParameterMode.IN, name = "names", type =
 * Integer.class),
 * 
 * @StoredProcedureParameter(mode = ParameterMode.OUT, name = "models", type =
 * String.class), })
 */

public class Phones {

	@Id
	private int id;
	private String name;
	private int quantity;
	@Column(columnDefinition = "json")
	private String features;

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
