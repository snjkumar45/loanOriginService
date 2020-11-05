package com.los.dto;

public class BranchMasterDto {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private AddressDto address;

	private CommunicationDetailsDto communicationDetails;

	private BranchTimingsDto branchTimings;

	private BranchHolidaysDto branchHolidays;

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
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

	
	public BranchMasterDto() {
		super();
	}

}
