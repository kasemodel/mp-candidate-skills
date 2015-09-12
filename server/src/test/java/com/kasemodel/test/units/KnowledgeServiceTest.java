package com.kasemodel.test.units;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import com.kasemodel.test.core.service.KnowledgeService;
import com.kasemodel.test.core.service.MailService;
import com.kasemodel.test.core.service.impl.KnowledgeServiceImpl;
import com.kasemodel.test.core.service.impl.MailServiceImpl;
import com.kasemodel.test.dto.MailToSendDTO;
import com.kasemodel.test.helper.TestHelper;

public class KnowledgeServiceTest {

	private KnowledgeService service;
	private MailService mailService;

	@Before
	public void before() {
		mailService = new MailServiceImpl();
		service = new KnowledgeServiceImpl(mailService);
	}

	@Test
	public void shouldMailsTypesToSend() {
		List<MailToSendDTO> mails = service.getMailTypesToSend(TestHelper.createUserTest());
		Assertions.assertThat(mails).isNotEmpty();
		Assertions.assertThat(mails.size()).isEqualTo(3);
	}

}
