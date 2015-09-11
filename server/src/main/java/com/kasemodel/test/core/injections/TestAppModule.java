package com.kasemodel.test.core.injections;

import com.google.inject.AbstractModule;
import com.kasemodel.test.core.injections.binding.Dao;
import com.kasemodel.test.data.dao.UserDao;
import com.kasemodel.test.data.dao.impl.UserDaoImpl;

public class TestAppModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(UserDao.class).annotatedWith(Dao.class).to(UserDaoImpl.class);
	}

}
