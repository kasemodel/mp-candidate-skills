package com.kasemodel.test.dto;

import java.util.Arrays;
import java.util.List;

public class ScoreDTO {

	public static final List<String> BACKEND_KNOWLEDGES;
	public static final List<String> FRONTEND_KNOWLEDGES;
	public static final List<String> MOBILE_KNOWLEDGES;
	public static final Integer MINIMUM_SCORE = 7;

	static {
		BACKEND_KNOWLEDGES = Arrays.asList(new String[] { "python", "django" });
		FRONTEND_KNOWLEDGES = Arrays.asList(new String[] { "html", "css", "javascript" });
		MOBILE_KNOWLEDGES = Arrays.asList(new String[] { "ios", "android" });
	}

	private Integer scoreBackEnd;
	private Integer scoreFrontEnd;
	private Integer scoreMobile;

	public Integer getScoreMobile() {
		return scoreMobile;
	}

	public void setScoreMobile(Integer scoreMobile) {
		this.scoreMobile = scoreMobile;
	}

	public ScoreDTO() {
		setScoreBackEnd(0);
		setScoreFrontEnd(0);
		setScoreMobile(0);
	}

	public Integer getScoreBackEnd() {
		return scoreBackEnd;
	}

	public void setScoreBackEnd(Integer scoreBackEnd) {
		this.scoreBackEnd = scoreBackEnd;
	}

	public Integer getScoreFrontEnd() {
		return scoreFrontEnd;
	}

	public void setScoreFrontEnd(Integer scoreFrontEnd) {
		this.scoreFrontEnd = scoreFrontEnd;
	}

	public void incrementBackEnd() {
		setScoreBackEnd(getScoreBackEnd() + 1);
	}

	public void incrementeFrontEnd() {
		setScoreFrontEnd(getScoreFrontEnd() + 1);
	}

	public void incrementMobile() {
		setScoreMobile(getScoreMobile() + 1);
	}

	public Boolean isBackEndScore() {
		return getScoreBackEnd().equals(2);
	}

	public Boolean isFrontEndScore() {
		return getScoreFrontEnd().equals(3);
	}

	public Boolean isMobileScore() {
		return getScoreMobile() >= 1;
	}

}
