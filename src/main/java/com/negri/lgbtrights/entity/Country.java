package com.negri.lgbtrights.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.negri.lgbtrights.enums.Continent;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_country")
public class Country {
	
	@Id
	@Column(name = "country_code")
	private String countryCode;
	
	@NotNull
	@Column(name = "name")
	private String name;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "continent")
	private Continent continent;
	
	@NotNull
	@Column(name = "last_update")
	private Date lastTimeUpdated;
	
	@OneToMany(mappedBy = "country")
	private Set<RightInfo> rightInfos;

}
