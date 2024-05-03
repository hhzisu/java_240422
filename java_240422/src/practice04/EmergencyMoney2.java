package practice04;

import java.util.Scanner;

public class EmergencyMoney2 {
	static void main(String[] args) {
		int a;
		int money = 0;
		int dollar; 
		int res;
		Scanner scanner = new Scanner(System.in);
		System.out.print("가구수를 입력하시오>>");
		a = scanner.nextInt();
		switch (a) {
		case 1:
			money = 400000;
			break;
		case 2:
			money = 600000;
			break;
		case 3:
			money = 800000;
			break;
		default:
			money = 1000000;		
		}
		dollar = money/1200;
		res = dollar/100;
		if (res>0) {
			System.out.println("100달러짜리 "+res+"매");
		}
		res = dollar%100/10;
		if (res>0) {
			System.out.println("10달러짜리 "+res+"매");
		}
		scanner.close();
	}
}
