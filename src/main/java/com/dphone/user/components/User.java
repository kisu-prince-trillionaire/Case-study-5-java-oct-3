package com.dphone.user.components;

public class User {
	private String name;
	private int mobileNo;
	private String emailId;
	private String refferalCode;
	private int bonus;

	public User() {
	}

	public User(String name, int mobileNo, String emailId, String refferalCode) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.refferalCode = refferalCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getRefferalCode() {
		return refferalCode;
	}

	public void setRefferalCode(String refferalCode) {
		this.refferalCode = refferalCode;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
