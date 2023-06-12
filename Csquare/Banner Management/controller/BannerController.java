package com.csquare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.csquare.BannerDet.BannerDetails;
import com.csquare.service.BannerService;

import jakarta.transaction.Transactional;

@RestController
public class BannerController {
	@Autowired
	private BannerService bannerService;

	@PostMapping("/addingBanner")
	public BannerDetails saveBanner(@RequestBody BannerDetails bannerDetails) {
		return bannerService.addBanner(bannerDetails);
	}

	@GetMapping("/findAllBanner")
	public ResponseEntity<List<BannerDetails>> getAllBanner() {
		return bannerService.fetchAllBanner();
	}

	@GetMapping("/findBanner/{id}")
	public ResponseEntity<BannerDetails> getBanner(@PathVariable int id) {
		return bannerService.fetchBanner(id);
	}

	@PutMapping("/editBanner")
	public BannerDetails editBanner(@RequestBody BannerDetails bannerDetails) {
		return bannerService.updateBanner(bannerDetails);
	}

	@PutMapping("{banid}/editregion/{regid}")
	public BannerDetails editBanner(@PathVariable int banid, @PathVariable int regid) {
		return bannerService.assignRegion(banid, regid);
	}

	@DeleteMapping("/deleteBanner/{id}")
	@Transactional
	public String removeBanner(@PathVariable int id) {
		return bannerService.deleteBanner(id);
	}

}
