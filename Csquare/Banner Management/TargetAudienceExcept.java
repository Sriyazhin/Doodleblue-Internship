package com.csquare.BannerDet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class TargetAudienceExcept {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int exceptionId;

	private String AudienceEx;

	public int getExceptionId() {
		return exceptionId;
	}

	public void setExceptionId(int exceptionId) {
		this.exceptionId = exceptionId;
	}

	public String getAudienceEx() {
		return AudienceEx;
	}

	public void setAudienceEx(String audienceEx) {
		this.AudienceEx = audienceEx;
	}

}
