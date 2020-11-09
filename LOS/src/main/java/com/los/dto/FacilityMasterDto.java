package com.los.dto;

public class FacilityMasterDto {

	private String id;
	private String facilityCode;
	private String caplimit;
	private String thresholdLimit;
	private String effectiveFrom;
	private String loanType;
	private String activeStatus;
	private String facilityType;
	private String capUtilized;
	private String effectiveTill;
	

	public FacilityMasterDto() {
		super();
	}
	public FacilityMasterDto(String id, String facilityCode,String caplimit,
			String thresholdLimit,String effectiveFrom,String loanType,String activeStatus,
			String facilityType,String capUtilized,String effectiveTill) {
		super();
		this.id=id;
		this.activeStatus=activeStatus;
		this.caplimit=caplimit;
		this.capUtilized=capUtilized;
		this.effectiveFrom=effectiveFrom;
		this.effectiveTill=effectiveTill;
		this.facilityCode=facilityCode;
		this.facilityType=facilityType;
		this.loanType=loanType;
		this.thresholdLimit=thresholdLimit;
		
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
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

	public String getEffectiveTill() {
		return effectiveTill;
	}

	public void setEffectiveTill(String effectiveTill) {
		this.effectiveTill = effectiveTill;
	}

	

}