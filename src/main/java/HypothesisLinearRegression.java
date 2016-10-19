
public class HypothesisLinearRegression {
	private double theta0;
	private double theta1;
	
	public HypothesisLinearRegression(double theta0, double theta1) {
		this.theta0 = theta0;
		this.theta1 = theta1;
	}
	
	public double evaluate(double x) {
		return theta0 + theta1 * x;
	}
}
