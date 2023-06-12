package com.csquare.BannerDet;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Region {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int regionId;

	private String regions;

	@JsonIgnore
	@ManyToMany(mappedBy = "region", fetch = FetchType.LAZY)
	private List<BannerDetails> bannerDetails = new ArrayList<>();

	public List<BannerDetails> getBannerDetails() {
		return bannerDetails;
	}

	public void setBannerDetails(List<BannerDetails> bannerDetails) {
		this.bannerDetails = bannerDetails;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getRegions() {
		return regions;
	}

	public void setRegions(String regions) {
		this.regions = regions;
	}

}
