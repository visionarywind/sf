package com.wind.mi;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shanfeng on 7/12/18.
 */
public class BigIntegerMinusTest {
	@Test
	public void testSolution() {
		String input = "1231231237812739878951331231231237812739878951331231231237812739878951331231231237812739878951331231231237812739878951331231231237812739870 - 89513312312312378127398789513312312312378127398789513312312312378127398789513";
		String expected = "1231231237812739878951331231231237812739878951331231231237812650365639018918853110413950365639018918853110413950365639018918853110413950357";
		Assert.assertEquals(expected, BigIntegerMinus.solution(input));

		input = "1231231237812739878951331231231237812739878951331231231237812739878951331230000000000000000000000001 - 331231231237812739878951331231231";
		expected = "1231231237812739878951331231231237812739878951331231231237812739878620099998762187260121048668768770";
		Assert.assertEquals(expected, BigIntegerMinus.solution(input));

		input = "1000 - 999";
		expected = "1";
		Assert.assertEquals(expected, BigIntegerMinus.solution(input));

		input = "1000 - 1000";
		expected = "0";
		Assert.assertEquals(expected, BigIntegerMinus.solution(input));
	}
}