package com.los.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BRANCH_MASTER")
public class BranchMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String address;
	@OneToOne(cascade = CascadeType.ALL)
	private CommunicationDetails communicationDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private BranchTimings branchTimings;
	@OneToOne(cascade = CascadeType.ALL)
	private BranchHolidays branchHolidays;
	@Override
	public String toString() {
		return "BranchMaster [id=" + id + ", address=" + address + ", communicationDetails=" + communicationDetails
				+ ", branchTimings=" + branchTimings + ", branchHolidays=" + branchHolidays + "]";
	}
	public BranchMaster(Long id, String address, CommunicationDetails communicationDetails, BranchTimings branchTimings,
			BranchHolidays branchHolidays) {
		super();
		this.id = id;
		this.address = address;
		this.communicationDetails = communicationDetails;
		this.branchTimings = branchTimings;
		this.branchHolidays = branchHolidays;
	}
	public BranchMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public CommunicationDetails getCommunicationDetails() {
		return communicationDetails;
	}
	public void setCommunicationDetails(CommunicationDetails communicationDetails) {
		this.communicationDetails = communicationDetails;
	}
	public BranchTimings getBranchTimings() {
		return branchTimings;
	}
	public void setBranchTimings(BranchTimings branchTimings) {
		this.branchTimings = branchTimings;
	}
	public BranchHolidays getBranchHolidays() {
		return branchHolidays;
	}
	public void setBranchHolidays(BranchHolidays branchHolidays) {
		this.branchHolidays = branchHolidays;
	}
	

}
