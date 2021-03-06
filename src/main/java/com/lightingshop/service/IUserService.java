package com.lightingshop.service;

import java.util.List;

import com.lightingshop.entity.User;

public interface IUserService {

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
     * 注册
     * @param id
     * @param psw
     * @return
     */
    int regiter(String id, String psw, String name, String phone, String address);
    
    /**
     * 登录验证
     * @param id
     * @param psw
     * @return
     */
    User login(String id, String psw);
}
