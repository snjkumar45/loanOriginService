package com.los.dto;

public class BranchTimingsDto {
	private String id;

	private String branchTimingTo;
	private String branchTimingFrom;

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getBranchTimingTo() {
		return branchTimingTo;
	}

	public void setBranchTimingTo(String branchTimingTo) {
		this.branchTimingTo = branchTimingTo;
	}

	public String getBranchTimingFrom() {
		return branchTimingFrom;
	}

	public void setBranchTimingFrom(String branchTimingFrom) {
		this.branchTimingFrom = branchTimingFrom;
	}



	public BranchTimingsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
