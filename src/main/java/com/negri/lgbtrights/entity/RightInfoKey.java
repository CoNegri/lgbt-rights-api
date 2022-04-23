package com.negri.lgbtrights.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RightInfoKey implements Serializable {

	private static final long serialVersionUID = 7153900344672591325L;
	
	@Column(name = "country_code")
	private String countryId;
	
	@Column(name = "right_id")
	private String rightId;
	
}
