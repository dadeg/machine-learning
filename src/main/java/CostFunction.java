
public class CostFunction {

	private TrainingSetOneVariable[] trainingSet;
	private double trainingSetLength;

	public CostFunction(TrainingSetOneVariable[] trainingSet) {
		this.trainingSet = trainingSet;
		this.trainingSetLength = trainingSet.length;
	}

	public double evaluate(double theta0, double theta1) {
		HypothesisLinearRegression hypothesis = new HypothesisLinearRegression(theta0, theta1);
		double sumOfSquareDifferences = this.evaluateSumOfSquareDifferences(hypothesis);
		return 1.0 / 2.0 / trainingSetLength * sumOfSquareDifferences;
	}

	private double evaluateSumOfSquareDifferences(HypothesisLinearRegression hypothesis) {
		double sum = 0;
		for (int i = 0; i < trainingSetLength; i++) {
			sum = sum + java.lang.Math.pow((hypothesis.evaluate(trainingSet[i].getX()) - trainingSet[i].getY()), 2);
		}
		return sum;
	}

	public double evaluateDerivativeTheta0(double theta0, double theta1) {
		HypothesisLinearRegression hypothesis = new HypothesisLinearRegression(theta0, theta1);
		double sumOfDerivativeTheta0SquaredDifferences = this.evaluateSumofDerivativeTheta0Differences(hypothesis);
		return 1.0 / trainingSetLength * sumOfDerivativeTheta0SquaredDifferences;
	}

	private double evaluateSumofDerivativeTheta0Differences(HypothesisLinearRegression hypothesis) {
		double sum = 0;
		for (int i = 0; i < trainingSetLength; i++) {
			sum = sum + hypothesis.evaluate(trainingSet[i].getX()) - trainingSet[i].getY();
		}
		return sum;
	}

	public double evaluateDerivativeTheta1(double theta0, double theta1) {
		HypothesisLinearRegression hypothesis = new HypothesisLinearRegression(theta0, theta1);
		double sumOfDerivativeTheta1SquaredDifferences = this.evaluateSumofDerivativeTheta1Differences(hypothesis);
		return 1.0 / trainingSetLength * sumOfDerivativeTheta1SquaredDifferences;
	}

	private double evaluateSumofDerivativeTheta1Differences(HypothesisLinearRegression hypothesis) {
		double sum = 0;
		for (int i = 0; i < trainingSetLength; i++) {
			sum = sum + (hypothesis.evaluate(trainingSet[i].getX()) - trainingSet[i].getY()) * trainingSet[i].getX();
		}
		return sum;
	}
}
