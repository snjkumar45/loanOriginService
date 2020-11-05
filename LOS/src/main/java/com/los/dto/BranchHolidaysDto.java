package com.los.dto;

public class BranchHolidaysDto {
	 private String id;
	private String weeklyOff;
	private String weekHalfDays;
	public BranchHolidaysDto(String id, String weeklyOff, String weekHalfDays) {
		super();
		this.id = id;
		this.weeklyOff = weeklyOff;
		this.weekHalfDays = weekHalfDays;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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

}
