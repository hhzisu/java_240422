package practice04;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		int a;
		int money = 0;
		int dollar; 
		int res;
		Scanner scanner = new Scanner(System.in);
		System.out.print("가구수를 입력하시오>>");
		a = scanner.nextInt();
		if (a==1) {
			money = 400000;}
		if (a==2) {
			money = 600000;}
		if (a==3) {
			money = 800000;}
		if (a>=4) {
			money = 1000000;}
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
