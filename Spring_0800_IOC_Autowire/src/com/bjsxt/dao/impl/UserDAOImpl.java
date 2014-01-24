package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

public class UserDAOImpl implements UserDAO{
	
	private int daoId;
	
	@Override
	public void save(User u) {
		System.out.println("User Saved!");
	}

	public int getDaoId() {
		return daoId;
	}

	public void setDaoId(int daoId) {
		this.daoId = daoId;
	}
	@Override
	public String toString() {
		return "daoId=" + daoId;
	}
 }
