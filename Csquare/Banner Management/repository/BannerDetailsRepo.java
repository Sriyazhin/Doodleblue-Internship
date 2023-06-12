package com.csquare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csquare.BannerDet.BannerDetails;

@Repository
public interface BannerDetailsRepo extends JpaRepository<BannerDetails, Integer> {

	/*
	 * @Procedure(value = "FlagChange") public String deleteBanner(int banId);
	 */

	/*
	 * @Procedure(name = "fetchById") public String findBanner(int bannerId);
	 * 
	 * @Procedure(value = "fetchallActiveBanner") public List<Object>
	 * findAllBanner();
	 */
}
