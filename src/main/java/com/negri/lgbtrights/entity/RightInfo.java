package com.negri.lgbtrights.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.Getter;

@Getter
@Entity
@Table(name = "tb_right_info")
public class RightInfo  {
	
	@EmbeddedId
	private RightInfoKey rightInfoKey;
	
	@ManyToOne
	@MapsId("countryId")
	@JoinColumn(name = "country_code")
	private Country country;
	
	@ManyToOne
	@MapsId("rightId")
	@JoinColumn(name = "right_id")
	private Right right;
	
	@Column(name = "status")
	private boolean status;
	
	@Column(name = "year_implementation")
	private int yearOfImplementation;
	
	@Column(name = "observation")
	private String observation;

}
