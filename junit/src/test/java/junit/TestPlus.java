package junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestPlus extends Assert {
	private int valueA;
	private int valueB;
	private int expected;

	public TestPlus(int expected, int valueA, int valueB) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:Of{0}=({1}+{2})")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 16, 8, 8 }, { 36, 6, 30}, { 22, 1, 21 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getSum(valueA, valueB));
	}
}



