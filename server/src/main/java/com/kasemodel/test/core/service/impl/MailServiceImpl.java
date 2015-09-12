package com.kasemodel.test.core.service.impl;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kasemodel.test.core.run.MailSenderRunner;
import com.kasemodel.test.core.service.MailService;
import com.kasemodel.test.dto.MailToSendDTO;

public class MailServiceImpl implements MailService {

	private static final Logger log = LoggerFactory.getLogger(MailServiceImpl.class);

	@Override
	public void sendMail(List<MailToSendDTO> mailsToSend) {
		if (mailsToSend != null && !mailsToSend.isEmpty()) {
			Iterator<MailToSendDTO> mailToSendIterator = mailsToSend.iterator();
			while (mailToSendIterator.hasNext()) {
				MailToSendDTO mailToSend = mailToSendIterator.next();
				new Thread(new MailSenderRunner(mailToSend)).start();
			}
		} else {
			log.error("Não foram definitidos tipos de email a serem enviados");
		}
	}

}
