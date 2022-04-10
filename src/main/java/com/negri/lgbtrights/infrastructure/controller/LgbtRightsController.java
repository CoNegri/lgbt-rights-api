package com.negri.lgbtrights.infrastructure.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.negri.lgbtrights.domain.CountrySummary;

@RestController(value = "/lgbt-rights")
public class LgbtRightsController {
	
	@GetMapping()
	public ResponseEntity<List<CountrySummary>> getAllCountries(@PathVariable String coutryCode, @PathVariable String rightCode) {
		return ResponseEntity.ok(null);
	}
	
	@GetMapping("/country/{countryCode}")
	public ResponseEntity<CountrySummary> getCountry(@PathVariable String coutryCode) {
		return ResponseEntity.ok(null);
	}
		
	@GetMapping("/continent/{continent}")
	public ResponseEntity<List<CountrySummary>> getCountriesByContinent(@PathVariable String continent) {
		return ResponseEntity.ok(null);
	}
	
}
