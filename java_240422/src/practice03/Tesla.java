package practice03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		int tesla=520;
		int num; //수량
		int money;//tesla*num
		int res;//계산된 결과 값
		Scanner scanner = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오>>");
		num = scanner.nextInt();
		money = tesla * num;
		
		res = money/100;  //money를 가지고 100달러를 계산
		if (res>0) {
			System.out.println("100달러짜리 "+res+"매");}
		money = money%100;
		res = money/10;
		if (res>0) {
			System.out.println("10달러짜리 "+res+"매");}
			
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("매수 수량을 입력하시오>>");
//		int a = scanner.nextInt();
//		int dollar = a*520;
//		int hundred = dollar/100;
//		int ten = dollar%100/10;
//		if (ten==0) {
//			System.out.println("100달러짜리 "+hundred+"매");
//		}else {
//			System.out.println("100달러짜리 "+hundred+"매");
//			System.out.println("10달러짜리 "+ten+"매");
//		}
		scanner.close();
	}
}
