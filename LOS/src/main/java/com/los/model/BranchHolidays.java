package com.los.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BRANCH_HOLIDAYS")
public class BranchHolidays {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String weeklyOff;
	private String weekHalfDays;
	 
	public BranchHolidays(Long id, String weeklyOff, String weekHalfDays) {
		super();
		this.id = id;
		this.weeklyOff = weeklyOff;
		this.weekHalfDays = weekHalfDays;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getWeeklyOff() {
		return weeklyOff;
	}
	public void setWeeklyOff(String weeklyOff) {
		this.weeklyOff = weeklyOff;
	}
	public String getWeekHalfDays() {
		return weekHalfDays;
	}
	public void setWeekHalfDays(String weekHalfDays) {
		this.weekHalfDays = weekHalfDays;
	}
	
	public BranchHolidays() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}