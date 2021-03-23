package junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestMultiple extends Assert {

	private int valueA;
	private int valueB;
	private int expected;

	public TestMultiple(int expected, int valueA, int valueB) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:Of{0}=({1}/{2})")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 16, 8, 2 }, { 36, 6, 6, }, { 22, 1, 22 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getMultiple(valueA, valueB));
	}
}
