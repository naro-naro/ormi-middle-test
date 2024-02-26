package question2;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int inputNum;
		boolean isPrimeNum = true;
		
		Scanner input = new Scanner(System.in);
		inputNum = input.nextInt();
		
		for (int i=2; i<inputNum; i++) {
			if (inputNum % i == 0) {
				isPrimeNum = false;
				break;
			}
		}
		
		System.out.println(isPrimeNum);
		
	}
}