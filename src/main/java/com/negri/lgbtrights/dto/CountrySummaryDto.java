package com.negri.lgbtrights.dto;

import java.util.Date;
import java.util.List;

import com.negri.lgbtrights.enums.Continent;

import lombok.Data;

@Data
public class CountrySummaryDto {
	
	private String countryCode;
	private String countryName;
	private Continent continent;
	private Date lastUpdate;
	List<RightInfoDto> rights;
	
}
