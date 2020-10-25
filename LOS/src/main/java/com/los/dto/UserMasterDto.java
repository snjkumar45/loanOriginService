package com.los.dto;

public class UserMasterDto {

	private String id;

	private String loginId;

	private String firstName;

	private String lastName;

	private String emailId;

	private String mobileNo;

	private String activeStatus;

	private String isAdmin;

	private String autoLogin;
	
	private String ssoLogin;
	
	private String branchCode;

	public UserMasterDto() {
		super();
	}

	public UserMasterDto(String id, String loginId, String firstName,
			String lastName, String emailId, String mobileNo,
			String activeStatus, String isAdmin, String autoLogin,
			String ssoLogin, String branchCode) {
		super();
		this.id = id;
		this.loginId = loginId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.activeStatus = activeStatus;
		this.isAdmin = isAdmin;
		this.autoLogin = autoLogin;
		this.ssoLogin = ssoLogin;
		this.branchCode = branchCode;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getAutoLogin() {
		return autoLogin;
	}

	public void setAutoLogin(String autoLogin) {
		this.autoLogin = autoLogin;
	}

	public String getSsoLogin() {
		return ssoLogin;
	}

	public void setSsoLogin(String ssoLogin) {
		this.ssoLogin = ssoLogin;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	
}
