package com.lightingshop.dao;

import java.util.List;

import com.lightingshop.entity.User;

public interface UserDao {

	/**
	 * 通过id查找一个用户
	 * @param id
	 * @return
	 */
	User getUserById(int id);
	
	/**
	 * 查询所有用户
	 * @return
	 */
	List<User> listUser();
	
	/**
	 * 判断用户账号密码是否正确
	 * @param user
	 * @return User中的name属性
	 */
	String checkUser(User user);
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 */
	boolean updateUser(User user);
}
