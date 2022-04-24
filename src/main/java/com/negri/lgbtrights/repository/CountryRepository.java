package com.negri.lgbtrights.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.negri.lgbtrights.entity.Country;
import com.negri.lgbtrights.enums.Continent;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

	Country findByCountryCode(String countryCode);
	
	List<Country> findByContinent(Continent continent);
	
}
