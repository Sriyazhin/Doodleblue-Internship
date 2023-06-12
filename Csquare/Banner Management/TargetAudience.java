package com.csquare.BannerDet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class TargetAudience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int audienceId;

	private String TargetAudience;

	public int getAudienceId() {
		return audienceId;
	}

	public void setAudienceId(int audienceId) {
		this.audienceId = audienceId;
	}

	public String getTargetAudience() {
		return TargetAudience;
	}

	public void setTargetAudience(String targetAudience) {
		this.TargetAudience = targetAudience;
	}

}
