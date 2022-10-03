package com.dphone.refferal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.dphone.connection.DphoneConnection;
import com.dphone.referral.components.Refferal;
import com.dphone.user.components.User;

public class RefferalDao {
	public int addBonus(Refferal refferalData) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		try {
			connection = DphoneConnection.getConnection();
			statement = connection.prepareStatement("INSERT INTO REFERRAL_DATA VALUES(?,?,?)");

			String vName = refferalData.getName();
			int vmobile = refferalData.getMobileNo();
			String vEmail = refferalData.getEmailId();

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
	public void buyPhone(Refferal refferal) {
		try  {
			
//			Scanner sc = new Scanner(System.in);
//			String choice;
//			System.out.println("Hey " + super.getName());
//			System.out.println("You have an exciting offer for the brand new phone");
//			System.out.println("Do you want to buy this new amazing phone ");
//			choice = sc.next();
//			if (choice.equalsIgnoreCase("yes")) {
//				bonus = +1000;
//				System.out.println("Enter the cupon code ");
//				this.cuponCode = sc.next();
//				System.out.println("You have got a discount of 20%");
//				String choice2;
//				System.out.println("People who buy this phone also buy the Back cover with a 5% discount");
//				System.out.println("Do you want to buy the cover with the phone");
//				choice2 = sc.next();
//				if (choice2.equalsIgnoreCase("yes")) {
//					System.out.println("You have a great choice");
//					bonus = +1000;
//				} else {
//					System.out.println("You missed the offer");
//				}
//				
//			} else {
//				System.out.println("You neglected a precious deal");
//			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void viewBonus() {
		System.out.println("You have a bonus of : " + bonus);
	}
}
