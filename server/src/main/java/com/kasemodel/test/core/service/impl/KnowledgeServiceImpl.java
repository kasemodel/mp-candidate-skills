package com.kasemodel.test.core.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kasemodel.test.core.factory.MailFactory;
import com.kasemodel.test.core.service.KnowledgeService;
import com.kasemodel.test.core.service.MailService;
import com.kasemodel.test.dto.MailToSendDTO;
import com.kasemodel.test.dto.ScoreDTO;
import com.kasemodel.test.utils.MailUtils;
import com.kasemodel.test.vo.Knowledge;
import com.kasemodel.test.vo.User;

public class KnowledgeServiceImpl implements KnowledgeService {

	private static final Logger log = LoggerFactory.getLogger(KnowledgeServiceImpl.class);
	private MailService mailService;

	@Inject
	public KnowledgeServiceImpl(MailService mailService) {
		this.mailService = mailService;
	}

	@Override
	public void validateKnowledgesAndSendMail(User user) {
		if (user.getKnowledges() != null) {
			mailService.sendMail(getMailTypesToSend(user));
		}
	}

	private List<MailToSendDTO> getMailTypesToSend(User user) {
		List<MailToSendDTO> mailsToSend = new ArrayList<MailToSendDTO>();
		ScoreDTO score = new ScoreDTO();
		Iterator<Knowledge> knowledgeIterator = user.getKnowledges().iterator();
		while (knowledgeIterator.hasNext()) {
			Knowledge knowledge = knowledgeIterator.next();
			validateScore(score, knowledge);
		}
		mailsToSend = MailUtils.getMailsToSend(user, score);
		return mailsToSend;
	}

	private void validateScore(ScoreDTO score, Knowledge knowledge) {
		String name = knowledge.getName();
		Integer value = knowledge.getValue();
		if (ScoreDTO.BACKEND_KNOWLEDGES.contains(name)) {
			incrementBackEndScore(score, value);
		} else {
			if (ScoreDTO.FRONTEND_KNOWLEDGES.contains(name)) {
				incrementFrontEndScore(score, value);
			} else {
				if (ScoreDTO.MOBILE_KNOWLEDGES.contains(name)) {
					incrementMobileScore(score, value);
				}
			}
		}
	}

	private void incrementBackEndScore(ScoreDTO score, Integer value) {
		if (validateMinumunScore(value))
			score.incrementBackEnd();
	}

	private void incrementMobileScore(ScoreDTO score, Integer value) {
		if (validateMinumunScore(value))
			score.incrementMobile();
	}

	private void incrementFrontEndScore(ScoreDTO score, Integer value) {
		if (validateMinumunScore(value))
			score.incrementeFrontEnd();
	}

	private void sendMailToProcessedScores(User user, ScoreDTO score) {

	}

	private boolean validateMinumunScore(Integer value) {
		return value >= ScoreDTO.MINIMUM_SCORE;
	}

}
