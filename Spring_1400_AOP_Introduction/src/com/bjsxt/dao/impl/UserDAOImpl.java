package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

public class UserDAOImpl implements UserDAO{
	
	@Override
	public void save(User u) {
		System.out.println("User Saved!");
	}

	@Override
	public void delete() {
		System.out.println("user deleted");
	}
	
}
