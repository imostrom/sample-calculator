import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class SubtractionTest {
	private static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Calculator calculator = new Calculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testSubtractSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber - secondNumber;

			LOG.info("Testing the subtract method with small sized positive numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testSubtractMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber - secondNumber;

			LOG.info("Testing the subtract method with medium sized positive numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testSubtractLargesizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber - secondNumber;

			LOG.info("Testing the subtract method with large sized positive numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testSubtractZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

	
			result = firstNumber - secondNumber;

			LOG.info("Testing the subtract method with zeros: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);
			
			for (int i = 0; i < 200; i++) {
				firstNumber = 0;
				secondNumber = Double.valueOf(df.format(random.nextDouble() * (10)));
				result = firstNumber - secondNumber;

				LOG.info("Testing the subtract method with 0 and random number: " + firstNumber + " and " + secondNumber);
				assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

				firstNumber = Double.valueOf(df.format(random.nextDouble() * (10)));
				secondNumber = 0;
				result = firstNumber - secondNumber;

				LOG.info("Testing the subtract method with 0 and random number: " + firstNumber + " and " + secondNumber);
				assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testSubtractSmallNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			result = firstNumber - secondNumber;

			LOG.info("Testing the subtract method with small sized negative numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testSubtractMediumNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			result = firstNumber - secondNumber;

			LOG.info("Testing the subtract method with medium sized negative numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testSubtractLargeNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			result = firstNumber - secondNumber;

			LOG.info("Testing the subtract method with large sized negative numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}
}
