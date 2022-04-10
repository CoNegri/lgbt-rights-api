package com.negri.lgbtrights.domain;

import java.io.Serializable;

public class RightInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String code;
	private String description;
	private boolean status;
	private int yearOfImplementation;
	private String observation;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getYearOfImplementation() {
		return yearOfImplementation;
	}

	public void setYearOfImplementation(int yearOfImplementation) {
		this.yearOfImplementation = yearOfImplementation;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

}
