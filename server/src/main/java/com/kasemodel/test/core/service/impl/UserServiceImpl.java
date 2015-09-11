package com.kasemodel.test.core.service.impl;

import javax.inject.Inject;

import com.kasemodel.test.core.injections.binding.Dao;
import com.kasemodel.test.core.service.UserService;
import com.kasemodel.test.data.dao.UserDao;
import com.kasemodel.test.vo.User;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	@Inject
	public UserServiceImpl(@Dao UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User save(User user) {
		return userDao.save(user);
	}

}
