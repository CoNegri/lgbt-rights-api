package com.negri.lgbtrights.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.negri.lgbtrights.dto.CountrySummaryDto;

@RestController(value = "/lgbt-rights")
public class LgbtRightsController {

	@GetMapping("/country/{countryCode}/{rightCode}")
	public ResponseEntity<List<CountrySummaryDto>> getSpecificRight(@PathVariable String coutryCode,
			@PathVariable String rightCode) {
		return ResponseEntity.ok(null);
	}

	@GetMapping("/country/{countryCode}")
	public ResponseEntity<CountrySummaryDto> getCountry(@PathVariable String coutryCode) {
		return ResponseEntity.ok(null);
	}

	@GetMapping("/continent/{continent}")
	public ResponseEntity<List<CountrySummaryDto>> getCountriesByContinent(@PathVariable String continent) {
		return ResponseEntity.ok(null);		
	}

}
