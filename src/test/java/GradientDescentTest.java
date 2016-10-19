import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GradientDescentTest {

	@Test
	public void test4Set() {
		TrainingSetOneVariable[] trainingSet = {
				new TrainingSetOneVariable(1,1),
				new TrainingSetOneVariable(2,2),
				new TrainingSetOneVariable(3,3),
				new TrainingSetOneVariable(4,4),
		};
		
		CostFunction costFunction = new CostFunction(trainingSet);
		GradientDescent gradientDescent = new GradientDescent(costFunction);
		gradientDescent.train(0.1);
		System.out.println("f(x) = " + gradientDescent.getTheta0() + " + " + gradientDescent.getTheta1() + "x");
		assertEquals(0.0, gradientDescent.getTheta0(), 1E-9);
		assertEquals(1.0, gradientDescent.getTheta1(), 1E-9);
	}
	
	@Test
	public void test10Set() {
		TrainingSetOneVariable[] trainingSet = {
				new TrainingSetOneVariable(1,1),
				new TrainingSetOneVariable(2,2),
				new TrainingSetOneVariable(3,3),
				new TrainingSetOneVariable(4,4),
				new TrainingSetOneVariable(5,5),
				new TrainingSetOneVariable(6,6),
				new TrainingSetOneVariable(7,7),
				new TrainingSetOneVariable(8,8),
				new TrainingSetOneVariable(9,9),
				new TrainingSetOneVariable(10,10),
		};
		
		CostFunction costFunction = new CostFunction(trainingSet);
		GradientDescent gradientDescent = new GradientDescent(costFunction);
		gradientDescent.train(0.0001);
		System.out.println("f(x) = " + gradientDescent.getTheta0() + " + " + gradientDescent.getTheta1() + "x");
		assertEquals(0.0, gradientDescent.getTheta0(), 1E-9);
		assertEquals(1.0, gradientDescent.getTheta1(), 1E-9);
	}
	
	@Test
	public void test1000Set() {
		List<TrainingSetOneVariable> trainingSet = new ArrayList<TrainingSetOneVariable>();
		for (int i = 0; i < 1000; i++) {
			trainingSet.add(new TrainingSetOneVariable(i,i));
		}
		
		CostFunction costFunction = new CostFunction(trainingSet.toArray(new TrainingSetOneVariable[trainingSet.size()]));
		GradientDescent gradientDescent = new GradientDescent(costFunction);
		gradientDescent.train();
		System.out.println("f(x) = " + gradientDescent.getTheta0() + " + " + gradientDescent.getTheta1() + "x");
		assertEquals(0.0, gradientDescent.getTheta0(), 1E-9);
		assertEquals(1.0, gradientDescent.getTheta1(), 1E-9);
	}
	

}
