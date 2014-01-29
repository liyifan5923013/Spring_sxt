package com.bjsxt.service;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import home.bjsxt.spring.BeanFactory;
import home.bjsxt.spring.ClassPathXmlApplicationContext;

import org.junit.Test;

import com.bjsxt.aop.LogInterceptor;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.dao.impl.UserDAOImpl;
import com.bjsxt.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		BeanFactory factory = new ClassPathXmlApplicationContext();//Spring,
		//with beanFactory and ClassPathXmlApplicationContext to get
		//new class from configuration file: bean.xml
		
		UserService service = (UserService)factory.getBean("userService");
		//UserDAO userDAO = (UserDAO)factory.getBean("u");
		//service.setUserDAO(userDAO);
		User u = new User();
	    service.add(u);//Hibernate: with userDAO save the user to database
	}
	@Test
	public void testProxy () {
		UserDAO userDAO = new UserDAOImpl();
		LogInterceptor li = new LogInterceptor();
		li.setTarget(userDAO);
		UserDAO userDAOProxy = (UserDAO)Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), userDAO.getClass().getInterfaces(), li);
		System.out.println(userDAOProxy.getClass().getInterfaces()[0]);
		userDAOProxy.save(new User());
		userDAOProxy.delete();
	}
/*class $Proxy4 implements UserDAO
 * {
 * save(User u) {
 *Method m = userDAO.getClass.getMethod
 *li.invoke(this, m, u)
 * 
 * }
 */

}
