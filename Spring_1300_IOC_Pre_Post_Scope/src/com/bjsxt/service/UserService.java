package com.bjsxt.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.dao.impl.UserDAOImpl;
import com.bjsxt.model.User;


//@Scope("singleton")
//@Scope("prototype")
@Component("userService")
public class UserService {
	

	private UserDAO userDAO;
	
	@PostConstruct
	
	public void init() {
		System.out.println("init");
	}
	@PreDestroy
	public void destroy() {
 		System.out.println("destroy");
	}
 	
	public UserDAO getUserDAO() {
		return userDAO;
	}
    @Resource(name="us")
	public void setUserDAO( UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void add(User u) {
		this.userDAO.save(u);
	}
}
