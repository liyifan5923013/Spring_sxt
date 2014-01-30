package com.bjsxt.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;
@Component("us")//key:userDaoImpl value:bean
public class UserDAOImpl implements UserDAO{
	
	private DataSource dataSource;
	
	
	
	@Override
	public void save(User u) {
		try {
			Connection conn=dataSource.getConnection();
			conn.createStatement().executeUpdate("insert into user values(null,'zhangsan'");
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("User Saved!");
		//throw new RuntimeException("exception");
	}



	public DataSource getDataSource() {
		return dataSource;
	}


	@Resource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
}
