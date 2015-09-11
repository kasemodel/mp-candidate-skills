package com.kasemodel.test.data.dao.impl;

import com.kasemodel.test.data.MemoryDatabase;
import com.kasemodel.test.data.dao.DefaultDao;
import com.kasemodel.test.vo.User;

public class UserDaoImpl implements DefaultDao<User> {

	private MemoryDatabase database;
	
	public UserDaoImpl(MemoryDatabase database) {
		this.database = database;
	}

	@Override
	public User save(User user) {
		database.addUsers(user);
		return user;
	}

}
