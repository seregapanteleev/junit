package junit.suitMathTest;

import org.junit.Assert;
import org.junit.Test;

public class MathTest2 extends Assert {

	@Test
	public void testSqrt() {

		assertTrue(Math.sqrt(1) == 1);
		assertTrue(Math.sqrt(1000000) == 1000);
	}
}
