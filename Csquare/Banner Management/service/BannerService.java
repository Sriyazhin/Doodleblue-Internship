package com.csquare.service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.csquare.BannerDet.BannerDetails;
import com.csquare.BannerDet.Region;
import com.csquare.repository.BannerDetailsRepo;
import com.csquare.repository.RegionRepo;

@Service
public class BannerService {

	@Autowired
	private BannerDetailsRepo bannerDetailsRepo;

	@Autowired
	private RegionRepo regionRepo;

	/*
	 * @Autowired private EntityManager em;
	 */

	public BannerDetails addBanner(BannerDetails bannerDetails) {

		LocalTime time = LocalTime.now();
		bannerDetails.setCreatedTime("" + time);

		return bannerDetailsRepo.save(bannerDetails);
	}

	public ResponseEntity<List<BannerDetails>> fetchAllBanner() {
		List<BannerDetails> ban = bannerDetailsRepo.findAll();
		BannerDetails banner = new BannerDetails();
		List<BannerDetails> ben = new ArrayList<>();
		for (BannerDetails bann : ban) {
			boolean flagg = bann.isFlag();
			// Iterable<Integer> id = bann.getBannerID();
			if (!flagg) {
				banner = bannerDetailsRepo.findById(bann.getBannerID()).orElse(null);
				ben.add(banner);
			}
		}
		return ResponseEntity.ok(ben);

		// return em.createNamedStoredProcedureQuery("fetchall").getResultList();
	}

	public ResponseEntity<BannerDetails> fetchBanner(int id) {
		BannerDetails ban = bannerDetailsRepo.findById(id).orElse(null);
		boolean flagg = ban.isFlag();
		if (!flagg) {
			return ResponseEntity.ok(ban);
		} else {
			return ResponseEntity.noContent().build();
		}

		// return
		// em.createNamedStoredProcedureQuery("fetchById").setParameter("bannerId",
		// id).getResultList();
	}

	public BannerDetails updateBanner(BannerDetails bannerDetails) {
		BannerDetails editBanner = bannerDetailsRepo.findById(bannerDetails.getBannerID()).orElse(null);
		editBanner.setBannerTitle(bannerDetails.getBannerTitle());
		editBanner.setBannerDescription(bannerDetails.getBannerDescription());
		editBanner.setBannerType(bannerDetails.getBannerType());
		editBanner.setBannerSize(bannerDetails.getBannerSize());
		editBanner.setBannerStartDate(bannerDetails.getBannerStartDate());
		editBanner.setBannerEndDate(bannerDetails.getBannerEndDate());
		editBanner.setBannerStartTime(bannerDetails.getBannerStartTime());
		editBanner.setBannerEndTime(bannerDetails.getBannerEndTime());
		editBanner.setTargetAudience(bannerDetails.getTargetAudience());
		editBanner.setImageUpload(bannerDetails.getImageUpload());
		editBanner.setCtaUrl(bannerDetails.getCtaUrl());
		editBanner.setRotDirection(bannerDetails.getRotDirection());
		editBanner.setRotFrequency(bannerDetails.getRotFrequency());
		editBanner.setCreatedBy(bannerDetails.getCreatedBy());
		editBanner.setEditedBy(bannerDetails.getEditedBy());

		LocalTime time = LocalTime.now();
		editBanner.setEditedTime("" + time);

		return bannerDetailsRepo.save(editBanner);
	}

	public String deleteBanner(int id) {
		BannerDetails softDelete = bannerDetailsRepo.findById(id).orElse(null);
		softDelete.setFlag(true);
		return "Banner removed";
	}

	public BannerDetails assignRegion(int banid, int regid) {
		List<Region> region = null;
		BannerDetails ben = bannerDetailsRepo.findById(banid).get();

		Region reg = regionRepo.findById(regid).get();
		region = ben.getRegion();
		region.add(reg);
		ben.setRegion(region);

		return bannerDetailsRepo.save(ben);
	}

}
