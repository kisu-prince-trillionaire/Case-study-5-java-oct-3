package com.dphone.user.services;

import com.dphone.user.components.User;
import com.dphone.user.dao.UserDao;

public class UserService {
	UserDao userDao;
	
	public void addRefferal(User userData) {
		userDao.addRefferal(userData);
	}
	
	public void editReferral(User userData) {
		userDao.editReferral(userData);
	}
	
	public void viewReferral(User userData) {
		userDao.viewReferral(userData);
	}
	
	public void deleteReferral(User userData) {
		userDao.deleteReferral(userData);
	}
}
