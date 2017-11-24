import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class DivisionTest {
	private static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Calculator calculator = new Calculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testDivideSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber / secondNumber;

			LOG.info("Testing the divide method with small sized positive numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testDivideMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber / secondNumber;

			LOG.info("Testing the divide method with medium sized positive numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testDivideLargesizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber / secondNumber;

			LOG.info("Testing the divide method with large sized positive numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testDivideZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = -0.123456;

	
			result = firstNumber / secondNumber;

			LOG.info("Testing the divide method with zeros: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);
			
			for (int i = 0; i < 200; i++) {
				firstNumber = 0;
				secondNumber = Double.valueOf(df.format(random.nextDouble() * (10)));
				result = firstNumber / secondNumber;

				LOG.info("Testing the divide method with zeros: " + firstNumber + " and " + secondNumber);
				assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

				firstNumber = Double.valueOf(df.format(random.nextDouble() * (10)));
				secondNumber = 0;
				result = firstNumber / secondNumber;

				LOG.info("Testing the divide method with zeros: " + firstNumber + " and " + secondNumber);
				assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testDivideSmallNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			result = firstNumber / secondNumber;

			LOG.info("Testing the divide method with small sized negative numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testDivideMediumNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			result = firstNumber / secondNumber;

			LOG.info("Testing the divide method with medium sized negative numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testDivideLargeNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			result = firstNumber / secondNumber;

			LOG.info("Testing the divide method with large sized negative numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}
}
