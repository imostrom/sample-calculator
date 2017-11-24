import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class MultiplicationTest {
	private static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Calculator calculator = new Calculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	public void testMultiplySmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber * secondNumber;

			LOG.info("Testing the multiply method with small sized positive numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testMultiplyMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber * secondNumber;

			LOG.info("Testing the multiply method with medium sized positive numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testMultiplyLargesizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber * secondNumber;

			LOG.info("Testing the multiply method with large sized positive numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testMultiplyZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

			result = firstNumber * secondNumber;

			LOG.info("Testing the multiply method with zeros: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);
			
			for (int i = 0; i < 200; i++) {
				firstNumber = 0;
				secondNumber = Double.valueOf(df.format(random.nextDouble() * (10)));
				result = firstNumber * secondNumber;

				LOG.info("Testing the multiply method with zeros: " + firstNumber + " and " + secondNumber);
				assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

				firstNumber = Double.valueOf(df.format(random.nextDouble() * (10)));
				secondNumber = 0;
				result = firstNumber * secondNumber;

				LOG.info("Testing the multiply method with zeros: " + firstNumber + " and " + secondNumber);
				assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testMultiplySmallNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			result = firstNumber * secondNumber;

			LOG.info("Testing the multiply method with small sized negative numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testMultiplyMediumNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			result = firstNumber * secondNumber;

			LOG.info("Testing the multiply method with medium sized negative numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testMultiplyLargeNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			result = firstNumber * secondNumber;

			LOG.info("Testing the multiply method with large sized negative numbers: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}
}
