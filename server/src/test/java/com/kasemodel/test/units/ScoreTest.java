package com.kasemodel.test.units;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import com.kasemodel.test.dto.ScoreDTO;

public class ScoreTest {

	private ScoreDTO score;

	@Before
	public void before() {
		score = new ScoreDTO();
	}

	@Test
	public void souldScoreIsEmpty() {
		Assertions.assertThat(score.getScoreBackEnd()).isEqualTo(0);
		Assertions.assertThat(score.getScoreFrontEnd()).isEqualTo(0);
		Assertions.assertThat(score.getScoreMobile()).isEqualTo(0);
	}

	@Test
	public void shouldIncrementsBackEndIsRight() {
		score.incrementBackEnd();
		score.incrementBackEnd();
		Assertions.assertThat(score.getScoreBackEnd()).isEqualTo(2);
	}

	@Test
	public void shouldIncrementFrontEndIsRight() {
		score.incrementeFrontEnd();
		score.incrementeFrontEnd();
		score.incrementeFrontEnd();
		Assertions.assertThat(score.getScoreFrontEnd()).isEqualTo(3);
	}

	@Test
	public void shouldIncrementMobileIsRight() {
		score.incrementMobile();
		Assertions.assertThat(score.getScoreMobile()).isEqualTo(1);
	}

	@Test
	public void shouldScoreIsBackEnd() {
		score.setScoreBackEnd(0);
		Assertions.assertThat(score.isBackEndScore()).isEqualTo(false);

		score.setScoreBackEnd(2);
		Assertions.assertThat(score.isBackEndScore()).isEqualTo(true);

		score.setScoreBackEnd(3);
		Assertions.assertThat(score.isBackEndScore()).isEqualTo(false);
	}

	@Test
	public void shouldScoreIsFrontEnd() {
		score.setScoreFrontEnd(0);
		Assertions.assertThat(score.isFrontEndScore()).isEqualTo(false);

		score.setScoreFrontEnd(3);
		Assertions.assertThat(score.isFrontEndScore()).isEqualTo(true);

		score.setScoreFrontEnd(4);
		Assertions.assertThat(score.isFrontEndScore()).isEqualTo(false);
	}
	
	@Test
	public void shouldScoreIsMobile() {
		score.setScoreMobile(0);
		Assertions.assertThat(score.isMobileScore()).isEqualTo(false);

		score.setScoreMobile(1);
		Assertions.assertThat(score.isMobileScore()).isEqualTo(true);
		
		score.setScoreMobile(2);
		Assertions.assertThat(score.isMobileScore()).isEqualTo(true);
	}

}
