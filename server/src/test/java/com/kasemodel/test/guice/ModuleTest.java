package com.kasemodel.test.guice;

import javax.inject.Inject;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.carlosbecker.guice.GuiceModules;
import com.carlosbecker.guice.GuiceTestRunner;
import com.kasemodel.test.core.injections.TestAppModule;
import com.kasemodel.test.core.service.KnowledgeService;
import com.kasemodel.test.core.service.MailService;
import com.kasemodel.test.core.service.UserService;
import com.kasemodel.test.core.service.impl.KnowledgeServiceImpl;
import com.kasemodel.test.core.service.impl.UserServiceImpl;
import com.kasemodel.test.data.MemoryDatabase;

@RunWith(GuiceTestRunner.class)
@GuiceModules(TestAppModule.class)
public class ModuleTest {

	@Inject
	private MemoryDatabase db;

	@Inject
	private KnowledgeService knowledgeService;
	
	@Inject
	private MailService mailService;
	
	@Inject
	private UserService userService;

	@Test
	public void shouldInjectDB() {
		Assertions.assertThat(db).isNotNull();
	}

	@Test
	public void shouldInjectKnowledgeService() {
		Assertions.assertThat(knowledgeService).isNotNull();
		Assertions.assertThat(knowledgeService).isInstanceOf(KnowledgeServiceImpl.class);
	}

	@Test
	public void shouldInjectMailService() {
		Assertions.assertThat(mailService).isNotNull();
		Assertions.assertThat(knowledgeService).isInstanceOf(KnowledgeServiceImpl.class);
	}

	@Test
	public void shouldInjectUserService() {
		Assertions.assertThat(userService).isNotNull();
		Assertions.assertThat(userService).isInstanceOf(UserServiceImpl.class);
	}

}
