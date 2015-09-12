package com.kasemodel.test.utils;

import java.util.ArrayList;
import java.util.List;

import com.kasemodel.test.dto.MailToSendDTO;
import com.kasemodel.test.dto.MailType;
import com.kasemodel.test.dto.ScoreDTO;
import com.kasemodel.test.vo.User;

public class MailUtils {

	public static String getMailMessage(MailToSendDTO dto) {
		String message = "";
		switch (dto.getMailType()) {
		case BACKEND:
			message = "Obrigado por se candidatar, assim que tivermos uma vaga disponível para programador Back-End entraremos em contato.";
			break;

		case FRONTEND:
			message = "Obrigado por se candidatar, assim que tivermos uma vaga disponível para programador Front-End entraremos em contato.";
			break;

		case MOBILE:
			message = "Obrigado por se candidatar, assim que tivermos uma vaga disponível para programador Mobile entraremos em contato.";
			break;

		default:
			message = "Obrigado por se candidatar, assim que tivermos uma vaga disponível para programador entraremos em contato.";
			break;
		}
		return message;
	}

	public static List<MailToSendDTO> getMailsToSend(User user, ScoreDTO score) {
		List<MailToSendDTO> mails = new ArrayList<MailToSendDTO>();
		validateMailToSendBackEnd(mails, user, score);
		valiadteMailToSendFrontEnd(mails, user, score);
		valiadteMailToSendMobile(mails, user, score);
		validateMailToSendGeneric(mails, user, score);
		return mails;
	}

	private static void validateMailToSendBackEnd(List<MailToSendDTO> mails, User user, ScoreDTO score) {
		if (score.isBackEndScore()) {
			mails.add(new MailToSendDTO(user, MailType.BACKEND));
		}
	}

	private static void valiadteMailToSendFrontEnd(List<MailToSendDTO> mails, User user, ScoreDTO score) {
		if (score.isFrontEndScore()) {
			mails.add(new MailToSendDTO(user, MailType.FRONTEND));
		}
	}

	private static void valiadteMailToSendMobile(List<MailToSendDTO> mails, User user, ScoreDTO score) {
		if (score.isMobileScore()) {
			mails.add(new MailToSendDTO(user, MailType.MOBILE));
		}
	}

	private static void validateMailToSendGeneric(List<MailToSendDTO> mails, User user, ScoreDTO score) {
		if (mails.isEmpty()) {
			mails.add(new MailToSendDTO(user, MailType.GENERIC));
		}
	}

}
