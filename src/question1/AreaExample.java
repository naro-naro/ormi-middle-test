package question1;

import java.util.Scanner;

public class AreaExample {
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		
		Scanner input = new Scanner(System.in);
		System.out.println("넓이를 구하고자 하는 도형의 번호를 입력해주세요. (원:1, 직사각형:2, 삼각형:3)");
		int shape = input.nextInt();
		
		if (shape == 1) {
			System.out.println("원의 반지름을 두 번 입력해주세요. (같은 값이어야 함)");
			double radius1 = input.nextDouble();
			double radius2 = input.nextDouble();
			System.out.println("원의 넓이 : " + circle.getArea(radius1, radius2));
		} else if (shape == 2) {
			System.out.println("직사각형의 가로길이와 세로길이를 입력해주세요.");
			double width = input.nextDouble();
			double height = input.nextDouble();
			System.out.println("직사각형의 넓이 : " + rectangle.getArea(width, height));
		} else if (shape == 3) {
			System.out.println("삼각형의 밑변과 높이를 입력해 주세요.");
			double base = input.nextDouble();
			double height = input.nextDouble();
			System.out.println("삼각형의 넓이 : " + triangle.getArea(base, height));
		} else {
			System.out.println("올바른 도형 번호가 아닙니다.");
		}
		
		

	}
}