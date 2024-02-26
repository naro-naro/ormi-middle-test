package question3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExchangeExample {
	public static void main(String[] args) {
		WonIntoDollar wonIntoDollar = new WonIntoDollar();
		WonIntoYen wonIntoYen = new WonIntoYen();
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner input = new Scanner(System.in);
		System.out.println("원하시는 환전의 번호를 입력해주세요. (원->달러:1, 원->엔:2)");
		int num = input.nextInt();
		
		if (num == 1) {
			System.out.println("환전할 금액을 원화로 입력해 주세요.");
			System.out.print("원(KRW) = ");
			int won1 = input.nextInt();
			System.out.println("달러($) = " + df.format(wonIntoDollar.exchange(won1)));
		} else if (num == 2) {
			System.out.println("환전할 금액을 원화로 입력해 주세요.");
			System.out.print("원(KRW) = ");
			int won2 = input.nextInt();
			System.out.println("JPY = " + df.format(wonIntoYen.exchange(won2)));
		} else {
			System.out.println("올바른 환전 번호가 아닙니다.");
		}

	}

}
