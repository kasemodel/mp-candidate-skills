package com.kasemodel.test.core.injections;

import com.google.inject.AbstractModule;
import com.kasemodel.test.core.injections.binding.Dao;
import com.kasemodel.test.core.service.KnowledgeService;
import com.kasemodel.test.core.service.MailService;
import com.kasemodel.test.core.service.UserService;
import com.kasemodel.test.core.service.impl.KnowledgeServiceImpl;
import com.kasemodel.test.core.service.impl.MailServiceImpl;
import com.kasemodel.test.core.service.impl.UserServiceImpl;
import com.kasemodel.test.data.dao.UserDao;
import com.kasemodel.test.data.dao.impl.UserDaoImpl;

public class TestAppModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(UserDao.class).annotatedWith(Dao.class).to(UserDaoImpl.class);

		bind(UserService.class).to(UserServiceImpl.class);
		bind(MailService.class).to(MailServiceImpl.class);
		bind(KnowledgeService.class).to(KnowledgeServiceImpl.class);
	}

}
