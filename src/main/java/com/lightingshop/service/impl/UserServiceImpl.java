package com.lightingshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightingshop.dao.UserDao;
import com.lightingshop.entity.User;
import com.lightingshop.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserDao userDao;
	
	public User getUserById(int id) {
		
		return userDao.getUserById(id);
	}

	public List<User> listUser() {
		
		return userDao.listUser();
	}

	public String checkUser(User user) {
		
		return userDao.checkUser(user);
	}

}
