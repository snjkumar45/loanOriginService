package com.los.dto;

public class AddressDto {
	private String id;
	private String branchCode;
	private String branchType;
	private String postal_zip;
	private String addressLineOne;
	private String addressLineTwo;
	private String branchName;
	private String activeStatus;
	private String district;
	private String country;
	private String location;
	private String mappedBranch;
	private String currency;

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchType() {
		return branchType;
	}

	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}

	public String getPostal_zip() {
		return postal_zip;
	}

	public void setPostal_zip(String postal_zip) {
		this.postal_zip = postal_zip;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMappedBranch() {
		return mappedBranch;
	}

	public void setMappedBranch(String mappedBranch) {
		this.mappedBranch = mappedBranch;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	 

	public AddressDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
