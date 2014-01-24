package com.bjsxt.service;

import static org.junit.Assert.*;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.dao.UserDAO;
//import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;
//import org.springframework.

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");//Spring,
		//with beanFactory and ClassPathXmlApplicationContext to get
		//new class from configuration file: bean.xml
		
		UserService service = (UserService)factory.getBean("userService");
		UserDAO userDAO = (UserDAO)factory.getBean("u");
//		service.setUserDAO(userDAO);
		System.out.println(userDAO);

		User u = new User();
		u.setPassword("haha");
		u.setUsername("yifan");
	    service.add(u);//Hibernate: with userDAO save the user to database
	}
	

}
