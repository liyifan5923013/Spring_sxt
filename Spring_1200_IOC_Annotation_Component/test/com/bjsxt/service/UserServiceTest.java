package com.bjsxt.service;

import static org.junit.Assert.*;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;
//import org.springframework.

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");//Spring,
		//with beanFactory and ClassPathXmlApplicationContext to get
		//new class from configuration file: bean.xml
		
		UserService service = (UserService)factory.getBean("userService");
		service.add(new User());
	}
	

}
