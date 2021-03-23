package junit;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestMinus extends Assert {
	private int valueA;
	private int valueB;
	private int expected;

	public TestMinus(int expected, int valueA, int valueB) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:Of{0}=({1}-{2})")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 2, 10, 8 }, { 6, 12, 6 }, { 21, 22, 1 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getMinus(valueA, valueB));
	}

}
