package com.kasemodel.test.dto;

import com.kasemodel.test.vo.User;

public class MailToSendDTO {
	private User user;
	private MailType mailType;

	public MailToSendDTO(User user, MailType mailType) {
		setUser(user);
		setMailType(mailType);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public MailType getMailType() {
		return mailType;
	}

	public void setMailType(MailType mailType) {
		this.mailType = mailType;
	}

}
