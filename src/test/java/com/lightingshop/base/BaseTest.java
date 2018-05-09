package com.lightingshop.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lightingshop.entity.User;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件位置
@ContextConfiguration("classpath:applicationContext.xml")
public class BaseTest {

/*	@Autowired
	public User user;
	
	@Test
	public void test() {
		user.setId(110);
		user.setName("user");
		user.setPassword("zzz");
		System.out.println(user);
	}*/
}
