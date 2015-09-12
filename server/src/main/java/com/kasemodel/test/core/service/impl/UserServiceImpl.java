package com.kasemodel.test.core.service.impl;

import javax.inject.Inject;

import com.kasemodel.test.core.injections.binding.Dao;
import com.kasemodel.test.core.service.KnowledgeService;
import com.kasemodel.test.core.service.UserService;
import com.kasemodel.test.data.dao.UserDao;
import com.kasemodel.test.vo.User;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	private KnowledgeService knowledgeService;

	@Inject
	public UserServiceImpl(@Dao UserDao userDao, KnowledgeService knowledgeService) {
		this.userDao = userDao;
		this.knowledgeService = knowledgeService;
	}

	@Override
	public User save(User user) {
		User savedUser = userDao.save(user);
		knowledgeService.validateKnowledgesAndSendMail(savedUser);
		return savedUser;
	}

}
