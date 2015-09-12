package com.kasemodel.test.units;

import org.junit.Test;

import com.kasemodel.test.core.run.MailSenderRunner;
import com.kasemodel.test.helper.TestHelper;

public class MailTest {

	@Test
	public void shouldMailSended() {
		new MailSenderRunner(TestHelper.createMailToSendDTO()).run();
	}

}
