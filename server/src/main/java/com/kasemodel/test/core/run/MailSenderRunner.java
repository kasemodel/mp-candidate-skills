package com.kasemodel.test.core.run;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.eventbus.DeadEvent;
import com.kasemodel.test.dto.MailToSendDTO;
import com.kasemodel.test.utils.MailUtils;

public class MailSenderRunner implements Runnable {

	private static final Logger log = LoggerFactory.getLogger(MailSenderRunner.class.getName());
	private MailToSendDTO mailToSend;

	public MailSenderRunner(MailToSendDTO mailToSend) {
		this.mailToSend = mailToSend;
	}

	@Override
	public void run() {
		try {
			String mail = mailToSend.getUser().getEmail();
			Email email = new SimpleEmail();
			email.setStartTLSEnabled(true);
			email.setStartTLSRequired(true);
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("meuspedidostest@gmail.com", "meuspedidos@321"));
			email.setFrom("meuspedidostest@gmail.com", "Meus Pedidos");
			email.setSubject("Obrigado por se candidatar");
			email.setMsg(MailUtils.getMailMessage(mailToSend));
			email.addTo(mail);
			email.send();
			log.info(new StringBuffer().append("Email [").append(mailToSend.getMailType().name())
					.append("] enviado para [").append(mail).append("]").toString());
		} catch (EmailException e) {
			log.error("Erro ao tentar enviar email.", e);
		}

	}

}
