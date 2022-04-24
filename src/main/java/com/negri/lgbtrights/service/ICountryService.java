package com.negri.lgbtrights.service;

import com.negri.lgbtrights.dto.CountrySummaryDto;

public interface ICountryService {
	CountrySummaryDto getLgbtRightsByCountry(String countryCode);
}
