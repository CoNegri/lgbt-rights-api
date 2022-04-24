package com.negri.lgbtrights.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.negri.lgbtrights.dto.CountrySummaryDto;
import com.negri.lgbtrights.dto.RightInfoDto;
import com.negri.lgbtrights.entity.Country;
import com.negri.lgbtrights.entity.RightInfo;
import com.negri.lgbtrights.repository.CountryRepository;

@Service
public class CountryService implements ICountryService {
	
	CountryRepository repository;
	
	@Autowired
	public CountryService(CountryRepository repository) {
		this.repository = repository;
	}
	
	public CountrySummaryDto getLgbtRightsByCountry(String countryCode) {
		
		Country countryInfo = this.repository.findByCountryCode(countryCode);
		if (countryInfo == null ) 
			return null;
		CountrySummaryDto countrySummary = this.convertToDto(countryInfo);
		return countrySummary;
		
	}
	
	
	private CountrySummaryDto convertToDto(Country country) {
		
		CountrySummaryDto countrySummary = new CountrySummaryDto();
				
		countrySummary.setCountryCode(country.getCountryCode());
		countrySummary.setCountryName(country.getCountryCode());
		countrySummary.setContinent(country.getContinent());
		countrySummary.setLastUpdate(country.getLastTimeUpdated());
		
		List<RightInfoDto> list = country.getRightInfos().stream().map(d -> getRightInfoDto(d)).collect(Collectors.toList());
		
		countrySummary.setRights(list);
		
		return countrySummary;
	
	}
	
	private RightInfoDto getRightInfoDto(RightInfo info) {
		
		RightInfoDto rightInfo = new RightInfoDto();
		
		rightInfo.setCode(info.getRight().getCode());
		rightInfo.setDescription(info.getRight().getDescription());
		rightInfo.setObservation(info.getObservation());
		rightInfo.setStatus(info.isStatus());
		rightInfo.setYearOfImplementation(info.getYearOfImplementation());
		
		return rightInfo;
		
	}
	
	
}
