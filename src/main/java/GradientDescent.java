
public class GradientDescent {
	private CostFunction costFunction;
	private double threshold = 1E-11;
	
	private double theta0;
	private double theta1;
	
	public GradientDescent(CostFunction costFunction) {
		this.costFunction = costFunction;
	}
	
	public double getTheta0() {
		return theta0;
	}
	
	public double getTheta1() {
		return theta1;
	}
	
	public void train(double learningRate) {
		double theta0old = 0;
		double theta1old = 0;
		double theta0new = 0;
		double theta1new = 0;
		do {
			theta0old = theta0new;
			theta1old = theta1new;
			theta0new = theta0old - learningRate * costFunction.evaluateDerivativeTheta0(theta0old, theta1old);
			theta1new = theta1old - learningRate * costFunction.evaluateDerivativeTheta1(theta0old, theta1old);
		} while (java.lang.Math.abs((theta0old - theta0new)) > threshold || java.lang.Math.abs((theta1old - theta1new)) > threshold);
		this.theta0 = theta0new;
		this.theta1 = theta1new;
	}
}
