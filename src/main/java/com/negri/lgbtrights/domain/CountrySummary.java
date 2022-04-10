package com.negri.lgbtrights.domain;

import java.io.Serializable;
import java.util.List;

public class CountrySummary implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private CountryProfile countryProfile;
	private List<RightInfo> rights;
	
	public CountryProfile getCountryProfile() {
		return countryProfile;
	}
	
	public void setCountryProfile(CountryProfile countryProfile) {
		this.countryProfile = countryProfile;
	}
	
	public List<RightInfo> getRights() {
		return rights;
	}
	
	public void setRights(List<RightInfo> rights) {
		this.rights = rights;
	}
	
	
	
	
}
