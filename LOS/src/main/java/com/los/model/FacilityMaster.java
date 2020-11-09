package com.los.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FACILITY_MASTER")
public class FacilityMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String facilityCode;
	private String caplimit;
	private String thresholdLimit;
	private String effectiveFrom;
	private String loanType;
	private String facilityType;
	private String capUtilized;
	private String activeStatus;
	private String effectiveTill;
	

	public FacilityMaster() {
		super();

	}

	public FacilityMaster(Long id,String facilityCode, String caplimit, String thresholdLimit, String effectiveFrom,
			String loanType, String facilityType, String capUtilized, String activeStatus, String effectiveTill) {
		super();
		this.id=id;
		this.facilityCode = facilityCode;
		this.caplimit = caplimit;
		this.thresholdLimit = thresholdLimit;
		this.effectiveFrom = effectiveFrom;
		this.loanType = loanType;
		this.activeStatus = activeStatus;
		this.facilityType = facilityType;
		this.capUtilized = capUtilized;
		this.effectiveTill = effectiveTill;
		
	}

	public String getFacilityCode() {
		return facilityCode;
	}

	public void setFacilityCode(String facilityCode) {
		this.facilityCode = facilityCode;
	}

	public String getCaplimit() {
		return caplimit;
	}

	public void setCaplimit(String caplimit) {
		this.caplimit = caplimit;
	}

	public String getThresholdLimit() {
		return thresholdLimit;
	}

	public void setThresholdLimit(String thresholdLimit) {
		this.thresholdLimit = thresholdLimit;
	}

	public String getEffectiveFrom() {
		return effectiveFrom;
	}

	public void setEffectiveFrom(String effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getFacilityType() {
		return facilityType;
	}

	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}

	public String getCapUtilized() {
		return capUtilized;
	}

	public void setCapUtilized(String capUtilized) {
		this.capUtilized = capUtilized;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getEffectiveTill() {
		return effectiveTill;
	}

	public void setEffectiveTill(String effectiveTill) {
		this.effectiveTill = effectiveTill;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "FacilityMaster [id=" + id + ", facilityCode=" + facilityCode + ", caplimit=" + caplimit
				+ ", thresholdLimit=" + thresholdLimit + ", effectiveFrom=" + effectiveFrom + ", loanType=" + loanType
				+ ", facilityType=" + facilityType + ", capUtilized=" + capUtilized + ", activeStatus=" + activeStatus
				+ ", effectiveTill=" + effectiveTill + "]";
	}

	}