package com.los.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
//import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="country_master")

public class CountryMaster {
	@Id
@GeneratedValue(strategy=GenerationType.AUTO)

	private Long id;
	@Column(unique=true)
	private String countryCode;
	@Column(unique=true)
	private String countryName;
	
	
	
	
	
	//@OneToMany( mappedBy = "countrymaster", fetch = FetchType.LAZY)
	
	//private List<StateMaster> statemaster;
	//= new ArrayList<>();
	
	
	
	public CountryMaster() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public CountryMaster(Long id, String countryCode, String countryName) {
		super();
		this.id = id;
		this.countryCode = countryCode;
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "CountryMaster [id=" + id + ", countryCode=" + countryCode + ", countryName=" + countryName + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
}