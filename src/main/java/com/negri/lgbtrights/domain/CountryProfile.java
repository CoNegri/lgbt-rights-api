package com.negri.lgbtrights.domain;

import java.io.Serializable;

public class CountryProfile implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String continent;
	private String isoAlpha2Code;
	private String isoAlpha3Code;
	private String isoNumericCode;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getIsoAlpha2Code() {
		return isoAlpha2Code;
	}

	public void setIsoAlpha2Code(String isoAlpha2Code) {
		this.isoAlpha2Code = isoAlpha2Code;
	}

	public String getIsoAlpha3Code() {
		return isoAlpha3Code;
	}

	public void setIsoAlpha3Code(String isoAlpha3Code) {
		this.isoAlpha3Code = isoAlpha3Code;
	}

	public String getIsoNumericCode() {
		return isoNumericCode;
	}

	public void setIsoNumericCode(String isoNumericCode) {
		this.isoNumericCode = isoNumericCode;
	}
	

}
