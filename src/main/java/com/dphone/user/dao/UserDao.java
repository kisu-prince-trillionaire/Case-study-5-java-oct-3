package com.dphone.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dphone.connection.DphoneConnection;
import com.dphone.user.components.User;

public class UserDao {
	public int addRefferal(User userData) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		try {
			connection = DphoneConnection.getConnection();
			statement = connection.prepareStatement("INSERT INTO USER VALUES(?,?,?,?)");

			String vName = userData.getName();
			int vmobile = userData.getMobileNo();
			String vEmail = userData.getEmailId();
			String vReferralCode = userData.getRefferalCode();

			statement.setString(1, vName);
			statement.setInt(2, vmobile);
			statement.setString(3, vEmail);
			statement.setString(4, vReferralCode);

			i = statement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}

	public int editReferral(User userData) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		try {
			connection = DphoneConnection.getConnection();

			int vmobile = userData.getMobileNo();
			String vEmail = userData.getEmailId();

			String sql = "UPDATE USER SET  MOBILE = ? WHERE EMAIL = ?";
			statement = connection.prepareStatement(sql);

			statement.setInt(1, vmobile);
			statement.setString(2, vEmail);

			i = statement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}

	public int viewReferral(User userData) {
		int i = 0;
		
		PreparedStatement statement = null;
		Connection connection = null;
		
		ResultSet res = null;
		try {
			connection = DphoneConnection.getConnection();
			String sql = "SELECT * FROM USER";
			statement = connection.prepareStatement(sql);

			res = statement.executeQuery(sql);
			while (res.next()) {
				System.out.println(
						res.getString(1) + "  " + res.getInt(2) + "  " + res.getString(3) + " " + res.getString(4));

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}

	public int deleteReferral(User userData) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		try {
			connection = DphoneConnection.getConnection();

			String vEmail = userData.getEmailId();

			String sql = "DELETE FROM USER WHERE EMAIL = ?";
			statement = connection.prepareStatement(sql);

			statement.setString(1, vEmail);

			i = statement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}
}
