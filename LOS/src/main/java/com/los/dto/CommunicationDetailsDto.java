package com.los.dto;

public class CommunicationDetailsDto {
	private String id;
	private String telephone;
	private String faxNumber;
	private String swiftAddress;

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getSwiftAddress() {
		return swiftAddress;
	}

	public void setSwiftAddress(String swiftAddress) {
		this.swiftAddress = swiftAddress;
	}

	
}
