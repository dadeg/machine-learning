import static org.junit.Assert.*;

import org.junit.Test;

public class CostFunctionTest {

	@Test
	public void testExactFit() {
		float theta0 = 0;
		float theta1 = 1;
		TrainingSetOneVariable[] trainingSet = {
				new TrainingSetOneVariable(1,1),
				new TrainingSetOneVariable(2,2),
				new TrainingSetOneVariable(3,3),
				new TrainingSetOneVariable(4,4),
		};
				
		CostFunction costFunction = new CostFunction(trainingSet);
		assertEquals(0.0, costFunction.evaluate(theta0, theta1), 0.0);
	}
	
	@Test
	public void testOff() {
		float theta0 = 1;
		float theta1 = 3;
		TrainingSetOneVariable[] trainingSet = {
				new TrainingSetOneVariable(1,1), // square diff = 9
				new TrainingSetOneVariable(2,2), // square diff = 25
				new TrainingSetOneVariable(3,3), // square diff = 49
				new TrainingSetOneVariable(4,4), // square diff = 81
		};
				
		CostFunction costFunction = new CostFunction(trainingSet);
		// 1.0/2.0/4.0*(9+25+49+81) = 20.5
		assertEquals(20.5, costFunction.evaluate(theta0, theta1), 0.0);
	}

}
