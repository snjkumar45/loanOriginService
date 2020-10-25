package com.los.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_MASTER")
public class UserMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String loginId;

	private String firstName;

	private String lastName;

	private String emailId;

	private String mobileNo;

	private String activeStatus;

	private boolean isAdmin;

	private boolean autoLogin;
	
	private boolean ssoLogin;
	
	private String branchCode;
	
	public UserMaster() {
		super();
	}

	public UserMaster(Long id, String loginId, String firstName,
			String lastName, String emailId, String mobileNo,
			String activeStatus, boolean isAdmin, boolean autoLogin, boolean ssoLogin, 
			String branchCode) {
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public boolean isAutoLogin() {
		return autoLogin;
	}

	public void setAutoLogin(boolean autoLogin) {
		this.autoLogin = autoLogin;
	}
	
	public boolean isSsoLogin() {
		return ssoLogin;
	}

	public void setSsoLogin(boolean ssoLogin) {
		this.ssoLogin = ssoLogin;
	}
	
	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	
	@Override
	public String toString() {
		return "UserMaster [id=" + id + ", loginId=" + loginId + ", firstName="
				+ firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", mobileNo=" + mobileNo + ", activeStatus=" + activeStatus
				+ ", isAdmin=" + isAdmin + ", autoLogin=" + autoLogin + "]";
	}

}
