package com.bjsxt.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.dao.impl.UserDAOImpl;
import com.bjsxt.model.User;

public class UserService {
	
	public UserService(UserDAO userDAO) {
		super();
		this.userDAO = userDAO;
	}
	public UserService() {}

	private UserDAO userDAO;
	
	public void init() {
		System.out.println("init");
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
 	
	public UserDAO getUserDAO() {
		return userDAO;
	}
    @Resource(name="userDAO")//by name first, then type
	public void setUserDAO( UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void add(User u) {
		this.userDAO.save(u);
	}
}
