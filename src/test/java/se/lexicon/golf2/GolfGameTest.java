package se.lexicon.golf2;

import org.junit.Assert;
import org.junit.Test;

public class GolfGameTest {

	@Test
	public void Golf_test_angle_velcoity() {

		double Givenvelocity = 56;
		double Givenangle = 45;

		double expectedposition = 320;
		double actualposition =Calculations.calculation(56, 45);

		Assert.assertEquals(expectedposition, actualposition, 0.1);

		
	}
}
