package com.bjsxt.dao.impl;

import com.bjsxt.model.User;

public class UserDAOImpl2 extends UserDAOImpl{
	@Override
	public void save(User user) {
		System.out.println("Save start");
		
		super.save(user);
		
	}
}
