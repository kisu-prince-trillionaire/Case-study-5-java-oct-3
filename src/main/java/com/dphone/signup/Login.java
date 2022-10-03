package com.dphone.signup;

public class Login {
	private String userName;
	private String password;

	public Login() {
		System.out.println("Try logging in with the right credentials !");
	}

	public Login(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
