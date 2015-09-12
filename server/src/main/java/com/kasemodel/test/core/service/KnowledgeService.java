package com.kasemodel.test.core.service;

import java.util.List;

import com.kasemodel.test.dto.MailToSendDTO;
import com.kasemodel.test.vo.User;

public interface KnowledgeService {

	public void validateKnowledgesAndSendMail(User user);
	public List<MailToSendDTO> getMailTypesToSend(User user);

}
