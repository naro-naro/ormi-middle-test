package question1;

public class Circle implements Shape {
		
	@Override
	public double getArea(double a, double b) {
		if (a == b) {
			return a * b * PI;	
		} else {
			System.out.println("같은 반지름의 값을 두 번 입력해 주세요!");
			return -1;
		}
	}
}
