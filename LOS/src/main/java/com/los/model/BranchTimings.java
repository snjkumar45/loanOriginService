package com.los.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BRANCH_TIMING")
public class BranchTimings {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String branchTimingTo;
	private String branchTimingFrom;
	public BranchTimings() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
 
}
