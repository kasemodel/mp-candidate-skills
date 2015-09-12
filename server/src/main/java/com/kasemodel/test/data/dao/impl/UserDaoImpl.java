package com.kasemodel.test.data.dao.impl;

import com.google.inject.Inject;
import com.kasemodel.test.data.MemoryDatabase;
import com.kasemodel.test.data.dao.UserDao;
import com.kasemodel.test.vo.User;

public class UserDaoImpl implements UserDao {

	private MemoryDatabase database;

	@Inject
	public UserDaoImpl(MemoryDatabase database) {
		this.database = database;
	}

	@Override
	public User save(User user) {
		database.addUsers(user);
		return user;
	}

}
