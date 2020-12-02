package com.los.dto;

public class BranchMasterDto {
	private String id;

	private String address;

	private CommunicationDetailsDto communicationDetails;

	private BranchTimingsDto branchTimings;

	private BranchHolidaysDto branchHolidays;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public CommunicationDetailsDto getCommunicationDetails() {
		return communicationDetails;
	}

	public void setCommunicationDetails(CommunicationDetailsDto communicationDetails) {
		this.communicationDetails = communicationDetails;
	}

	public BranchTimingsDto getBranchTimings() {
		return branchTimings;
	}

	public void setBranchTimings(BranchTimingsDto branchTimings) {
		this.branchTimings = branchTimings;
	}

	public BranchHolidaysDto getBranchHolidays() {
		return branchHolidays;
	}

	public void setBranchHolidays(BranchHolidaysDto branchHolidays) {
		this.branchHolidays = branchHolidays;
	}
 
}
