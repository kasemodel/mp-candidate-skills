package com.kasemodel.test.core.service;

import java.util.List;

import com.kasemodel.test.dto.MailToSendDTO;

public interface MailService {

	public void sendMail(List<MailToSendDTO> mailsToSend);

}
