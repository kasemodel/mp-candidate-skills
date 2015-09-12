package com.kasemodel.test.units;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import com.kasemodel.test.dto.MailToSendDTO;
import com.kasemodel.test.dto.MailType;
import com.kasemodel.test.dto.ScoreDTO;
import com.kasemodel.test.helper.TestHelper;
import com.kasemodel.test.utils.MailUtils;
import com.kasemodel.test.vo.User;

public class MailUtilsTest {

	private MailToSendDTO mailToSendDTO;
	private User user;
	private ScoreDTO scoreDTO;

	@Before
	public void before() {
		mailToSendDTO = new MailToSendDTO(null, MailType.FRONTEND);
		user = TestHelper.createUserTest();
		scoreDTO = TestHelper.createScoreDTO();
	}

	@Test
	public void shouldIsMailMessageRight() {
		Assertions.assertThat(MailUtils.getMailMessage(mailToSendDTO)).isNotNull();
		Assertions.assertThat(MailUtils.getMailMessage(mailToSendDTO)).isEqualTo(
				"Obrigado por se candidatar, assim que tivermos uma vaga disponível para programador Front-End entraremos em contato.");
	}

	@Test
	public void validateMailsToSend() {
		List<MailToSendDTO> mails = MailUtils.getMailsToSend(user, scoreDTO);
		Assertions.assertThat(mails).isNotEmpty();
		Assertions.assertThat(mails.size()).isEqualTo(3);
	}

}
