package junit.suitMathTest;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class MathTest1 extends Assert {

	@Test
	public void testPow() {

		Random random = new Random();
		int a = random.nextInt(10);
		int n = random.nextInt(10);
		long c = 1l;
		for (int i = 0; i < n; i++) {
			c = c * a;
		}
		assertTrue(Math.pow(a, n) == c);
	}

}
