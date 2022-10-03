package com.dphone.tester;

import com.dphone.signup.Login;
import com.dphone.signup.Registration;
import com.dphone.signup.dao.SignUpDao;

public class TestSignUp {

	public static void main(String[] args) {
		register();
		updateRegistration();
		login();
		updateLogin();
	}
	
	public static void register() {
		try {
			Registration registrationData = new Registration("vishal kumar", "vishal@gmail.com", 62031599);
			SignUpDao testSignUp = new SignUpDao();
			int i = testSignUp.register(registrationData);
			if (i > 0) {
				System.out.println("Registration Data Inserted");
			} else {
				System.out.println("Registration data Not Inserted");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public static void updateRegistration() {
		try {
			Registration registrationData = new Registration("vishal kumar", "vishal@gmail.com", 62031599);
			SignUpDao testSignUp = new SignUpDao();
			int i = testSignUp.updateRegistration(registrationData);
			if (i > 0) {
				System.out.println("Registration Data Inserted");
			} else {
				System.out.println("Registration data Not Inserted");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void login() {
		try {
			Login loginData = new Login("admin", "admin");
			SignUpDao testSignUp = new SignUpDao();
			int i = testSignUp.login(loginData);
			if (i > 0) {
				System.out.println("Login Data Inserted");
			} else {
				System.out.println("Login data Not Inserted");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void updateLogin() {
		try {
			Login loginData = new Login("admin", "admin");
			SignUpDao testSignUp = new SignUpDao();
			int i = testSignUp.updateLogin(loginData);
			if (i > 0) {
				System.out.println("Login Data Inserted");
			} else {
				System.out.println("Login data Not Inserted");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

