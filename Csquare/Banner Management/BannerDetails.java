package com.csquare.BannerDet;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.Table;

@Entity
@Table

/*
 * @NamedStoredProcedureQueries({
 * 
 * @NamedStoredProcedureQuery(name = "fetchById", procedureName =
 * "fetchActiveBanner", parameters = {
 * 
 * @StoredProcedureParameter(mode = ParameterMode.IN, name = "bannerId", type =
 * Integer.class),
 * 
 * @StoredProcedureParameter(mode = ParameterMode.OUT, name = "output", type =
 * String.class) }),
 * 
 * @NamedStoredProcedureQuery(name = "fetchall", procedureName =
 * "fetchallActiveBanner"),
 * 
 * @NamedStoredProcedureQuery(name = "FlagChange", procedureName = "softDelete",
 * parameters = {
 * 
 * @StoredProcedureParameter(mode = ParameterMode.IN, name = "banId", type =
 * Integer.class) }) })
 */

public class BannerDetails {

	private String merchantID;

	private String c2Code;

	@Column(nullable = false)
	private String bannerTitle;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bannerID;

	private String bannerDescription;

	@Column(nullable = false)
	private String bannerType;

	@Column(nullable = false)
	private String bannerSize;

	private String bannerStartDate;

	private String bannerStartTime;

	private String bannerEndDate;

	private String bannerEndTime;

	private boolean flag;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_bannerDet")
	private List<ImageUpload> imageUpload;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_bannerDet")
	private List<TargetAudience> targetAudience;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_bannerDet")
	private List<TargetAudienceExcept> audienceException;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "banner-region", joinColumns = {
			@JoinColumn(name = "bid", referencedColumnName = "bannerID") }, inverseJoinColumns = {
					@JoinColumn(name = "rid", referencedColumnName = "regionId") })
	private List<Region> region = new ArrayList<>();

	private String ctaUrl;

	private String rotDirection;

	private int rotFrequency;

	private boolean enableTimer;

	private String startTime;

	private String timerDuration;

	private String createdBy;

	private String editedBy;

	private String createdTime;

	private String editedTime;

	public String getMerchantID() {
		return merchantID;
	}

	public void setMerchantID(String merchantID) {
		this.merchantID = merchantID;
	}

	public String getC2Code() {
		return c2Code;
	}

	public void setC2Code(String c2Code) {
		this.c2Code = c2Code;
	}

	public String getBannerTitle() {
		return bannerTitle;
	}

	public void setBannerTitle(String bannerTitle) {
		this.bannerTitle = bannerTitle;
	}

	public int getBannerID() {
		return bannerID;
	}

	public void setBannerID(int bannerID) {
		this.bannerID = bannerID;
	}

	public String getBannerDescription() {
		return bannerDescription;
	}

	public void setBannerDescription(String bannerDescription) {
		this.bannerDescription = bannerDescription;
	}

	public String getBannerType() {
		return bannerType;
	}

	public void setBannerType(String bannerType) {
		this.bannerType = bannerType;
	}

	public String getBannerSize() {
		return bannerSize;
	}

	public void setBannerSize(String bannerSize) {
		this.bannerSize = bannerSize;
	}

	public String getBannerStartDate() {
		return bannerStartDate;
	}

	public void setBannerStartDate(String bannerStartDate) {
		this.bannerStartDate = bannerStartDate;
	}

	public String getBannerStartTime() {
		return bannerStartTime;
	}

	public void setBannerStartTime(String bannerStartTime) {
		this.bannerStartTime = bannerStartTime;
	}

	public String getBannerEndDate() {
		return bannerEndDate;
	}

	public void setBannerEndDate(String bannerEndDate) {
		this.bannerEndDate = bannerEndDate;
	}

	public String getBannerEndTime() {
		return bannerEndTime;
	}

	public void setBannerEndTime(String bannerEndTime) {
		this.bannerEndTime = bannerEndTime;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public List<ImageUpload> getImageUpload() {
		return imageUpload;
	}

	public void setImageUpload(List<ImageUpload> imageUpload) {
		this.imageUpload = imageUpload;
	}

	public List<TargetAudience> getTargetAudience() {
		return targetAudience;
	}

	public void setTargetAudience(List<TargetAudience> targetAudience) {
		this.targetAudience = targetAudience;
	}

	public List<TargetAudienceExcept> getAudienceException() {
		return audienceException;
	}

	public void setAudienceException(List<TargetAudienceExcept> audienceException) {
		this.audienceException = audienceException;
	}

	public List<Region> getRegion() {
		return region;
	}

	public void setRegion(List<Region> region) {
		this.region = region;
	}

	public String getCtaUrl() {
		return ctaUrl;
	}

	public void setCtaUrl(String ctaUrl) {
		this.ctaUrl = ctaUrl;
	}

	public String getRotDirection() {
		return rotDirection;
	}

	public void setRotDirection(String rotDirection) {
		this.rotDirection = rotDirection;
	}

	public int getRotFrequency() {
		return rotFrequency;
	}

	public void setRotFrequency(int rotFrequency) {
		this.rotFrequency = rotFrequency;
	}

	public boolean isEnableTimer() {
		return enableTimer;
	}

	public void setEnableTimer(boolean enableTimer) {
		this.enableTimer = enableTimer;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTimerDuration() {
		return timerDuration;
	}

	public void setTimerDuration(String timerDuration) {
		this.timerDuration = timerDuration;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getEditedBy() {
		return editedBy;
	}

	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getEditedTime() {
		return editedTime;
	}

	public void setEditedTime(String editedTime) {
		this.editedTime = editedTime;
	}

}
