package arithmetic.model;

public class SquareRoot implements ArithmeticOperation {

	@Override
	public double compute(double a, double b) {
		return Math.sqrt(a);
	}

	@Override
	public char getSign() {
		return 'a';
	}
}
