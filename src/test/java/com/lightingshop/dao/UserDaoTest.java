package com.lightingshop.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lightingshop.base.BaseTest;
import com.lightingshop.entity.User;

public class UserDaoTest extends BaseTest {

	@Autowired
	private UserDao userdao;
	
	@Autowired
	private User user;
	
	@Test
	public void test() {
		
		user.setName("nName");	
		userdao.updateUser(user);
	}
	
}
