package practice07;

import java.util.Scanner;

public class ComputeInterest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int principal, years=0;
		double rate, balance;
		System.out.print("원금을 입력하세요: ");
		principal = scanner.nextInt();
		System.out.print("연이율을 입력하세요: ");
		rate = scanner.nextDouble();
//		System.out.println("연도수"+"\t"+"원리금");
		balance = principal;
		System.out.println("연도수 \t원리금");
		do {
			years++;
			balance = balance*(1.0+rate/100.0);
			System.out.println(years+"\t"+balance);
		} while (balance <= principal*2.0);
		System.out.println("\n필요한 연도수 = "+years);
//		for (years = 1; balance<=principal*2; years++) {
//				balance = balance*(1.0+rate/100.0);	
//				System.out.println(years+"\t"+balance);
//		}
//		System.out.println("필요한 연도수 = "+(years-1));
//		System.out.println();
		scanner.close();
	}
}
