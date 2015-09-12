package com.kasemodel.test.helper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kasemodel.test.dto.MailToSendDTO;
import com.kasemodel.test.dto.MailType;
import com.kasemodel.test.dto.ScoreDTO;
import com.kasemodel.test.vo.Knowledge;
import com.kasemodel.test.vo.User;

import io.dropwizard.jackson.Jackson;
import io.dropwizard.testing.FixtureHelpers;

public class TestHelper {

	private static final Logger log = LoggerFactory.getLogger(TestHelper.class);

	public static <T> T getJacksonObject(String jsonPath, Class<T> klass) {
		T returnValue = null;
		try {
			returnValue = Jackson.newObjectMapper().readValue(FixtureHelpers.fixture(jsonPath), klass);
		} catch (IOException e) {
			log.error("Erro ao tentar ler o json.", e);
		}
		return returnValue;
	}

	public static MailToSendDTO createMailToSendDTO() {
		MailToSendDTO mailToSend = new MailToSendDTO(createUserTest(), MailType.GENERIC);
		return mailToSend;
	}

	public static User createUserTest() {
		User user = new User();
		user.setName("Jonas");
		user.setEmail("jonas@gmmail.com");
		user.setKnowledges(createKnowledgesList());
		return user;
	}

	public static List<Knowledge> createKnowledgesList() {
		List<Knowledge> knowledgeList = new ArrayList<>();
		knowledgeList.add(new Knowledge("python", 8));
		knowledgeList.add(new Knowledge("django", 7));
		knowledgeList.add(new Knowledge("css", 8));
		knowledgeList.add(new Knowledge("html", 7));
		knowledgeList.add(new Knowledge("javascript", 9));
		knowledgeList.add(new Knowledge("android", 9));
		knowledgeList.add(new Knowledge("ios", 3));
		return knowledgeList;
	}

	public static ScoreDTO createScoreDTO() {
		ScoreDTO scoreDTO = new ScoreDTO();
		scoreDTO.setScoreBackEnd(2);
		scoreDTO.setScoreFrontEnd(3);
		scoreDTO.setScoreMobile(1);
		return scoreDTO;
	}

}
