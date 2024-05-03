package practice03;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("매수금액을 입력하세요: ");
		int purchaseAmount = scanner.nextInt();
		System.out.print("매도금액을 입력하세요: ");
		int saleAmount = scanner.nextInt();
		double trasferTax;
		if (saleAmount>purchaseAmount) {
			trasferTax=(saleAmount-purchaseAmount)*22/100;
		} else {
			trasferTax=0;
		}
		System.out.println("양도세 = "+trasferTax);
		scanner.close();
	}
}
