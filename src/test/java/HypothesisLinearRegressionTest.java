import static org.junit.Assert.*;

import org.junit.Test;

public class HypothesisLinearRegressionTest {

	@Test
	public void test() {
		double theta0 = 4;
		double theta1 = 2;
		HypothesisLinearRegression hypothesis = new HypothesisLinearRegression(theta0, theta1);
		double result = hypothesis.evaluate(3);
		assertEquals((4 + 2 * 3), result, 0);
	}

}
