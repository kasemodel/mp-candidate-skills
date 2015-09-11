package com.kasemodel.test.vo;

import java.util.List;

public class User {

	private String name;
	private String email;
	private List<Knowledge> knowledges;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Knowledge> getKnowledges() {
		return knowledges;
	}

	public void setKnowledges(List<Knowledge> knowledges) {
		this.knowledges = knowledges;
	}

}
