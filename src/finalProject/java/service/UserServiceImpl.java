package service;

import model.User;
import dao.UserDao;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;

public class UserServiceImpl {

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public boolean addUser(User user) {
		userDao.addUser(user);
		return true;
	}	
	
	@Transactional
	public User getUser(int id){
		//
		return false;
	}
	
	@Transactional
	public boolean updateUser(User user) {
		userDao.updateUser(user);
		return true;
	}
	
}
