package question1;

public class Triangle implements Shape {
	
	@Override
	public double getArea(double a, double b) {
		return a * b * 0.5;
	}
}
