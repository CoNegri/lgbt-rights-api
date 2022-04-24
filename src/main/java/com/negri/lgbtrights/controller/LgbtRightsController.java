package com.negri.lgbtrights.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.negri.lgbtrights.dto.CountrySummaryDto;
import com.negri.lgbtrights.enums.Continent;
import com.negri.lgbtrights.service.CountryService;

@RestController
@RequestMapping("lgbt-rights")
public class LgbtRightsController {

	CountryService service;

	@Autowired
	public LgbtRightsController(CountryService service) {
		this.service = service;
	}

	@GetMapping("/country/{countryCode}/{rightCode}")
	public ResponseEntity<List<CountrySummaryDto>> getSpecificRight(@PathVariable("countryCode") String countryCode,
			@PathVariable("rightCode") String rightCode) {
		return ResponseEntity.ok(null);
	}

	@GetMapping("/country/{countryCode}")
	public ResponseEntity<CountrySummaryDto> getCountry(@PathVariable("countryCode") String countryCode) {
		CountrySummaryDto countrySummaryDto = this.service.getLgbtRightsByCountry(countryCode);
		return ResponseEntity.ok(countrySummaryDto);
	}

	@GetMapping("/continent/{continent}")
	public ResponseEntity<List<CountrySummaryDto>> getCountriesByContinent(
			@PathVariable("continent") Continent continent) {
		return ResponseEntity.ok(null);
	}

}
