package com.negri.lgbtrights.dto;

import lombok.Data;

@Data
public class RightInfoDto {
	
	private String code;
	private String description;
	private boolean status;
	private int yearOfImplementation;
	private String observation;
	
}
