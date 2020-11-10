package com.los.model;
import javax.persistence.*;

import org.hibernate.annotations.Cascade;

//import lombok.Data;

@Entity
@Table(name="State_Master")

public class StateMaster {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(unique=true)
	private String stateCode;
	private String stateName;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private CountryMaster countrymaster;
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "StateMaster [id=" + id + ", stateCode=" + stateCode + ", stateName=" + stateName + ", countrymaster="
				+ countrymaster + "]";
	}
	public StateMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StateMaster(long id, String stateCode, String stateName, CountryMaster countrymaster) {
		super();
		this.id = id;
		this.stateCode = stateCode;
		this.stateName = stateName;
		this.countrymaster = countrymaster;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public CountryMaster getCountrymaster() {
		return countrymaster;
	}
	public void setCountrymaster(CountryMaster countrymaster) {
		this.countrymaster = countrymaster;
	}
	
}
