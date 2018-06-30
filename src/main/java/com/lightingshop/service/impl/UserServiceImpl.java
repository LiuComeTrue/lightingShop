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

    @Override
    public int regiter(String id, String psw, String name, String phone, String address) {
        // TODO Auto-generated method stub
        return userDao.regiter(id, psw, name, phone, address);
    }

    @Override
    public User login(String id, String psw) {
        // TODO Auto-generated method stub
        return userDao.login(id, psw);
    }

}
