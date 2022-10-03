package com.dphone.signup.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.dphone.connection.DphoneConnection;
import com.dphone.signup.Login;
import com.dphone.signup.Registration;

public class SignUpDao {
	public int register(Registration registrationData) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		try {
			connection = DphoneConnection.getConnection();
			statement = connection.prepareStatement("INSERT INTO REGISTRATION VALUES(?,?,?)");
			
			String vName = registrationData.getName();
			String vEmail = registrationData.getEmail();
			Long vphone = registrationData.getPhoneNo();
			
			statement.setString(1, vName);
			statement.setString(2, vEmail);
			statement.setLong(3, vphone);
			
			i = statement.executeUpdate();
			
			System.out.println("Name : " + vName + " Email : " + vEmail + " Phone No : " + vphone);
			System.out.println("\n Hello " + vName + " ! \n Registration successful");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return i;
	}
	
	public int updateRegistration(Registration registrationData) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		try {
			connection = DphoneConnection.getConnection();
			
			String vEmail = registrationData.getEmail();
			Long vphone = registrationData.getPhoneNo();
			
			String sql = "UPDATE REGISTRATION SET  PHONE = ? WHERE EMAIL = ?"; 
			statement = connection.prepareStatement(sql);
			
			statement.setLong(1, vphone);
			statement.setString(2, vEmail);
			
			i = statement.executeUpdate(sql);
		} catch(Exception e) {
			System.out.println(e);
		}
		return i;
	}
	
	public int login(Login loginData) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		try {
			connection = DphoneConnection.getConnection();
			statement = connection.prepareStatement("INSERT INTO LOGIN VALUES(?,?)");
			
			String vUserName = loginData.getUserName();
			String vPassword = loginData.getPassword();
			
			statement.setString(1, vUserName);
			statement.setString(2, vPassword);
			
			i = statement.executeUpdate();
			
			System.out.println("Login Successful");
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;

	}
	
	public int updateLogin(Login loginData) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		try {
			connection = DphoneConnection.getConnection();
			
			String vUserName = loginData.getUserName();
			String vPassword = loginData.getPassword();
			
			String sql = "UPDATE LOGIN SET  PASSWORD = ? WHERE USER_NAME = ?"; 
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, vPassword);
			statement.setString(2, vUserName);
			
			i = statement.executeUpdate(sql);
		} catch(Exception e) {
			System.out.println(e);
		}
		return i;
	}
}
