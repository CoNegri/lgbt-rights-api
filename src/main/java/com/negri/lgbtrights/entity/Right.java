package com.negri.lgbtrights.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;

@Getter
@Entity
@Table(name = "tb_right")
public class Right {
	
	@Id
	@Column(name = "code")
	private String code;
	
	@Column(name = "description")
	private String description;

	@OneToMany(mappedBy = "right")
	private Set<RightInfo> rightInfos;
	
}
