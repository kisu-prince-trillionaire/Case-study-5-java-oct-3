package com.dphone.tester;

import com.dphone.user.components.User;
import com.dphone.user.dao.UserDao;

public class TestUser {

	public static void main(String[] args) {
		//addRefferal();
		//editReferral();
		//viewReferral();
		deleteReferral();
	}
	
	public static void addRefferal() {
		try {
			User userData = new User("mohit kumar",627655 , "mohit@gmail.com","mohit1234");
			UserDao testUser = new UserDao();
			int i = testUser.addRefferal(userData);
			if (i > 0) {
				System.out.println("Refferal Added");
			} else {
				System.out.println("Refferal not added");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public static void editReferral() {
		try {
			User userData = new User("vishal kumar", 62031599 , "vishalkrnda@gmail.com","vish1234");
			UserDao testUser = new UserDao();
			int i = testUser.editReferral(userData);
			if (i > 0) {
				System.out.println("Refferal Updated");
			} else {
				System.out.println("Refferal not updated");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public static void viewReferral() {
		try {
			User userData = new User();
			UserDao testUser = new UserDao();
			int i = testUser.viewReferral(userData);
			if (i > 0) {
				System.out.println("View Available");
			} else {
				System.out.println("Refferal not updated");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public static void deleteReferral() {
		try {
			User userData = new User("vishal kumar",62031599 , "vishal@gmail.com","vish1234");
			UserDao testUser = new UserDao();
			int i = testUser.deleteReferral(userData);
			if (i > 0) {
				System.out.println("Refferal Deleted");
			} else {
				System.out.println("Refferal not deleted");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
