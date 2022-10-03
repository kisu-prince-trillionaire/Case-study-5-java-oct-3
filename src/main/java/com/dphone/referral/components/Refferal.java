package com.dphone.referral.components;

import com.dphone.user.components.User;

public class Refferal extends User{
	private String cuponCode;
	private String status;
	private int bonus = 0;

	public Refferal() {
	}

	public Refferal(String cuponCode, int bonus) {
		this.cuponCode = cuponCode;
		this.bonus = bonus;
	}

	public Refferal(String cuponCode, String status, int bonus) {
		this.cuponCode = cuponCode;
		this.status = status;
		this.bonus = bonus;
	}

	public Refferal(String name, int mobileNo, String emailId, String refferalCode) {
		super(name, mobileNo, emailId, refferalCode);
	}

	public String getCuponCode() {
		return cuponCode;
	}

	public void setCuponCode(String cuponCode) {
		this.cuponCode = cuponCode;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
